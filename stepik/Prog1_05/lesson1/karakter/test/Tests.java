import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void interfaceFejlec() {
        assertTrue("interface nem jo", testInterface(Karakter.class, Modifier.PUBLIC | Modifier.INTERFACE | Modifier.ABSTRACT));
    }

    @Test
    public void tamad_karakter() {
        assertTrue("tamad (karakter) hibas", testMethod(Karakter.class, "tamad", boolean.class, Modifier.PUBLIC | Modifier.ABSTRACT, Karakter.class));
    }

    @Test
    public void tamad_epulet() {
        assertTrue("tamad (epulet) hibas", testMethod(Karakter.class, "tamad", boolean.class, Modifier.PUBLIC | Modifier.ABSTRACT, Epulet.class));
    }

    @Test
    public void tamad_kornyezetiElem() {
        assertTrue("tamad (kornyezeti elem) hibas", testMethod(Karakter.class, "tamad", void.class, Modifier.PUBLIC | Modifier.ABSTRACT, KornyezetiElem.class));
    }

    @Test
    public void epites() {
        assertTrue("epites hibas", testMethod(Karakter.class, "epites", boolean.class, Modifier.PUBLIC | Modifier.ABSTRACT, Epulet.class));
    }

    @Test
    public void sebzestElszenved() {
        assertTrue("sebzestElszenved hibas", testMethod(Karakter.class, "sebzestElszenved", void.class, Modifier.PUBLIC | Modifier.ABSTRACT, int.class));
    }

    @Test
    public void fejlodik() {
        assertTrue("fejlodik hibas", testMethod(Karakter.class, "fejlodik", void.class, Modifier.PUBLIC | Modifier.ABSTRACT));
    }

    @Test
    public void gyogyit() {
        assertTrue("gyogyit hibas", testMethod(Karakter.class, "gyogyit", int.class, Modifier.PUBLIC | Modifier.ABSTRACT, Karakter.class, int.class));
    }

    @Test
    public void pusztitas() {
        assertTrue("pusztitas hibas", testMethod(Karakter.class, "pusztitas", int.class, Modifier.PUBLIC | Modifier.ABSTRACT, Karakter[].class));
    }

    @Test
    public void ellensegek() {
        assertTrue("ellensegek hibas", testMethod(Karakter.class, "ellensegek", Karakter[].class, Modifier.PUBLIC | Modifier.ABSTRACT));
    }
}