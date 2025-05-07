/*
 * Copyright 2025-present Coinbase Global, Inc.
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

package com.coinbase.prime.financing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateNewLocatesResponse {
  @JsonProperty("locate_id")
  private String locateId;

  public CreateNewLocatesResponse() {
  }

  public CreateNewLocatesResponse(CreateNewLocatesResponse.Builder builder) {
    this.locateId = builder.locateId;
  }

  public String getLocateId() {
    return locateId;
  }

  public void setLocateId(String locateId) {
    this.locateId = locateId;
  }

  public static class Builder {
    private String locateId;

    public Builder() {
    }

    public CreateNewLocatesResponse.Builder withLocateId(String locateId) {
      this.locateId = locateId;
      return this;
    }

    public CreateNewLocatesResponse build() {
      return new CreateNewLocatesResponse(this);
    }
  }
}
