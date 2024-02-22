public class BestTimetoBuyandSellStock2 {
    // Method to calculate the maximum profit from buying and selling stocks
    public static int maxProfit(int[] prices) {
        int profit = 0; // Variable to store the total profit

        // Iterate through the prices array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // Check if the current price is greater than the previous one
            if (prices[i] > prices[i - 1]) {
                // If true, calculate the profit and add it to the total profit
                profit += (prices[i] - prices[i - 1]);
            }
        }

        return profit; // Return the total profit
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example prices array
        int[] prices = {1, 2, 3, 4, 5};
        
        // Print the result of the maxProfit method
        System.out.println(maxProfit(prices));
    }
}