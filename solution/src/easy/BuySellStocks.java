package easy;

public class BuySellStocks {

    public static void main(String[] args) {
        final int[] stocks = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(stocks));
    }

    private static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else if ((price - buy) > profit) {
                profit = price - buy;
            }
        }

        return profit;
    }
}
