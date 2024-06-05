/*
 * *
 *  * Copyright 2024-present Coinbase Global, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.coinbase.prime.model.activities;

public class GetActivityByActivityIdResponse {
    private Activity activity;
    private GetActivityByActivityIdRequest request;

    public GetActivityByActivityIdResponse() {
    }

    public GetActivityByActivityIdResponse(Builder builder) {
        this.activity = builder.activity;
        this.request = builder.request;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public GetActivityByActivityIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetActivityByActivityIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Activity activity;
        private GetActivityByActivityIdRequest request;

        public Builder activity(Activity activity) {
            this.activity = activity;
            return this;
        }

        public Builder request(GetActivityByActivityIdRequest request) {
            this.request = request;
            return this;
        }

        public GetActivityByActivityIdResponse build() {
            return new GetActivityByActivityIdResponse(this);
        }
    }
}
