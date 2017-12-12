package var;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MulStrTest {

    @Test
    public void calculate() {
        MulStr s = new MulStr("1", "600");
        assertEquals(String.valueOf(1 * 600), s.calculate());

        s = new MulStr("123", "5678");
        assertEquals(String.valueOf(123* 5678), s.calculate());

        s = new MulStr("0111", "12121");
        assertEquals(String.valueOf(111* 12121), s.calculate());

        s = new MulStr("0", "123456");
        assertEquals(String.valueOf(0 * 123456), s.calculate());

        s = new MulStr("", "123456");
        assertEquals("0", s.calculate());
    }
}