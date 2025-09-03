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

package com.coinbase.prime.orders;

import com.coinbase.prime.model.LimitOrderEdit;
import com.coinbase.prime.model.OrderEdit;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListOrderEditHistoryResponse {
    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("order_edit_history")
    private List<LimitOrderEdit> orderEditHistory;

    @JsonProperty("edit_history")
    private List<OrderEdit> editHistory;

    public ListOrderEditHistoryResponse() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<LimitOrderEdit> getOrderEditHistory() {
        return orderEditHistory;
    }

    public void setOrderEditHistory(List<LimitOrderEdit> orderEditHistory) {
        this.orderEditHistory = orderEditHistory;
    }

    public List<OrderEdit> getEditHistory() {
        return editHistory;
    }

    public void setEditHistory(List<OrderEdit> editHistory) {
        this.editHistory = editHistory;
    }
}