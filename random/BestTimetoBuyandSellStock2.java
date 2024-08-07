public class BestTimetoBuyandSellStock2 {
    // Method to calculate the maximum profit from buying and selling stocks
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int start = 0; start < prices.length; start++) {
            for (int end = start + 1; end < prices.length; end++) {
                int profit = prices[end] - prices[start];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example prices array
        int[] prices = {1, 2, 3, 4, 5};
        
        // Print the result of the maxProfit method
        System.out.println(maxProfit(prices));
    }

}