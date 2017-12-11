package bit;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitTest {

    @Test
    public void numberOfOnes() {
        assertEquals(0, Bit.numberOfOnes(0));
        assertEquals(1, Bit.numberOfOnes(1));
        assertEquals(1, Bit.numberOfOnes(2));
        assertEquals(2, Bit.numberOfOnes(3));
        assertEquals(1, Bit.numberOfOnes(4));
    }

}