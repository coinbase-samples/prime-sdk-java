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

package com.coinbase.prime.serialization;

import com.coinbase.prime.activities.GetActivityRequest;
import com.coinbase.prime.activities.ListPortfolioActivitiesRequest;
import com.coinbase.prime.allocations.GetAllocationRequest;
import com.coinbase.prime.allocations.ListPortfolioAllocationsRequest;
import com.coinbase.prime.assets.ListAssetsRequest;
import com.coinbase.prime.balances.GetWalletBalanceRequest;
import com.coinbase.prime.balances.ListPortfolioBalancesRequest;
import com.coinbase.prime.commission.GetPortfolioCommissionRequest;
import com.coinbase.prime.financing.GetMarginInformationRequest;
import com.coinbase.prime.financing.ListExistingLocatesRequest;
import com.coinbase.prime.futures.GetEntityFcmBalanceRequest;
import com.coinbase.prime.orders.GetOrderByOrderIdRequest;
import com.coinbase.prime.orders.ListOpenOrdersRequest;
import com.coinbase.prime.paymentmethods.GetPaymentMethodDetailsRequest;
import com.coinbase.prime.paymentmethods.ListPaymentMethodsRequest;
import com.coinbase.prime.portfolios.GetPortfolioRequest;
import com.coinbase.prime.portfolios.ListPortfoliosRequest;
import com.coinbase.prime.transactions.GetTransactionRequest;
import com.coinbase.prime.transactions.ListPortfolioTransactionsRequest;
import com.coinbase.prime.wallets.GetWalletRequest;
import com.coinbase.prime.wallets.ListWalletsRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests verifying request construction with minimal required parameters
 * Validates that requests can be built with only required fields (no nulls passed)
 * Core-java handles null-free serialization automatically
 */
public class RequestSerializationTest {

    @Test
    public void testListPortfolioActivitiesRequestConstruction() {
        ListPortfolioActivitiesRequest request = new ListPortfolioActivitiesRequest.Builder("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetActivityRequestConstruction() {
        GetActivityRequest request = new GetActivityRequest("activity-456");
        assertNotNull(request);
        assertEquals("activity-456", request.getActivityId());
    }

    @Test
    public void testListPortfolioAllocationsRequestConstruction() {
        ListPortfolioAllocationsRequest request = new ListPortfolioAllocationsRequest.Builder("portfolio-789")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-789", request.getPortfolioId());
    }

    @Test
    public void testGetAllocationRequestConstruction() {
        GetAllocationRequest request = new GetAllocationRequest.Builder("portfolio-123", "allocation-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("allocation-456", request.getAllocationId());
    }

    @Test
    public void testListAssetsRequestConstruction() {
        ListAssetsRequest request = new ListAssetsRequest.Builder("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListPortfolioBalancesRequestConstruction() {
        ListPortfolioBalancesRequest request = new ListPortfolioBalancesRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetWalletBalanceRequestConstruction() {
        GetWalletBalanceRequest request = new GetWalletBalanceRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testGetPortfolioCommissionRequestConstruction() {
        GetPortfolioCommissionRequest request = new GetPortfolioCommissionRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetMarginInformationRequestConstruction() {
        GetMarginInformationRequest request = new GetMarginInformationRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListExistingLocatesRequestConstruction() {
        ListExistingLocatesRequest request = new ListExistingLocatesRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetEntityFcmBalanceRequestConstruction() {
        GetEntityFcmBalanceRequest request = new GetEntityFcmBalanceRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListOpenOrdersRequestConstruction() {
        ListOpenOrdersRequest request = new ListOpenOrdersRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetOrderByOrderIdRequestConstruction() {
        GetOrderByOrderIdRequest request = new GetOrderByOrderIdRequest.Builder()
                .portfolioId("portfolio-123")
                .orderId("order-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("order-456", request.getOrderId());
    }

    @Test
    public void testListPaymentMethodsRequestConstruction() {
        ListPaymentMethodsRequest request = new ListPaymentMethodsRequest.Builder("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetPaymentMethodDetailsRequestConstruction() {
        GetPaymentMethodDetailsRequest request = new GetPaymentMethodDetailsRequest.Builder()
                .entityId("entity-123")
                .paymentMethodId("payment-456")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
        assertEquals("payment-456", request.getPaymentMethodId());
    }

    @Test
    public void testListPortfoliosRequestConstruction() {
        ListPortfoliosRequest request = new ListPortfoliosRequest.Builder().build();
        assertNotNull(request);
    }

    @Test
    public void testGetPortfolioRequestConstruction() {
        GetPortfolioRequest request = new GetPortfolioRequest.Builder("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetTransactionRequestConstruction() {
        GetTransactionRequest request = new GetTransactionRequest.Builder("portfolio-123", "txn-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("txn-456", request.getTransactionId());
    }

    @Test
    public void testListPortfolioTransactionsRequestConstruction() {
        ListPortfolioTransactionsRequest request = new ListPortfolioTransactionsRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testListWalletsRequestConstruction() {
        ListWalletsRequest request = new ListWalletsRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetWalletRequestConstruction() {
        GetWalletRequest request = new GetWalletRequest.Builder("portfolio-123", "wallet-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testRequestWithOptionalFieldsBuildsSuccessfully() {
        // Verify requests can be built without setting optional fields
        ListPortfolioActivitiesRequest request = new ListPortfolioActivitiesRequest.Builder("portfolio-123")
                .build();

        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        // Optional fields are null or have default values, which is expected
    }
}
