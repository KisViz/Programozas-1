import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void nev() {
        assertTrue("nev hibas", testField(Alkalmazas.class, "nev", String.class, 0));
    }

    @Test
    public void keszito() {
        assertTrue("keszito hibas", testField(Alkalmazas.class, "keszito", String.class, 0));
    }

    @Test
    public void verzioszam() {
        assertTrue("verzioszam hibas", testField(Alkalmazas.class, "verzioszam", int.class, 0));
    }

    @Test
    public void ertekeles() {
        assertTrue("ertekeles hibas", testField(Alkalmazas.class, "ertekeles", double.class, 0));
    }
}