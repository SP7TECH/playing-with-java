package beginner.Arrays;

public class BuyAndSellStocks {
    public static int buySellStocks(int price[]) {
        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        if(price.length == 0) return maxProfit;

        for(int i = 0; i < price.length; i++) {
            if(buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }

        return maxProfit;
    }
    
    public static void main(String[] args) {
        int stockPrice[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit — " + buySellStocks(stockPrice));
    }    
}
