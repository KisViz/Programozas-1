import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 1, Double.parseDouble(doArgumentTest(ZhEredmenyek.class, "1")), 0.01);
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 5, Double.parseDouble(doArgumentTest(ZhEredmenyek.class, "0", "10")), 0.01);
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 4, Double.parseDouble(doArgumentTest(ZhEredmenyek.class, "1", "4", "6", "5")), 0.01);
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 4.5, Double.parseDouble(doArgumentTest(ZhEredmenyek.class, "4", "5")), 0.01);
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 6.625, Double.parseDouble(doArgumentTest(ZhEredmenyek.class, "4", "3", "8", "10", "10", "10", "2", "6")), 0.01);
    }
}