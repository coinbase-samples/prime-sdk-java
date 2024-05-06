package com.coinbase.prime.model.users;

import com.coinbase.prime.model.common.Pagination;

public class ListUsersResponse {
    private User[] users;
    private Pagination pagination;
    private ListUsersRequest request;

    public ListUsersResponse() {
    }

    public ListUsersResponse(Builder builder) {
        this.users = builder.users;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListUsersRequest getRequest() {
        return request;
    }

    public void setRequest(ListUsersRequest request) {
        this.request = request;
    }

    public static class Builder {
        private User[] users;
        private Pagination pagination;
        private ListUsersRequest request;

        public Builder() {
        }

        public Builder users(User[] users) {
            this.users = users;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListUsersRequest request) {
            this.request = request;
            return this;
        }

        public ListUsersResponse build() {
            return new ListUsersResponse(this);
        }
    }
}
