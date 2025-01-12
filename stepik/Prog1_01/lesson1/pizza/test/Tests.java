import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    public Rendeles create(int a, float b, int c, int d) {
        Rendeles r = new Rendeles();
        r.idopont = a;
        r.tavolsag = b;
        r.ar = c;
        r.elkeszitesiIdo = d;
        return r;
    }

    @Test
    public void egyszeru() {
        Rendeles[] rendelesek = {
            create(12, 10, 1000, 1),
            create(14, 1, 1200, 30),
            create(20, 17, 500, 4),
            create(23, 2, 660, 5),
            };

        assertEquals("Hibas eredmeny", 3360, Pizza.pizzaszallitas(rendelesek));
    }

    @Test
    public void lassu_elkeszites() {
        Rendeles[] rendelesek = {
            create(12, 10, 1000, 1),
            create(14, 5, 1200, 58),
            create(12, 10, 500, 55),
            create(23, 2, 660, 5),
        };

        assertEquals("Hibas eredmeny", -1740, Pizza.pizzaszallitas(rendelesek));
    }

    @Test
    public void tavoli_helyek() {
        Rendeles[] rendelesek = {
            create(20, 41, 1000, 1),
            create(20, 41, 750, 3),
            create(20, 38, 1100, 1)
        };

        assertEquals("Hibas eredmeny", -2400, Pizza.pizzaszallitas(rendelesek));
    }

    @Test
    public void osszetett_1() {
        Rendeles[] rendelesek = {
            create(20, 30, 1000, 5),
            create(8, 30, 800, 5),
            create(16, 30, 650, 5),
            create(17, 30, 440, 5)
        };

        assertEquals("Hibas eredmeny", -2780, Pizza.pizzaszallitas(rendelesek));
    }

    @Test
    public void osszetett_2() {
        Rendeles[] rendelesek2 = {
                create(20, 30, 1000, 15),
                create(8, 20, 800, 12),
                create(16, 20, 650, 11),
                create(17, 20, 440, 13)
        };

        assertEquals("Hibas eredmeny", 1570, Pizza.pizzaszallitas(rendelesek2));
    }
}