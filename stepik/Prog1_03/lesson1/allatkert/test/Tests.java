import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void allat_nev() {
        assertTrue("allat: nev hibas", testField(Allat.class, "nev", String.class, 0));
    }

    @Test
    public void allat_eletkor() {
        assertTrue("allat: eletkor hibas", testField(Allat.class, "eletkor", int.class, 0));
    }

    @Test
    public void allat_meret() {
        assertTrue("allat: meret hibas", testField(Allat.class, "meret", double.class, 0));
    }

    @Test
    public void allatkert_nev() {
        assertTrue("allatkert: nev hibas", testField(Allatkert.class, "nev", String.class, 0));
    }

    @Test
    public void allatkert_varos() {
        assertTrue("allatkert: varos hibas", testField(Allatkert.class, "varos", String.class, 0));
    }

    @Test
    public void allatkert_allatok() {
        assertTrue("allatkert: allatok hibas", testField(Allatkert.class, "allatok", Allat[].class, 0));
    }
}