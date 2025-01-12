import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testDefaultKonstruktor() {
        Szamitogep s1 = new Szamitogep();
        assertEquals("default konstruktor hibas", "", s1.getGyarto());
        assertEquals("default konstruktor hibas", 8, s1.getMemoriaMennyiseg());
        assertEquals("default konstruktor hibas", 500, s1.getTarhelyMennyiseg());
        assertFalse("default konstruktor hibas", s1.isBekapcsolva());
    }

    @Test
    public void testParameteresKonstruktor() {
        Szamitogep s1 = new Szamitogep("ENVAGYOKAGYARTO", 64, 10240);
        assertEquals("parameteres konstruktor hibas", "ENVAGYOKAGYARTO", s1.getGyarto());
        assertEquals("parameteres konstruktor hibas", 64, s1.getMemoriaMennyiseg());
        assertEquals("parameteres konstruktor hibas", 10240, s1.getTarhelyMennyiseg());
        assertFalse("parameteres konstruktor hibas", s1.isBekapcsolva());
    }

    @Test
    public void testSetter() {
        Szamitogep s1 = new Szamitogep("ENVAGYOKAGYARTO", 64, 10240);
        s1.setGyarto("Asus");
        s1.setMemoriaMennyiseg(4);
        s1.setTarhelyMennyiseg(128);
        assertEquals("parameteres konstruktor hibas", "Asus", s1.getGyarto());
        assertEquals("parameteres konstruktor hibas", 4, s1.getMemoriaMennyiseg());
        assertEquals("parameteres konstruktor hibas", 128, s1.getTarhelyMennyiseg());
        assertFalse("parameteres konstruktor hibas", s1.isBekapcsolva());

        s1.setGyarto("NASA");
        s1.setMemoriaMennyiseg(1);
        s1.setTarhelyMennyiseg(32);
        assertEquals("parameteres konstruktor hibas", "NASA", s1.getGyarto());
        assertEquals("parameteres konstruktor hibas", 1, s1.getMemoriaMennyiseg());
        assertEquals("parameteres konstruktor hibas", 32, s1.getTarhelyMennyiseg());
        assertFalse("parameteres konstruktor hibas", s1.isBekapcsolva());
    }

    @Test
    public void testBeKiKapcsol() {
        Szamitogep s1 = new Szamitogep();
        s1.bekapcsol();
        assertTrue("bekapcsolas hibas", s1.isBekapcsolva());
        s1.bekapcsol();
        assertTrue("bekapcsolas hibas", s1.isBekapcsolva());
        s1.kikapcsol();
        assertFalse("bekapcsolas hibas", s1.isBekapcsolva());
        s1.kikapcsol();
        assertFalse("bekapcsolas hibas", s1.isBekapcsolva());
        s1.bekapcsol();
        assertTrue("bekapcsolas hibas", s1.isBekapcsolva());
    }

    @Test
    public void testBovites() {
        Szamitogep s1 = new Szamitogep("Kaktuszmacska BT", 10, 20);
        s1.memoriatBovit();
        assertEquals("memoria bovites hibas", 20, s1.getMemoriaMennyiseg());
        s1.memoriatBovit();
        assertEquals("memoria bovites hibas", 40, s1.getMemoriaMennyiseg());
        s1.tarhelyetBovit(2);
        assertEquals("tarhely bovites hibas", 40, s1.getTarhelyMennyiseg());
        s1.tarhelyetBovit(100);
        assertEquals("tarhely bovites hibas", 4000, s1.getTarhelyMennyiseg());

        s1.bekapcsol();
        s1.tarhelyetBovit(15);
        assertEquals("a gep nem hibasodik meg", 0, s1.getMemoriaMennyiseg());
        assertEquals("a gep nem hibasodik meg", 0, s1.getTarhelyMennyiseg());
        assertFalse("a gep nem hibasodik meg", s1.isBekapcsolva());

        s1.setTarhelyMennyiseg(400);
        s1.setMemoriaMennyiseg(200);
        s1.bekapcsol();
        s1.memoriatBovit();
        assertEquals("a gep nem hibasodik meg", 0, s1.getMemoriaMennyiseg());
        assertEquals("a gep nem hibasodik meg", 0, s1.getTarhelyMennyiseg());
        assertFalse("a gep nem hibasodik meg", s1.isBekapcsolva());
    }

    @Test
    public void testTarhelyMennyiseg() {
        Szamitogep s1 = new Szamitogep("Cirmi KFT", 16, 160);
        assertEquals("tarhelymennyiseg metodus hibas", 10, s1.tarhelyMennyiseg(), 0.0001);

        Szamitogep s2 = new Szamitogep("Cirmi KFT", 100, 150);
        assertEquals("tarhelymennyiseg metodus hibas", 1.5, s2.tarhelyMennyiseg(), 0.0001);

        Szamitogep s3 = new Szamitogep("Cirmi KFT", 128, 64);
        assertEquals("tarhelymennyiseg metodus hibas", 0.5, s3.tarhelyMennyiseg(), 0.0001);
    }

    @Test
    public void testToString() {
        Szamitogep s1 = new Szamitogep("Doubleel", 128, 512);
        String res = s1.toString();
        assertTrue("toString hibas", res.contains("Doubleel"));
        assertTrue("toString hibas", res.contains("128"));
        assertTrue("toString hibas", res.contains("512"));
        assertTrue("toString hibas", res.contains("false") || res.contains("nincs") || res.contains("kikapcsolva") || res.contains("kikapcsolt"));

        Szamitogep s2 = new Szamitogep("Floatel", 12, 55);
        s2.bekapcsol();
        res = s2.toString();
        assertTrue("toString hibas", res.contains("Floatel"));
        assertTrue("toString hibas", res.contains("12"));
        assertTrue("toString hibas", res.contains("55"));
        assertTrue("toString hibas", res.contains("true") || res.contains("bekapcsolva") || res.contains("bekapcsolt"));
    }
}