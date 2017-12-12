package sort;

public class ArraySplit {

    /*
     * Given array in and index i, reorder the array such that
     * first part < in[i], second part = in[i], and last part > in[i]
     */
    public static int[] split(int[] input, int i) {
        if (input == null || input.length <= 1) return input;
        if (i < 0 || i >= input.length) return input;

        int start = 0;
        int end = input.length - 1;

        int val = input[i];
        int tmp;
        while (start + 1 < end) {
            while (input[start] < val) {
                start++;
            }

            while (input[end] >= val) {
                end--;
            }

            tmp = input[start];
            input[start] = input[end];
            input[end] = tmp;

            start++;
            end--;
        }

        end = input.length - 1;
        while (start + 1 < end) {
            while (input[start] == val) {
                start++;
            }

            while (input[end] > val) {
                end--;
            }

            tmp = input[start];
            input[start] = input[end];
            input[end] = tmp;

            start++;
            end--;
        }
        return input;
    }
}
