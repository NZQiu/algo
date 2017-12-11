package max;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StockMaxProfitTest {

    @Test
    public void calculateEmpty() {
        int result = StockMaxProfit.calculate(null);
        assertEquals(result, 0);
    }

    @Test
    public void calculate() {
        List<Integer> priceList = Arrays.asList(1, 2, 3, 4);
        int result = StockMaxProfit.calculate(priceList);
        assertEquals(result, 3);

        priceList = Arrays.asList(4, 3, 2, 1);
        result = StockMaxProfit.calculate(priceList);
        assertEquals(result, 0);

        priceList = Arrays.asList(1, 4, 2, 9);
        result = StockMaxProfit.calculate(priceList);
        assertEquals(result, 8);
    }

}