
# CoinbaseEngPrimeActivityApiAllocationMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalBaseSize** | **String** | The total base size of order being allocated | 
**totalQuoteSize** | **String** | The total quote size of order being allocated | 
**averagePrice** | **String** | The average price of the allocations | 
**rootId** | **String** | The root id of the allocation | 
**orderIds** | **List&lt;String&gt;** | The order ids of the allocation | 
**portfolioIds** | **List&lt;String&gt;** | The portfolios ids of the allocation |  [optional]
**selfAllocatedBaseSize** | **String** | The self allocated or remainder base size of the allocation |  [optional]
**selfAllocatedQuoteSize** | **String** | The self allocated or remainder quote size of the allocation |  [optional]
**selfAllocatedPercentage** | **String** | The self allocated or remainder percentage size of the allocation |  [optional]
**allocatedBaseSize** | **String** | Total amount of base currency allocated. For allocation out, this is a sum across all legs. For allocation in, this is the total amount in base allocated to/from the current portfolio. | 
**allocatedQuoteSize** | **String** | Amount of quote currency allocated excluding fees. For allocation out, this is a sum across all allocation legs. For allocation in, this is the amount in quote allocated to/from the current portfolio. | 
**allocatedCommission** | **String** | Total commision paid by destination portfolio, in quote. For allocation out, this is a sum of fees paid by each destination portfolio. | 
**sourcePortfolioId** | **String** | The source portfolio id for the allocation. | 
**allocationLegIds** | **List&lt;String&gt;** | The allocation leg ids of the allocation | 
**reversedAllocationId** | **String** | The reversed allocation id for reference |  [optional]
**sourcePortfolioIds** | **List&lt;String&gt;** | The source portfolio ids for the allocation. |  [optional]
**destinationPortfolioIds** | **List&lt;String&gt;** | The destination portfolio id for the allocation. |  [optional]
**allocationNettingId** | **String** | The netting id for the allocation. |  [optional]
**clientNettingId** | **String** | The client netting id for the allocation. |  [optional]



