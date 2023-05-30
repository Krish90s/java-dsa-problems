package org.example.StockProfit;

public class StockProfit {

    int[] prices;


    public StockProfit(int[] prices) {
        setPrices(prices);
    }

    public int[] getPrices() {
        return prices;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    public int stockProfitBruteForce() {
        int maxProfit = 0;
        int n = prices.length;

        for (int i = 0; i < n ; i++) {
            for (int j = 1 ; j < n ; j++ ) {

                int profit = prices[j] - prices[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public int stockProfitEfficient() {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;

        for (int i =0 ; i < n ; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            else if( prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }

        }

      return maxProfit;

    }
}
