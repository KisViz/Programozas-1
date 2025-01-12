import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        Karakter k = new Karakter("Marika neni", 50, new Fegyver("tesztagyuro", 5, new Tolteny(7), new Tolteny(3)), new Lo("piros", 2));
        assertEquals("kodol hibas", "{\"nev\":\"Marika neni\",\"szint\":50,\"fegyver\":{\"tipus\":\"tesztagyuro\",\"sebzes\":5,\"toltenyek\":[{\"suly\":7.0},{\"suly\":3.0}]},\"lo\":{\"szin\":\"piros\",\"sebesseg\":2}}", Feldolgozo.kodol(k));
    }

    @Test
    public void teszt_02() {
        Karakter k2 = new Karakter("Juhaszka", 13, new Fegyver("medveolo", 4), null);
        assertEquals("kodol hibas", "{\"nev\":\"Juhaszka\",\"szint\":13,\"fegyver\":{\"tipus\":\"medveolo\",\"sebzes\":4,\"toltenyek\":[]}}", Feldolgozo.kodol(k2));
    }

    @Test
    public void teszt_03() {
        Karakter k3 = new Karakter("Gabor", 8, new Fegyver("pisztoly", 2, new Tolteny(5.4), new Tolteny(4.6), new Tolteny(7.77454)), new Lo("kek", 1));
        assertEquals("kodol hibas", "{\"nev\":\"Gabor\",\"szint\":8,\"fegyver\":{\"tipus\":\"pisztoly\",\"sebzes\":2,\"toltenyek\":[{\"suly\":5.4},{\"suly\":4.6},{\"suly\":7.77454}]},\"lo\":{\"szin\":\"kek\",\"sebesseg\":1}}", Feldolgozo.kodol(k3));
    }

    @Test
    public void teszt_04() {
        Karakter k4 = Feldolgozo.dekodol("{\"nev\":\"Marika neni\",\"szint\":50,\"fegyver\":{\"tipus\":\"tesztagyuro\",\"sebzes\":5,\"toltenyek\":[{\"suly\":7.0},{\"suly\":3.0}]},\"lo\":{\"szin\":\"piros\",\"sebesseg\":2}}");
        assertNotNull(k4);
        assertEquals("karakter nev hibas", "Marika neni", k4.getNev());
        assertEquals("karakter szint hibas", 50, k4.getSzint());
        assertEquals("Fegyver tipus hibas", "tesztagyuro", k4.getFegyver().getTipus());
        assertEquals("Fegyver sebzes hibas", 5, k4.getFegyver().getSebzes());

        Tolteny[] toltenyek = k4.getFegyver().getToltenyek();
        assertEquals("Fegyver toltenyek hibas", 2, toltenyek.length);
        assertEquals("Fegyver toltenyek hibas", 7.0, toltenyek[0].getSuly(), 0.00001);
        assertEquals("Fegyver toltenyek hibas", 3.0, toltenyek[1].getSuly(), 0.00001);

        assertEquals("Lo szin hibas", "piros", k4.getLo().getSzin());
        assertEquals("Lo sebesseg hibas", 2, k4.getLo().getSebesseg());
    }

    @Test
    public void teszt_05() {
        Karakter k5 = Feldolgozo.dekodol("{\"nev\":\"Juhaszka\",\"szint\":13,\"fegyver\":{\"tipus\":\"medveolo\",\"sebzes\":4,\"toltenyek\":[]}}");
        assertNotNull(k5);
        assertEquals("karakter nev hibas", "Juhaszka", k5.getNev());
        assertEquals("karakter szint hibas", 13, k5.getSzint());
        assertEquals("Fegyver tipus hibas", "medveolo", k5.getFegyver().getTipus());
        assertEquals("Fegyver sebzes hibas", 4, k5.getFegyver().getSebzes());

        Tolteny[] toltenyek2 = k5.getFegyver().getToltenyek();
        assertNotNull("Fegyver toltenyek hibas", toltenyek2);
        assertEquals("Fegyver toltenyek hibas", 0, toltenyek2.length);

        assertNull("Lo hibas", k5.getLo());
    }

    @Test
    public void teszt_06() {
        Karakter k6 = Feldolgozo.dekodol("{\"nev\":\"Gabor\",\"szint\":8,\"fegyver\":{\"tipus\":\"pisztoly\",\"sebzes\":2,\"toltenyek\":[{\"suly\":5.4},{\"suly\":4.6},{\"suly\":7.77454}]},\"lo\":{\"szin\":\"kek\",\"sebesseg\":1}}");
        assertNotNull(k6);
        assertEquals("karakter nev hibas", "Gabor", k6.getNev());
        assertEquals("karakter szint hibas", 8, k6.getSzint());
        assertEquals("Fegyver tipus hibas", "pisztoly", k6.getFegyver().getTipus());
        assertEquals("Fegyver sebzes hibas", 2, k6.getFegyver().getSebzes());

        Tolteny[] toltenyek3 = k6.getFegyver().getToltenyek();
        assertEquals("Fegyver toltenyek hibas", 3, toltenyek3.length);
        assertEquals("Fegyver toltenyek hibas", 5.4, toltenyek3[0].getSuly(), 0.00001);
        assertEquals("Fegyver toltenyek hibas", 4.6, toltenyek3[1].getSuly(), 0.00001);
        assertEquals("Fegyver toltenyek hibas", 7.77454, toltenyek3[2].getSuly(), 0.000001);

        assertEquals("Lo szin hibas", "kek", k6.getLo().getSzin());
        assertEquals("Lo sebesseg hibas", 1, k6.getLo().getSebesseg());
    }
}