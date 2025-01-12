import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", "10", doArgumentTest(Csiga.class, "2", "4", "5"));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", "22", doArgumentTest(Csiga.class, "2", "4", "5", "7", "11"));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", "22", doArgumentTest(Csiga.class, "2", "11"));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", "600", doArgumentTest(Csiga.class, "300"));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", "60", doArgumentTest(Csiga.class, "5", "5", "5", "8", "22", "30"));
    }
}