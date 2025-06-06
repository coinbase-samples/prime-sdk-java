/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.activities;

import com.coinbase.prime.model.Activity;

public class GetActivityByActivityIdResponse {
    private Activity activity;

    public GetActivityByActivityIdResponse() {
    }

    public GetActivityByActivityIdResponse(Builder builder) {
        this.activity = builder.activity;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public static class Builder {
        private Activity activity;

        public Builder activity(Activity activity) {
            this.activity = activity;
            return this;
        }

        public GetActivityByActivityIdResponse build() {
            return new GetActivityByActivityIdResponse(this);
        }
    }
}
