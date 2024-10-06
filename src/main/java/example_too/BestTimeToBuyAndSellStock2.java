package example_too;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0; // Ümumi maksimum mənfəət

        for (int i = 1; i < prices.length; i++) {
            // Əgər qiymət yüksəlibsə, mənfəət əlavə edirik
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

}
