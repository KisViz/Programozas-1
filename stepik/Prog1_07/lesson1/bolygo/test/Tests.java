import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        try {
            Bolygo b = new Bolygo("Jupiter", 6, false);
            assertEquals("nev beallitasa hibas", "Jupiter", b.nev);
            assertEquals("tomeg beallitasa hibas", 6, b.tomeg, 0.0001f);
        } catch (Exception e) {
            fail("Nem kellett volna kivetelt dobni");
        }
    }

    @Test
    public void teszt_02() {
        try {
            Bolygo b = new Bolygo("Jupiter", 0, false);
            fail("Kivetelt kellett volna dobni");
        } catch (IllegalArgumentException e) {
            assertEquals("hibas hibauzenet", "Hibas tomeg", e.getMessage());
        } catch (Exception e) {
            fail("Hibas kivetel tipus");
        }
    }

    @Test
    public void teszt_03() {
        try {
            Bolygo b = new Bolygo("Mars", -5, true);
            fail("Kivetelt kellett volna dobni");
        } catch (IllegalArgumentException e) {
            assertEquals("hibas hibauzenet", "Hibas tomeg", e.getMessage());
        } catch (Exception e) {
            fail("Hibas kivetel tipus");
        }
    }
}