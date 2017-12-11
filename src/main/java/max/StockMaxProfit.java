package max;

import java.util.List;


public class StockMaxProfit {

    public static int calculate(List<Integer> priceList) {
        if (null == priceList || priceList.size() == 0) return 0;

        int profit = 0;
        int min = priceList.get(0);
        for (int price : priceList) {
            profit = Math.max(profit, price - min);
            min = Math.min(min, price);
        }
        return profit;
    }

}
