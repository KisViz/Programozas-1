import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZarojelesIsmetles {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", "aaa", Rovidites.dekodolas("3(a)"));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", "abababab", Rovidites.dekodolas("4(ab)"));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", "ssassassassassa", Rovidites.dekodolas("5(ssa)"));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", "qhqhqhqhqhqhqhqhqhqhqhqhqh", Rovidites.dekodolas("13(qh)"));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", "xyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxy", Rovidites.dekodolas("19(xy)"));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", "abababababcdcdcd", Rovidites.dekodolas("5(ab)3(cd)"));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", "qsqsqxlalalalX.", Rovidites.dekodolas("q2(sq)xl3(al)X."));
    }
}
