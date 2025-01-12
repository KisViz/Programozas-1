import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "0", "1", "0", "1", "0", "1", "1", "0", "0"));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "0", "-1", "-1", "0", "-1", "-1", "0", "1", "1"));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "0", "0", "0", "1", "0", "-1", "-1", "1", "1"));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "0", "1", "0", "0", "1", "-1", "1", "1", "0"));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", "Nincs nyertes",  doArgumentTest(A.class, "0", "1", "0", "1", "1", "0", "0", "0", "1"));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "-1", "-1", "0", "-1", "0", "1", "0", "1", "-1"));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "0", "1", "1", "0", "1", "1", "0", "0", "0"));
    }

    @Test
    public void teszt_08() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "0", "1", "1", "0", "-1", "1", "0", "-1", "0"));
    }

    @Test
    public void teszt_09() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "0", "0", "1", "0", "0", "1", "-1", "1", "1"));
    }

    @Test
    public void teszt_10() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "-1", "-1", "0", "1", "1", "1", "-1", "0", "0"));
    }

    @Test
    public void teszt_11() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "0", "-1", "0", "0", "0", "1", "1", "1", "1"));
    }

    @Test
    public void teszt_12() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "1", "0", "0", "0", "1", "0", "0", "1", "1"));
    }

    @Test
    public void teszt_13() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "-1", "0", "1", "0", "1", "1", "0", "0", "1"));
    }

    @Test
    public void teszt_14() {
        assertEquals("Hibas eredmeny", "Nincs nyertes",  doArgumentTest(A.class, "0", "1", "0", "0", "1", "0", "1", "0", "1"));
    }

    @Test
    public void teszt_15() {
        assertEquals("Hibas eredmeny", "Nincs nyertes",  doArgumentTest(A.class, "1", "1", "0", "0", "0", "1", "1", "1", "0"));
    }

    @Test
    public void teszt_16() {
        assertEquals("Hibas eredmeny", "Nincs nyertes",  doArgumentTest(A.class, "0", "0", "1", "1", "0", "0", "0", "1", "1"));
    }

    @Test
    public void teszt_17() {
        assertEquals("Hibas eredmeny", "Nincs nyertes",  doArgumentTest(A.class, "0", "1", "0", "0", "1", "1", "1", "0", "0"));
    }

    @Test
    public void teszt_18() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "1", "1", "0", "1", "0", "0", "1", "0", "1"));
    }

    @Test
    public void teszt_19() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "0", "1", "-1", "0", "1", "0", "-1", "1", "-1"));
    }

    @Test
    public void teszt_20() {
        assertEquals("Hibas eredmeny", "Attila nyert",  doArgumentTest(A.class, "0", "0", "0", "-1", "1", "1", "1", "0", "1"));
    }

    @Test
    public void teszt_21() {
        assertEquals("Hibas eredmeny", "Bella nyert",  doArgumentTest(A.class, "-1", "0", "0", "1", "1", "0", "1", "1", "1"));
    }

    @Test
    public void fajlMeret() {
        checkFileSize("src/A.java", 240, 1, 1, 7);
    }
}