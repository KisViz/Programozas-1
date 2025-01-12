import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {

    @Test
    public void sarkany() {
        assertTrue("Sarkany: nev", testField(Sarkany.class, "nev", String.class, Modifier.PROTECTED));
        assertTrue("Sarkany: szin", testField(Sarkany.class, "szin", String.class, Modifier.PROTECTED));
        assertTrue("Sarkany: ero", testField(Sarkany.class, "ero", double.class, Modifier.PROTECTED));
        assertTrue("Sarkany: tuzokado", testField(Sarkany.class, "tuzokado", boolean.class, Modifier.PROTECTED));

        Sarkany s = new Sarkany("Juli", "piros", 4.4, true);
        s.setNev("Mari");
        s.setSzin("zold");
        s.setEro(3.3);
        s.setEro(-3.8);
        s.setTuzokado(false);

        assertEquals("Sarkany: nev get-set", "Mari", s.getNev());
        assertEquals("Sarkany: szin get-set", "zold", s.getSzin());
        assertEquals("Sarkany: ero get-set", 3.3, s.getEro(), 0.001);
        assertFalse("Sarkany: tuzokado get-set", s.isTuzokado());

        Sarkany s2 = new Sarkany("Otto");
        assertEquals("Sarkany: 1 parameteres konstruktor", "Otto", s2.getNev());
        assertEquals("Sarkany: 1 parameteres konstruktor", "zold", s2.getSzin());
        assertEquals("Sarkany: 1 parameteres konstruktor", 1, s2.getEro(), 0.0001);
        assertFalse("Sarkany: 1 parameteres konstruktor", s2.isTuzokado());

        Sarkany s3 = new Sarkany("Gabor", "kek", 53.3, true);
        assertEquals("Sarkany: 1 parameteres konstruktor", "Gabor", s3.getNev());
        assertEquals("Sarkany: 1 parameteres konstruktor", "kek", s3.getSzin());
        assertEquals("Sarkany: 1 parameteres konstruktor", 53.3, s3.getEro(), 0.0001);
        assertTrue("Sarkany: 1 parameteres konstruktor", s3.isTuzokado());

        assertEquals("Sarkany: toString", "Gabor egy kek szinu tuzokado sarkany, akinek ereje " + 53.3 + ".", s3.toString());
        assertEquals("Sarkany: toString", "Otto egy zold szinu nem tuzokado sarkany, akinek ereje " + 1.0 + ".", s2.toString());

        s3.erosodik();
        s3.erosodik();
        s2.erosodik();

        assertEquals("Sarkany: erosodik", 53.3 * 4, s3.getEro(), 0.0001);
        assertEquals("Sarkany: erosodik", 2, s2.getEro(), 0.0001);
    }

    @Test
    public void vizisarkany() {
        assertTrue("Vizisarkany: vizkopoKepesseg", testField(Vizisarkany.class, "vizkopoKepesseg", int.class, Modifier.PRIVATE));
        assertTrue("Vizisarkany: vizbenLet", testField(Vizisarkany.class, "vizbenLet", double.class, Modifier.PRIVATE));

        Vizisarkany s = new Vizisarkany("Peter", "rozsaszin", 3.3, 7, 2.2);
        assertEquals("Vizisarkany: 5 parameteres konstruktor", "Peter", s.getNev());
        assertEquals("Vizisarkany: 5 parameteres konstruktor", "rozsaszin", s.getSzin());
        assertEquals("Vizisarkany: 5 parameteres konstruktor", 3.3, s.getEro(), 0.0001);
        assertFalse("Vizisarkany: 5 parameteres konstruktor", s.isTuzokado());
        assertEquals("Vizisarkany: 5 parameteres konstruktor", 7, s.getVizkopoKepesseg());
        assertEquals("Vizisarkany: 5 parameteres konstruktor", 2.2, s.getVizbenLet(), 0.00001);

        Vizisarkany s2 = new Vizisarkany("Bence", 6.4, 100);
        assertEquals("Vizisarkany: 3 parameteres konstruktor", "Bence", s2.getNev());
        assertEquals("Vizisarkany: 3 parameteres konstruktor", "voros", s2.getSzin());
        assertEquals("Vizisarkany: 3 parameteres konstruktor", 6.4, s2.getEro(), 0.0001);
        assertFalse("Vizisarkany: 3 parameteres konstruktor", s2.isTuzokado());
        assertEquals("Vizisarkany: 3 parameteres konstruktor", 100, s2.getVizkopoKepesseg());
        assertEquals("Vizisarkany: 3 parameteres konstruktor", 1, s2.getVizbenLet(), 0.00001);

        Vizisarkany s3 = new Vizisarkany("Joco, a kek vizisarkany", 1.1, 5);
        assertEquals("Vizisarkany: 3 parameteres konstruktor", "kek", s3.getSzin());

        Vizisarkany s4 = new Vizisarkany("Anna, a zold vizisarkany", 1.1, 5);
        assertEquals("Vizisarkany: 3 parameteres konstruktor", "zold", s4.getSzin());

        assertTrue("Vizisarkany: uszik", s.uszik(1));
        assertTrue("Vizisarkany: uszik", s.uszik(131));
        assertFalse("Vizisarkany: uszik", s.uszik(133));

        assertTrue("Vizisarkany: uszik", s.uszik(59));
        assertTrue("Vizisarkany: uszik", s2.uszik(60));
        assertFalse("Vizisarkany: uszik", s2.uszik(61));

        assertEquals("Vizisarkany: vizetKop", 5.5, s4.vizetKop(), 0.0001);
        assertEquals("Vizisarkany: vizetKop", 640, s2.vizetKop(), 0.0001);
        assertEquals("Vizisarkany: vizetKop", 23.1, s.vizetKop(), 0.0001);

        assertEquals("Vizisarkany: toString", "Bence egy voros szinu nem tuzokado sarkany, akinek ereje " + 6.4 + ". A vizisarkany vizkopo kepessege magas, " + 1.0 + " orat kepes vizben tolteni.", s2.toString());
        assertEquals("Vizisarkany: toString", "Joco, a kek vizisarkany egy kek szinu nem tuzokado sarkany, akinek ereje " + 1.1 + ". A vizisarkany vizkopo kepessege alacsony, " + 1.0 + " orat kepes vizben tolteni.", s3.toString());
    }

    @Test
    public void ember() {
        assertTrue("Ember: nev", testField(Ember.class, "nev", String.class, Modifier.PRIVATE | Modifier.FINAL));
        assertTrue("Ember: sarkanyok", testField(Ember.class, "sarkanyok", Sarkany[].class, Modifier.PRIVATE));

        Ember e = new Ember("Peter", 7);
        Sarkany[] e_sarkanyok = (Sarkany[]) fieldValue(Ember.class, "sarkanyok", e);

        assertEquals("Ember: 2 parameteres konstruktor", "Peter", fieldValue(Ember.class, "nev", e));
        assertEquals("Ember: 2 parameteres konstruktor", 7, e_sarkanyok.length);
        for (Sarkany sarkany : e_sarkanyok) {
            assertNull("Ember: 2 parameteres konstruktor", sarkany);
        }

        Ember e2 = new Ember(3);
        Sarkany[] e2_sarkanyok = (Sarkany[]) fieldValue(Ember.class, "sarkanyok", e2);

        assertEquals("Ember: 1 parameteres konstruktor", "Noemi neni", fieldValue(Ember.class, "nev", e2));
        assertEquals("Ember: 1 parameteres konstruktor", 3, e2_sarkanyok.length);
        for (Sarkany sarkany: e2_sarkanyok) {
            assertNull("Ember: 1 parameteres konstruktor", sarkany);
        }

        Sarkany s1 = new Sarkany("Mari", "zold", 7.2, true);
        Sarkany s2 = new Sarkany("Judit", "sarga", 5.5, false);
        Sarkany s3 = new Sarkany("Adel", "piros", 8.4, true);
        Sarkany s4 = new Sarkany("Zoli", "piros", 2.2, true);
        Sarkany s5 = new Vizisarkany("Andras", 2.1, 17);
        Sarkany s6 = new Vizisarkany("Robert", 16.4, 1);

        e2.sarkanySzuletik(s1);
        assertSame("Ember: sarkanySzuletik", s1, e2_sarkanyok[0]);
        for (int i = 1; i < e2_sarkanyok.length; i++) {
            assertNull(e2_sarkanyok[i]);
        }

        e2.sarkanySzuletik(s2);
        assertSame("Ember: sarkanySzuletik", s1, e2_sarkanyok[0]);
        assertSame("Ember: sarkanySzuletik", s2, e2_sarkanyok[1]);
        for (int i = 2; i < e2_sarkanyok.length; i++) {
            assertNull(e2_sarkanyok[i]);
        }

        e2.sarkanySzuletik(s3);
        assertSame("Ember: sarkanySzuletik", s1, e2_sarkanyok[0]);
        assertSame("Ember: sarkanySzuletik", s2, e2_sarkanyok[1]);
        assertSame("Ember: sarkanySzuletik", s3, e2_sarkanyok[2]);

        e2.sarkanySzuletik(s4);
        assertSame("Ember: sarkanySzuletik", s1, e2_sarkanyok[0]);
        assertSame("Ember: sarkanySzuletik", s4, e2_sarkanyok[1]);
        assertSame("Ember: sarkanySzuletik", s3, e2_sarkanyok[2]);

        e2.sarkanySzuletik(s6);
        assertSame("Ember: sarkanySzuletik", s1, e2_sarkanyok[0]);
        assertSame("Ember: sarkanySzuletik", s6, e2_sarkanyok[1]);
        assertSame("Ember: sarkanySzuletik", s3, e2_sarkanyok[2]);

        e2.sarkanySzuletik(s5);
        assertSame("Ember: sarkanySzuletik", s5, e2_sarkanyok[0]);
        assertSame("Ember: sarkanySzuletik", s6, e2_sarkanyok[1]);
        assertSame("Ember: sarkanySzuletik", s3, e2_sarkanyok[2]);

        e.sarkanySzuletik(s3);
        e.sarkanySzuletik(s1);
        e.sarkanySzuletik(s4);

        assertEquals("Ember: osszErosseg", 26.9, e2.osszErosseg(), 0.0001);
        assertEquals("Ember: osszErosseg", 17.8, e.osszErosseg(), 0.0001);

        assertEquals("Ember: leggyakrabbi", "piros", e.leggyakrabbi());
        assertEquals("Ember: leggyakrabbi", "voros", e2.leggyakrabbi());

        assertEquals("Ember: toString", "Peter" + System.lineSeparator() +
                        "Adel egy piros szinu tuzokado sarkany, akinek ereje " + 8.4 + "." + System.lineSeparator() +
                        "Mari egy zold szinu tuzokado sarkany, akinek ereje " + 7.2 + "." + System.lineSeparator() +
                        "Zoli egy piros szinu tuzokado sarkany, akinek ereje " + 2.2 + "." + System.lineSeparator(),
                e.toString());

        assertEquals("Ember: toString", "Noemi neni" + System.lineSeparator() +
                        "Andras egy voros szinu nem tuzokado sarkany, akinek ereje " + 2.1 + ". A vizisarkany vizkopo kepessege magas, " + 1.0 + " orat kepes vizben tolteni." + System.lineSeparator() +
                        "Robert egy voros szinu nem tuzokado sarkany, akinek ereje " + 16.4 + ". A vizisarkany vizkopo kepessege alacsony, " + 1.0 + " orat kepes vizben tolteni." + System.lineSeparator() +
                        "Adel egy piros szinu tuzokado sarkany, akinek ereje " + 8.4 + "." + System.lineSeparator(),
                e2.toString());

    }

}