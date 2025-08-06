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

package com.coinbase.prime.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response confirming address book entry deletion
 */
public class DeleteAddressBookEntryResponse {
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("activity_id")
    private String activityId;
    @JsonProperty("message")
    private String message;
    
    public DeleteAddressBookEntryResponse() {
    }
    
    public DeleteAddressBookEntryResponse(Boolean success, String activityId, String message) {
        this.success = success;
        this.activityId = activityId;
        this.message = message;
    }
    
    public Boolean getSuccess() {
        return success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    
    public String getActivityId() {
        return activityId;
    }
    
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}