import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        try {
            Macska m = new Macska("piros", 6);
            assertEquals("szin beallitasa hibas", "piros", m.szin);
            assertEquals("kor beallitasa hibas", 6, m.kor);
        } catch (Exception e) {
            fail("Nem kellett volna kivetelt dobni");
        }
    }

    @Test
    public void teszt_02() {
        try {
            Macska m = new Macska("kek", 0);
            assertEquals("szin beallitasa hibas", "kek", m.szin);
            assertEquals("kor beallitasa hibas", 0, m.kor);
        } catch (Exception e) {
            fail("Nem kellett volna kivetelt dobni");
        }
    }

    @Test
    public void teszt_03() {
        try {
            Macska m = new Macska(null, 0);
            assertNull("szin beallitasa hibas", m.szin);
            assertEquals("kor beallitasa hibas", 0, m.kor);
        } catch (Exception e) {
            fail("Nem kellett volna kivetelt dobni");
        }
    }

    @Test
    public void teszt_04() {
        try {
            new Macska("rozsaszin", 6);
            fail("Kivetelt kellett volna dobni");
        } catch (IllegalArgumentException e) {
            assertEquals("hibas uzenet", "hibas szin", e.getMessage());
        } catch (Exception e) {
            fail("Rossz kivetel tipus");
        }
    }

    @Test
    public void teszt_05() {
        try {
            new Macska("kek", -1);
            fail("Kivetelt kellett volna dobni");
        } catch (IllegalArgumentException e) {
            assertEquals("hibas uzenet", "hibas kor", e.getMessage());
        } catch (Exception e) {
            fail("Rossz kivetel tipus");
        }
    }
}