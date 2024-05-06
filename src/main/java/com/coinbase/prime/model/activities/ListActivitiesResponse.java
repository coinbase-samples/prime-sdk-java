package com.coinbase.prime.model.activities;

import com.coinbase.prime.model.common.Pagination;

public class ListActivitiesResponse {
    private Activity[] activities;
    private Pagination pagination;
    private ListActivitiesRequest request;

    public ListActivitiesResponse() {
    }

    public ListActivitiesResponse(Builder builder) {
        this.activities = builder.activities;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListActivitiesRequest getRequest() {
        return request;
    }

    public void setRequest(ListActivitiesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Activity[] activities;
        private Pagination pagination;
        private ListActivitiesRequest request;

        public Builder activities(Activity[] activities) {
            this.activities = activities;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListActivitiesRequest request) {
            this.request = request;
            return this;
        }

        public ListActivitiesResponse build() {
            return new ListActivitiesResponse(this);
        }
    }
}
