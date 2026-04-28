/*
 * Copyright 2026-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.tools.sdkgenerator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright year handling: resolves years from Git first-commit dates where possible, and
 * normalizes generated SDK file content via {@link #applyCopyrightYear(Path, String)}.
 *
 * <p>Mirrors the behavior of the .NET generator's CopyrightHelper. Newly emitted files use
 * the year of the first commit that added the generator anchor file ({@code RequestPhase.java}).
 * Files that already exist on disk preserve their existing on-disk year.
 */
public final class CopyrightHelper {

    private static final Pattern COPYRIGHT_YEAR_PATTERN =
            Pattern.compile("Copyright (\\d{4})-present");
    private static final Pattern COPYRIGHT_REPLACE_PATTERN =
            Pattern.compile("Copyright \\d{4}-present");

    private static int sdkEmittedCopyrightYear;

    private CopyrightHelper() {}

    /**
     * Calendar year used in newly emitted Java file headers (requests, responses, services,
     * factory). Set by {@link #initializeSdkEmittedCopyrightYear(Path)} from Git; falls back to
     * UTC year if unset.
     */
    public static int getSdkEmittedCopyrightYear() {
        return sdkEmittedCopyrightYear > 0
                ? sdkEmittedCopyrightYear
                : ZonedDateTime.now(ZoneOffset.UTC).getYear();
    }

    /**
     * Resolves the year from the first commit that added
     * {@code tools/model-generator/src/main/java/com/coinbase/tools/sdkgenerator/phases/RequestPhase.java},
     * used as the copyright year for all holistically generated Java surface files.
     */
    public static void initializeSdkEmittedCopyrightYear(Path projectRoot) {
        Path anchor =
                projectRoot
                        .resolve("tools/model-generator/src/main/java/com/coinbase/tools/sdkgenerator/phases/RequestPhase.java");
        sdkEmittedCopyrightYear = getFirstCommitYearForPath(projectRoot, anchor);
    }

    /**
     * Returns the commit year (UTC) of the first commit that added {@code absolutePath}, or the
     * current UTC year if Git is unavailable or the file is not yet tracked.
     */
    public static int getFirstCommitYearForPath(Path gitRepositoryRoot, Path absolutePath) {
        try {
            Path full = absolutePath.toAbsolutePath().normalize();
            Path root = gitRepositoryRoot.toAbsolutePath().normalize();
            if (!full.startsWith(root)) {
                return ZonedDateTime.now(ZoneOffset.UTC).getYear();
            }
            String relPosix = root.relativize(full).toString().replace('\\', '/');

            ProcessBuilder pb =
                    new ProcessBuilder(
                                    "git",
                                    "log",
                                    "--diff-filter=A",
                                    "--format=%cs",
                                    "--reverse",
                                    "--",
                                    relPosix)
                            .directory(root.toFile())
                            .redirectErrorStream(false);
            Process proc = pb.start();
            String output;
            try (var in = proc.getInputStream()) {
                output = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            }
            proc.waitFor();
            String firstLine =
                    output.lines()
                            .map(String::trim)
                            .filter(s -> !s.isEmpty())
                            .findFirst()
                            .orElse(null);
            if (firstLine == null || firstLine.length() < 4) {
                return ZonedDateTime.now(ZoneOffset.UTC).getYear();
            }
            try {
                return Integer.parseInt(firstLine.substring(0, 4));
            } catch (NumberFormatException ex) {
                return ZonedDateTime.now(ZoneOffset.UTC).getYear();
            }
        } catch (IOException | InterruptedException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return ZonedDateTime.now(ZoneOffset.UTC).getYear();
        }
    }

    /**
     * Standard Apache 2.0 comment block for generated Java files using the given copyright year.
     */
    public static String javaFileHeader(int year) {
        return "/*\n"
                + " * Copyright "
                + year
                + "-present Coinbase Global, Inc.\n"
                + " *\n"
                + " *  Licensed under the Apache License, Version 2.0 (the \"License\");\n"
                + " *  you may not use this file except in compliance with the License.\n"
                + " *  You may obtain a copy of the License at\n"
                + " *\n"
                + " *  http://www.apache.org/licenses/LICENSE-2.0\n"
                + " *\n"
                + " *  Unless required by applicable law or agreed to in writing, software\n"
                + " *  distributed under the License is distributed on an \"AS IS\" BASIS,\n"
                + " *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
                + " *  See the License for the specific language governing permissions and\n"
                + " *  limitations under the License.\n"
                + " */\n\n";
    }

    /** Convenience wrapper using the SDK-emitted copyright year. */
    public static String javaFileHeader() {
        return javaFileHeader(getSdkEmittedCopyrightYear());
    }

    /**
     * Replaces the hardcoded copyright year in {@code content} with:
     *
     * <ul>
     *   <li>The existing year from the on-disk file at {@code outputPath} (if it exists), or
     *   <li>{@link #getSdkEmittedCopyrightYear()} for brand-new generated files.
     * </ul>
     */
    public static String applyCopyrightYear(Path outputPath, String content) {
        String targetYear;
        if (outputPath != null && Files.exists(outputPath)) {
            try {
                String onDisk = Files.readString(outputPath);
                Matcher m = COPYRIGHT_YEAR_PATTERN.matcher(onDisk);
                targetYear =
                        m.find() ? m.group(1) : Integer.toString(getSdkEmittedCopyrightYear());
            } catch (IOException ex) {
                targetYear = Integer.toString(getSdkEmittedCopyrightYear());
            }
        } else {
            targetYear = Integer.toString(getSdkEmittedCopyrightYear());
        }
        return COPYRIGHT_REPLACE_PATTERN
                .matcher(content)
                .replaceAll("Copyright " + targetYear + "-present");
    }
}
