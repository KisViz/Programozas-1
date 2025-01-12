import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    public Bolygo createBolygo(boolean kozet) {
        Bolygo b = new Bolygo();
        b.nev = "Mars";
        b.tomeg = 2;
        b.kozetbolygo = kozet;
        return b;
    }

    @Test
    public void teszt_01() {
        Bolygo[]bolygok1 = {
                createBolygo(true),
                createBolygo(true),
                createBolygo(true),
                createBolygo(false),
                createBolygo(false)
        };

        assertTrue("Hibas eredmeny", new Naprendszer().valosagos(bolygok1));
    }

    @Test
    public void teszt_02() {
        Bolygo[]bolygok2 = {
                createBolygo(true),
                createBolygo(false),
                createBolygo(false),
                createBolygo(false),
                createBolygo(false),
                createBolygo(false)
        };

        assertTrue("Hibas eredmeny", new Naprendszer().valosagos(bolygok2));
    }

    @Test
    public void teszt_03() {
        Bolygo[]bolygok3 = {
                createBolygo(true),
                createBolygo(true),
                createBolygo(true)
        };

        assertTrue("Hibas eredmeny", new Naprendszer().valosagos(bolygok3));
    }

    @Test
    public void teszt_04() {
        Bolygo[]bolygok4 = {
                createBolygo(true),
                createBolygo(true),
                createBolygo(false),
                createBolygo(false),
                createBolygo(true)
        };

        assertFalse("Hibas eredmeny", new Naprendszer().valosagos(bolygok4));
    }

    @Test
    public void teszt_05() {
        Bolygo[]bolygok5 = {
                createBolygo(true),
                createBolygo(true),
                createBolygo(false),
                createBolygo(false),
                createBolygo(true)
        };

        assertFalse("Hibas eredmeny", new Naprendszer().valosagos(bolygok5));
    }

    @Test
    public void teszt_06() {
        Bolygo[]bolygok6 = {
                createBolygo(true),
                createBolygo(false),
                createBolygo(false),
                createBolygo(true),
                createBolygo(true)
        };

        assertFalse("Hibas eredmeny", new Naprendszer().valosagos(bolygok6));
    }

    @Test
    public void teszt_07() {
        Bolygo[]bolygok7 = {
                createBolygo(false),
                createBolygo(false),
                createBolygo(false),
                createBolygo(false)
        };

        assertTrue("Hibas eredmeny", new Naprendszer().valosagos(bolygok7));
    }

    @Test
    public void teszt_08() {
        Bolygo[]bolygok8 = {
                createBolygo(true),
                createBolygo(false),
                createBolygo(true),
                createBolygo(false),
                createBolygo(true)
        };

        assertFalse("Hibas eredmeny", new Naprendszer().valosagos(bolygok8));
    }
}