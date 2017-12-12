package var;

public class Bit {

    public static int numberOfOnes(int i) {
        int count = 0;
//        Eliminate the last 1
//        Time: O(count) > O(n)
        while (i > 0) {
            count++;
            i &= (i-1);
        }
        return count;
    }
//    i & !(i-1): get the last 1
//    i = 0b1010110 -> (i-1) = 0b1010101 -> !(i-1) = 0b0101010 ->  i & !(i-1) = 0b0000010


//    a^0 = a; a^1 = !a
    public static int swapBit(int x, int i, int j) {
        if ( ((x >> i) & 1) != ((x >> j) & 1)) { // if i != j
            x ^= (1 << i) | (1 << j); // Reverse i and j var: a^1 = !a: 0^1 = 1; 1^1 = 0;
        }
        return x;
    }
}
