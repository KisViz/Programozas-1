import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        Varos v = new Varos("Szeged", 30, 3.3);
        v.setNev("Budapest");
        v.setNepessegSzam(74);
        v.setTerulet(7.5);
        assertEquals("a nev erteke hibas", "Budapest", v.getNev());
        assertEquals("a nepessegszam erteke hibas", 74, v.getNepessegSzam());
        assertEquals("a terulet erteke hibas", 7.5, v.getTerulet(), 0.0001);
    }

    @Test
    public void teszt_02() {
        Varos v = new Varos("Szeged", 30, 3.3);
        v.setNev("Parizs");
        v.setNepessegSzam(704);
        v.setTerulet(17.75542);
        assertEquals("a nev erteke hibas", "Parizs", v.getNev());
        assertEquals("a nepessegszam erteke hibas", 704, v.getNepessegSzam());
        assertEquals("a terulet erteke hibas", 17.75542, v.getTerulet(), 0.0001);
    }
}