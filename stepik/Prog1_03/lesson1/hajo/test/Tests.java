import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void nev() {
        Hajo hajo = new Hajo();
        assertEquals("nev hibas", "MARIJAAA", fieldValue(Hajo.class, "nev", hajo));
    }

    @Test
    public void meret() {
        Hajo hajo = new Hajo();
        assertEquals("meret hibas", 10, fieldValue(Hajo.class, "meret", hajo));
    }

    @Test
    public void agyukSzama() {
        Hajo hajo = new Hajo();
        assertEquals("agyukSzama hibas", 2, fieldValue(Hajo.class, "agyukSzama", hajo));
    }

    @Test
    public void felavatva() {
        Hajo hajo = new Hajo();
        assertEquals("felavatva hibas", false, fieldValue(Hajo.class, "felavatva", hajo));
    }
}