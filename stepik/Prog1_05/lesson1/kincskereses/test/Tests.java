import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt01() {
        int elvart = 0;
        Targy[] targies = {
                new Kacat(5),
                new Kacat(7),
                new Kacat(3),
                new Kacat(2)
        };

        Kincskereses k = new Kincskereses();
        assertEquals("Hibas eredmeny", elvart, k.keres(targies));
    }

    @Test
    public void teszt02() {
        int elvart = 0;
        Targy[] targies = {
                new Lom(6),
                new Lom(0),
                new Kacat(2)
        };

        Kincskereses k = new Kincskereses();
        assertEquals("Hibas eredmeny", elvart, k.keres(targies));
    }

    @Test
    public void teszt03() {
        int elvart = 2;
        Targy[] targies = {
                new Lom(6),
                new Nyaklanc(3),
                new Lom(0),
                new Gyuru(6),
                new Kacat(2)
        };

        Kincskereses k = new Kincskereses();
        assertEquals("Hibas eredmeny", elvart, k.keres(targies));
    }

    @Test
    public void teszt04() {
        int elvart = 4;
        Targy[] targies = {
                new Nyaklanc(6),
                new Gyuru(8),
                new Gyuru(10),
                new Nyaklanc(2)
        };

        Kincskereses k = new Kincskereses();
        assertEquals("Hibas eredmeny", elvart, k.keres(targies));
    }

    @Test
    public void teszt05() {
        int elvart = 4;
        Targy[] targies = {
                new Gyuru(0),
                new Lom(100),
                new Kacat(100),
                new Gyuru(0),
                new Ekszer(5) {},
                new Ekszer(10000) {},
                new Kacat(30),
                new Targy(4) {}
        };

        Kincskereses k = new Kincskereses();
        assertEquals("Hibas eredmeny", elvart, k.keres(targies));
    }

    @Test
    public void teszt06() {
        class Magnes extends Ekszer {
            public Magnes(int ertek) {
                super(ertek);
            }
        }

        class Rajzszog extends Kacat {
            public Rajzszog(int ertek) {
                super(ertek);
            }
        }

        int elvart = 5;
        Targy[] targies = {
                new Magnes(10),
                new Magnes(10),
                new Rajzszog(10),
                new Magnes(10),
                new Magnes(10),
                new Magnes(10)
        };

        Kincskereses k = new Kincskereses();
        assertEquals("Hibas eredmeny", elvart, k.keres(targies));
    }
}