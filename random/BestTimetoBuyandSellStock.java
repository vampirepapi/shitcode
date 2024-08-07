public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        // Initialize left and right pointers
        int l = 0, r = 1;
        // Initialize the variable to store the maximum profit
        int maxProfit = 0;

        // Iterate through the prices array
        while (r < prices.length) {
            // Check if the current price is greater than the price at the left pointer
            if (prices[r] > prices[l]) {
                // Calculate the profit by subtracting the left price from the current price
                // Update the maximum profit if the calculated profit is greater
                maxProfit = Math.max(maxProfit, (prices[r] - prices[l]));
            } else {
                // If the current price is not greater, update the left pointer to the current position
                l = r;
            }
            // Move the right pointer to the next position
            r++;
        }

        // Return the maximum profit obtained
        return maxProfit;
    }
}
