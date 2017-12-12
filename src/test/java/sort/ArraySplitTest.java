package sort;

import org.junit.Test;


public class ArraySplitTest {

    @Test
    public void split() {
        int[] input = new int[]{6, 5, 5, 7, 9, 4, 3, 3, 4, 6, 8, 4, 7, 9, 2, 1};
        int[] out = ArraySplit.split(input, 5);
        for (int i = 0; i < out.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(out[i]);
        }
    }
}