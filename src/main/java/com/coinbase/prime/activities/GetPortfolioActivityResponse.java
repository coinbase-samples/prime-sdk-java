package com.coinbase.prime.activities;

import com.coinbase.prime.model.Activity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for getting a portfolio activity by activity ID.
 */
public class GetPortfolioActivityResponse {
    @JsonProperty("activity")
    private Activity activity;

    public GetPortfolioActivityResponse() {
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}