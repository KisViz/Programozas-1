import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void adattagok() {
        assertTrue("anyag hibas", testField(Edeny.class, "anyag", String.class, Modifier.PRIVATE));
        assertTrue("meret hibas", testField(Edeny.class, "meret", int.class, Modifier.PRIVATE));
        assertTrue("mazsolak hibas", testField(Edeny.class, "mazsolak", Mazsola[].class, Modifier.PRIVATE));
    }

    @Test
    public void metodusok() {
        assertTrue("addMazsola fejlec hibas", testMethod(Edeny.class, "addMazsola", void.class, Modifier.PUBLIC, Mazsola.class));
        assertTrue("deleteMazsola fejlec hibas", testMethod(Edeny.class, "deleteMazsola", void.class, Modifier.PUBLIC, Mazsola.class));
    }

    @Test
    public void add_delete_01() {
        Mazsola m1 = new Mazsola("barna", 5, 3);
        Mazsola m2 = new Mazsola("barna", 4, 3);
        Mazsola m3 = new Mazsola("barna", 3.3, 3);
        Mazsola m4 = new Mazsola("barna", 6.4, 3);
        Mazsola m5 = new Mazsola("barna", 2.3, 3);
        Mazsola m6 = new Mazsola("barna", 0.1, 3);
        Mazsola m7 = new Mazsola("barna", 4.2, 3);
        Mazsola m8 = new Mazsola("barna", 0.6, 3);

        Edeny e1 = new Edeny("vas", 10, 3);
        e1.addMazsola(m1);
        assertSame("addMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("addMazsola hibas", null, e1.getMazsolak()[1]);
        assertSame("addMazsola hibas", null, e1.getMazsolak()[2]);

        e1.addMazsola(m2);
        assertSame("addMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("addMazsola hibas", m2, e1.getMazsolak()[1]);
        assertSame("addMazsola hibas", null, e1.getMazsolak()[2]);

        e1.addMazsola(m3);
        assertSame("addMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("addMazsola hibas", m2, e1.getMazsolak()[1]);
        assertSame("addMazsola hibas", null, e1.getMazsolak()[2]);

        e1.addMazsola(m8);
        assertSame("addMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("addMazsola hibas", m2, e1.getMazsolak()[1]);
        assertSame("addMazsola hibas", m8, e1.getMazsolak()[2]);

        e1.addMazsola(m6);
        assertSame("addMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("addMazsola hibas", m2, e1.getMazsolak()[1]);
        assertSame("addMazsola hibas", m8, e1.getMazsolak()[2]);

        e1.deleteMazsola(m8);
        assertSame("deleteMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("deleteMazsola hibas", m2, e1.getMazsolak()[1]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[2]);

        e1.deleteMazsola(m8);
        assertSame("deleteMazsola hibas", m1, e1.getMazsolak()[0]);
        assertSame("deleteMazsola hibas", m2, e1.getMazsolak()[1]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[2]);

        e1.deleteMazsola(m1);
        assertSame("deleteMazsola hibas", m2, e1.getMazsolak()[0]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[1]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[2]);

        e1.addMazsola(m4);
        assertSame("addMazsola hibas", m2, e1.getMazsolak()[0]);
        assertSame("addMazsola hibas", null, e1.getMazsolak()[1]);
        assertSame("addMazsola hibas", null, e1.getMazsolak()[2]);

        e1.deleteMazsola(m5);
        assertSame("deleteMazsola hibas", m2, e1.getMazsolak()[0]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[1]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[2]);

        e1.deleteMazsola(m2);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[0]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[1]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[2]);

        e1.deleteMazsola(m7);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[0]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[1]);
        assertSame("deleteMazsola hibas", null, e1.getMazsolak()[2]);


    }

    @Test
    public void add_delete_02() {
        Mazsola m7 = new Mazsola("barna", 4.2, 3);
        Mazsola m9 = new Mazsola("barna", 2.4, 3);

        Edeny e2 = new Edeny("homok", 5, 1000);
        e2.addMazsola(m9);
        assertSame("addMazsola hibas", m9, e2.getMazsolak()[0]);
        for (int i = 1; i < 1000; i++) {
            assertNull(e2.getMazsolak()[i]);
        }

        e2.addMazsola(m9);
        assertSame("addMazsola hibas", m9, e2.getMazsolak()[0]);
        for (int i = 1; i < 1000; i++) {
            assertNull(e2.getMazsolak()[i]);
        }

        e2.addMazsola(m7);
        assertSame("addMazsola hibas", m9, e2.getMazsolak()[0]);
        for (int i = 1; i < 1000; i++) {
            assertNull(e2.getMazsolak()[i]);
        }
    }
}