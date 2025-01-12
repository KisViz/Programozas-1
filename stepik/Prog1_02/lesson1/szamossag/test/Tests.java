import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", "pozitivbol van tobb", doArgumentTest(Szamossag.class, "2", "5", "8", "11"));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", "pozitivbol van tobb", doArgumentTest(Szamossag.class, "2", "-5", "-8", "11", "77"));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", "pozitivbol van tobb", doArgumentTest(Szamossag.class, "-2", "5", "8", "11"));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", "negativbol van tobb", doArgumentTest(Szamossag.class, "-2", "5", "-8", "-11"));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", "negativbol van tobb", doArgumentTest(Szamossag.class, "-51", "-11", "-73", "0"));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", "mind a kettobol ugyanannyi van", doArgumentTest(Szamossag.class, "2", "5", "8", "11", "-55", "-12", "-1", "-22"));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", "mind a kettobol ugyanannyi van", doArgumentTest(Szamossag.class));
    }

    @Test
    public void teszt_08() {
        assertEquals("Hibas eredmeny", "mind a kettobol ugyanannyi van", doArgumentTest(Szamossag.class, "1", "-2"));
    }

    @Test
    public void teszt_09() {
        assertEquals("Hibas eredmeny", "pozitivbol van tobb", doArgumentTest(Szamossag.class, "2", "0", "0"));
    }

    @Test
    public void teszt_10() {
        assertEquals("Hibas eredmeny", "negativbol van tobb", doArgumentTest(Szamossag.class, "-3", "0", "0"));
    }

    @Test
    public void teszt_11() {
        assertEquals("Hibas eredmeny", "mind a kettobol ugyanannyi van", doArgumentTest(Szamossag.class, "0", "0", "0", "0", "0"));
    }
}