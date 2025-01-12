import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void nev() {
        assertTrue("papagaj: nev hibas", testField(Papagaj.class, "nev", String.class, 0));
    }

    @Test
    public void szin() {
        assertTrue("papagaj: szin hibas", testField(Papagaj.class, "szin", String.class, 0));
    }

    @Test
    public void szavak() {
        assertTrue("papagaj: szavak hibas", testField(Papagaj.class, "szavak", String[].class, 0));
    }
}