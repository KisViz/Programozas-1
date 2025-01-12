import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void fejlecek() {
        assertTrue("AlacsonyAkkumulatorszint osztaly fejlece hibas", testClass(AlacsonyAkkumulatorszint.class, Modifier.PUBLIC, Exception.class));
        assertTrue("AlacsonyAkkumulatorszint default konstruktor hibas", testConstructor(AlacsonyAkkumulatorszint.class, Modifier.PUBLIC));
        assertTrue("AlacsonyAkkumulatorszint default konstruktor hibas", testConstructor(AlacsonyAkkumulatorszint.class, Modifier.PUBLIC, String.class));
    }

    @Test
    public void merul() {
        Telefon t = new Telefon(2);

        try {
            t.merul();
            assertEquals("toltottseg erteke hibas", 1, t.getToltottseg());
        } catch (AlacsonyAkkumulatorszint alacsonyAkkumulatorszint) {
            fail("Nem kellett volna kivetelt dobni!");
        }

        try {
            t.merul();
            assertEquals("toltottseg erteke hibas", 0, t.getToltottseg());
        } catch (AlacsonyAkkumulatorszint alacsonyAkkumulatorszint) {
            fail("Nem kellett volna kivetelt dobni!");
        }

        try {
            t.merul();
            fail("kivetelt kellett volna dobni");
        } catch (AlacsonyAkkumulatorszint alacsonyAkkumulatorszint) {
            assertEquals("toltottseg erteke hibas", 0, t.getToltottseg());
        }

    }
}