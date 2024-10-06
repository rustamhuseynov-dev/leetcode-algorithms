package example_too;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7,10,9,5,7,6};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;            }
        }
        return maxProfit;
    }
}
