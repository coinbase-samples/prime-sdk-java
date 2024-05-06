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
