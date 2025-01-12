import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void etel() {
        assertTrue("Etel: nev hibas", testField(Etel.class, "nev", String.class, Modifier.PRIVATE));
        assertTrue("Etel: minoseg hibas", testField(Etel.class, "minoseg", double.class, Modifier.PRIVATE));
        assertTrue("Etel: konstruktor", testConstructor(Etel.class, Modifier.PUBLIC, String.class, double.class));

        Etel e = new Etel("paradicsom", 0.2);
        assertEquals("Etel: konstruktor, getter hibas", "paradicsom", e.getNev());
        assertEquals("Etel: konstruktor, getter hibas", 0.2, e.getMinoseg(), 0.0001);

        Etel e2 = new Etel("paradicsom", -0.2);
        assertEquals("Etel: konstruktor, getter hibas", "paradicsom", e2.getNev());
        assertEquals("Etel: konstruktor, getter hibas", 0, e2.getMinoseg(), 0.0001);

        Etel e3 = new Etel("paradicsom", 2.2);
        assertEquals("Etel: konstruktor, getter hibas", "paradicsom", e3.getNev());
        assertEquals("Etel: konstruktor, getter hibas", 1, e3.getMinoseg(), 0.0001);
    }

    @Test
    public void ember() {
        assertTrue("Ember: nev hibas", testField(Ember.class, "nev", String.class, Modifier.PROTECTED));
        assertTrue("Ember: kor hibas", testField(Ember.class, "kor", int.class, Modifier.PROTECTED));
        assertTrue("Ember: vagyon hibas", testField(Ember.class, "vagyon", int.class, Modifier.PROTECTED));
        assertTrue("Ember: beteg hibas", testField(Ember.class, "beteg", boolean.class, Modifier.PROTECTED));
        assertTrue("Ember: ferfi hibas", testField(Ember.class, "ferfi", boolean.class, Modifier.PROTECTED));
        assertTrue("Ember: konstruktor hibas", testConstructor(Ember.class, Modifier.PUBLIC, String.class, int.class, int.class, boolean.class));

        class Ember2 extends Ember {
            public Ember2(String nev, int kor, int vagyon, boolean ferfi) {
                super(nev, kor, vagyon, ferfi);
            }

            @Override
            public boolean eszik(Etel etel) {
                return false;
            }
        }

        Ember2 e = new Ember2("Marika neni", 80, 400, false);
        assertEquals("Ember: nev hibas", "Marika neni", e.getNev());
        assertEquals("Ember: kor hibas", 80, e.getKor());
        assertEquals("Ember: vagyon hibas", 400, e.getVagyon());
        assertFalse("Ember: beteg hibas", e.isBeteg());
        assertFalse("Ember: ferfi hibas", e.isFerfi());

        Ember2 e2 = new Ember2("Marika bacsi", 77, 51, true);
        assertEquals("Ember: nev hibas", "Marika bacsi", e2.getNev());
        assertEquals("Ember: kor hibas", 77, e2.getKor());
        assertEquals("Ember: vagyon hibas", 51, e2.getVagyon());
        assertFalse("Ember: beteg hibas", e2.isBeteg());
        assertTrue("Ember: ferfi hibas", e2.isFerfi());

        assertTrue("Ember: eszik hibas", testMethod(Ember.class, "eszik", boolean.class, Modifier.PUBLIC | Modifier.ABSTRACT, Etel.class));
        assertTrue("Ember: koltekezik", testMethod(Ember.class, "koltekezik", boolean.class, Modifier.PUBLIC, int.class));

        assertTrue("Ember: koltekezik hibas", e.koltekezik(5));
        assertEquals("Ember: koltekezik hibas", 395, e.getVagyon());

        assertFalse("Ember: koltekezik hibas", e.koltekezik(399));
        assertEquals("Ember: koltekezik hibas", 395, e.getVagyon());

        assertFalse("Ember: koltekezik hibas", e.koltekezik(500));
        assertEquals("Ember: koltekezik hibas", 395, e.getVagyon());

        assertTrue("Ember: koltekezik hibas", e2.koltekezik(5));
        assertEquals("Ember: koltekezik hibas", 46, e2.getVagyon());

        assertFalse("Ember: koltekezik hibas", e2.koltekezik(399));
        assertEquals("Ember: koltekezik hibas", 46, e2.getVagyon());
    }

    @Test
    public void allatkereskedo() {
        assertTrue("Allatkereskedo: interface hibas", testInterface(Allatkereskedo.class, Modifier.PUBLIC | Modifier.ABSTRACT | Modifier.INTERFACE));
        assertTrue("Allatkereskedo: kereskedik hibas", testMethod(Allatkereskedo.class, "kereskedik", void.class, Modifier.PUBLIC | Modifier.ABSTRACT));
    }

    @Test
    public void foldmuves() {
        assertTrue("Foldmuves: osztaly hibas", testClass(Foldmuves.class, Modifier.PUBLIC, Ember.class, Allatkereskedo.class));
        assertTrue("Foldmuves: muvelendoFoldterulet hibas", testField(Foldmuves.class, "muvelendoFoldterulet", int.class, Modifier.PRIVATE));
        assertTrue("Foldmuves: konstruktor hibas", testConstructor(Foldmuves.class, Modifier.PUBLIC, String.class, int.class, int.class, boolean.class, int.class));
        assertTrue("Foldmuves: eszik hibas", testMethod(Foldmuves.class, "eszik", boolean.class, Modifier.PUBLIC, Etel.class));
        assertTrue("Foldmuves: kereskedik hibas", testMethod(Foldmuves.class, "kereskedik", void.class, Modifier.PUBLIC));

        Foldmuves m = new Foldmuves("Janos", 50, 1000, true, 20);
        assertEquals("Foldmuves: konstruktor hibas", "Janos", m.nev);
        assertEquals("Foldmuves: konstruktor hibas", 50, m.kor);
        assertEquals("Foldmuves: konstruktor hibas", 1000, m.vagyon);
        assertTrue("Foldmuves: konstruktor hibas", m.ferfi);
        assertFalse("Foldmuves: konstruktor hibas", m.beteg);
        assertEquals("Foldmuves: konstruktor hibas", 20, fieldValue(Foldmuves.class, "muvelendoFoldterulet", m));

        assertTrue("Foldmuves: eszik hibas", m.eszik(new Etel("", 1)));
        assertFalse("Foldmuves: eszik hibas", m.beteg);

        assertFalse("Foldmuves: eszik hibas", m.eszik(new Etel("", 0.45)));
        assertTrue("Foldmuves: eszik hibas", m.beteg);

        Foldmuves m2 = new Foldmuves("Otto", 20, 600, true, 70);
        assertTrue("Foldmuves: eszik hibas", m2.eszik(new Etel("", 1)));
        assertFalse("Foldmuves: eszik hibas", m2.beteg);

        assertTrue("Foldmuves: eszik hibas", m2.eszik(new Etel("", 0.45)));
        assertFalse("Foldmuves: eszik hibas", m2.beteg);

        m.kereskedik();
        assertEquals("Foldmuves: kereskedik hibas", 1001, m.getVagyon());
        m.kereskedik();
        assertEquals("Foldmuves: kereskedik hibas", 1002, m.getVagyon());

        m2.kereskedik();
        assertEquals("Foldmuves: kereskedik hibas", 601, m2.getVagyon());
    }

    @Test
    public void kiralyno() {
        assertTrue("Kiralyno: osztaly hibas", testClass(Kiralyno.class, Modifier.PUBLIC, Ember.class));
        assertTrue("Kiralyno: megkoronazva hibas", testField(Kiralyno.class, "megkoronazva", int.class, Modifier.PRIVATE));
        assertTrue("Kiralyno: szolgak hibas", testField(Kiralyno.class, "szolgak", Ember[].class, Modifier.PRIVATE));
        assertTrue("Kiralyno: konstruktor hibas", testConstructor(Kiralyno.class, Modifier.PUBLIC, String.class, int.class, int.class, int.class, int.class));
        assertTrue("Kiralyno: megkoronazva getter hibas", testMethod(Kiralyno.class, "getMegkoronazva", int.class, Modifier.PUBLIC));
        assertTrue("Kiralyno: szolgak getter hibas", testMethod(Kiralyno.class, "getSzolgak", Ember[].class, Modifier.PUBLIC));

        Kiralyno k = new Kiralyno("Leen", 20, 20000, 2020, 3);
        assertEquals("Kiralyno: nev hibas", "Leen", k.getNev());
        assertEquals("Kiralyno: kor hibas", 20, k.getKor());
        assertEquals("Kiralyno: vagyon hibas", 20000, k.getVagyon());
        assertEquals("Kiralyno: megkoronazva hibas", 2020, k.getMegkoronazva());
        assertEquals("Kiralyno: szolgak hibas", 3, k.getSzolgak().length);
        assertFalse("Kiralyno: beteg hibas", k.isBeteg());
        assertFalse("Kiralyno: ferfi hibas", k.isFerfi());

        assertTrue("Kiralyno: eszik hibas", testMethod(Kiralyno.class, "eszik", boolean.class, Modifier.PUBLIC, Etel.class));
        assertTrue("Kiralyno: szolgatFelvesz hibas", testMethod(Kiralyno.class, "szolgatFelvesz", void.class, Modifier.PUBLIC, Ember.class));

        Ember e1 = new Foldmuves("Andras", 40, 100, true, 13);
        Ember e2 = new Foldmuves("David", 33, 200, true, 3);
        Ember e3 = new Foldmuves("Tunde", 22, 20, false, 5);
        Ember e4 = new Foldmuves("Tamas", 40, 40000, true, 1);
        Ember e5 = new Foldmuves("Era", 31, 1, false, 5);

        assertTrue("Kiralyno: eszik hibas", k.eszik(new Etel("", 0.01)));
        assertTrue("Kiralyno: eszik hibas", k.eszik(new Etel("", 0)));

        k.szolgatFelvesz(e1);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 0, e1.vagyon);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 20100, k.vagyon);
        assertSame("Kiralyno: szolgatFelvesz hibas", e1, k.getSzolgak()[0]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[1]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[2]);

        k.szolgatFelvesz(e4);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 40000, e4.vagyon);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 20100, k.vagyon);
        assertSame("Kiralyno: szolgatFelvesz hibas", e1, k.getSzolgak()[0]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[1]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[2]);

        k.szolgatFelvesz(k);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 20100, k.vagyon);
        assertSame("Kiralyno: szolgatFelvesz hibas", e1, k.getSzolgak()[0]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[1]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[2]);

        k.szolgatFelvesz(e2);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 0, e2.vagyon);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 20300, k.vagyon);
        assertSame("Kiralyno: szolgatFelvesz hibas", e1, k.getSzolgak()[0]);
        assertSame("Kiralyno: szolgatFelvesz hibas", e2, k.getSzolgak()[1]);
        assertNull("Kiralyno: szolgatFelvesz hibas", k.getSzolgak()[2]);

        k.szolgatFelvesz(e3);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 0, e3.vagyon);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 20320, k.vagyon);
        assertSame("Kiralyno: szolgatFelvesz hibas", e1, k.getSzolgak()[0]);
        assertSame("Kiralyno: szolgatFelvesz hibas", e2, k.getSzolgak()[1]);
        assertSame("Kiralyno: szolgatFelvesz hibas", e3, k.getSzolgak()[2]);

        k.szolgatFelvesz(e5);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 1, e5.vagyon);
        assertEquals("Kiralyno: szolgatFelvesz hibas", 20320, k.vagyon);
        assertSame("Kiralyno: szolgatFelvesz hibas", e1, k.getSzolgak()[0]);
        assertSame("Kiralyno: szolgatFelvesz hibas", e2, k.getSzolgak()[1]);
        assertSame("Kiralyno: szolgatFelvesz hibas", e3, k.getSzolgak()[2]);
    }
}