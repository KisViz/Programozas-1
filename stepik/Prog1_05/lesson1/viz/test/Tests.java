import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void viz() {
        assertTrue("Viz osztaly hibas", testClass(Viz.class, Modifier.PUBLIC | Modifier.ABSTRACT, Object.class));
        assertTrue("Viz: tiszta hibas", testField(Viz.class, "tiszta", boolean.class, Modifier.PROTECTED));
        assertTrue("Viz: meret hibas", testField(Viz.class, "meret", int.class, Modifier.PROTECTED));
        assertTrue("Viz: konstruktor hibas", testConstructor(Viz.class, Modifier.PUBLIC, boolean.class, int.class));
        assertTrue("Viz: sodrasiErosseg hibas", testMethod(Viz.class, "sodrasiErosseg", int.class, Modifier.PUBLIC | Modifier.ABSTRACT));
    }

    @Test
    public void alloviz() {
        assertTrue("Alloviz: osztaly hibas", testClass(Alloviz.class, Modifier.PUBLIC | Modifier.ABSTRACT, Viz.class));
        assertTrue("Alloviz: konstruktor hibas", testConstructor(Alloviz.class, Modifier.PUBLIC, boolean.class, int.class));
        assertTrue("Alloviz: sodrasiErosseg hibas", testMethod(Alloviz.class, "sodrasiErosseg", int.class, Modifier.PUBLIC));
    }

    @Test
    public void to() {
        assertTrue("To: osztaly hibas", testClass(To.class, Modifier.PUBLIC, Alloviz.class));
        assertTrue("To: konstruktor hibas", testConstructor(To.class, Modifier.PUBLIC, boolean.class, int.class));

        To to = new To(true, 5);
        assertEquals("To: meret adattag nincs jol beallitva", 5, to.meret);
        assertTrue("To: tiszta adattag nincs jol beallitva", to.tiszta);
    }

    @Test
    public void pocsolya() {
        assertTrue("Pocsolya: osztaly hibas", testClass(Pocsolya.class, Modifier.PUBLIC, Alloviz.class));
        assertTrue("Pocsolya: konstruktor hibas", testConstructor(Pocsolya.class, Modifier.PUBLIC, int.class));

        Pocsolya p = new Pocsolya(7);
        assertEquals("Pocsolya: meret adattag nincs jol beallitva", 7, p.meret);
        assertFalse("Pocsolya: tiszta adattag nincs jol beallitva", p.tiszta);
    }

    @Test
    public void folyoviz() {
        assertTrue("Folyoviz: osztaly hibas", testClass(Folyoviz.class, Modifier.PUBLIC | Modifier.ABSTRACT, Viz.class));
        assertTrue("Folyoviz: folyasiSebesseg hibas", testField(Folyoviz.class, "folyasiSebesseg", int.class, Modifier.PROTECTED));
        assertTrue("Folyoviz: konstruktor hibas", testConstructor(Folyoviz.class, Modifier.PUBLIC, boolean.class, int.class, int.class));
        assertTrue("Folyoviz: sodrasiErosseg hibas", testMethod(Folyoviz.class, "sodrasiErosseg", int.class, Modifier.PUBLIC));
    }

    @Test
    public void folyo() {
        assertTrue("Folyo: osztaly hibas", testClass(Folyo.class, Modifier.PUBLIC, Folyoviz.class));
        assertTrue("Folyo: konstruktor hibas", testConstructor(Folyo.class, Modifier.PUBLIC, boolean.class, int.class, int.class));

        assertEquals("Folyoviz: sodrasiErosseg hibas", 21, new Folyo(true, 7, 3).sodrasiErosseg());
        assertEquals("Folyoviz: sodrasiErosseg hibas", 20, new Folyo(true, 10, 2).sodrasiErosseg());

        Folyo folyo = new Folyo(false, 5, 2);
        assertFalse("Folyo: tiszta hibas", folyo.tiszta);
        assertEquals("Folyo: meret hibas", 5, folyo.meret);
        assertEquals("Folyo: folyasiSebesseg hibas", 2, folyo.folyasiSebesseg);
    }

    @Test
    public void csermely() {
        assertTrue("Csermely: osztaly hibas", testClass(Csermely.class, Modifier.PUBLIC, Folyoviz.class));
        assertTrue("Csermely: konstruktor hibas", testConstructor(Csermely.class, Modifier.PUBLIC, boolean.class, int.class, int.class));
        assertTrue("Csermely: sodrasiErosseg hibas", testMethod(Csermely.class, "sodrasiErosseg", int.class, Modifier.PUBLIC));

        Csermely cs = new Csermely(false, 4281, 1000);
        assertFalse("Csermely: tiszta hibas", cs.tiszta);
        assertEquals("Csermely: meret hibas", 4281, cs.meret);
        assertEquals("Csermely: folyasiSebesseg hibas", 1000, cs.folyasiSebesseg);
        assertEquals("Csermely: sodrasiErosseg hibas", 1, cs.sodrasiErosseg());
    }

}