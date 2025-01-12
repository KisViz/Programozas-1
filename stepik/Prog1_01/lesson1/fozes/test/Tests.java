import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    public Szek createSzek(int a, int b) {
        Szek s = new Szek();
        s.ar = a;
        s.futoeroLabankent = b;
        return s;
    }

    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 100, Konyha.fozes(createSzek(10, 1), createSzek(20, 2), 40));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 292, Konyha.fozes(createSzek(11, 2),  createSzek(15, 3), 230));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 110, Konyha.fozes(createSzek(100, 40),createSzek(10, 3), 161));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 120, Konyha.fozes(createSzek(100, 40),createSzek(10, 3), 173));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 1824, Konyha.fozes(createSzek(10, 4),  createSzek(12, 5), 3037));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 1822, Konyha.fozes(createSzek(10, 4),  createSzek(12, 5), 3033));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", 424120, Konyha.fozes(createSzek(12, 1),  createSzek(1000, 85), 144200));
    }

    @Test
    public void teszt_08() {
        assertEquals("Hibas eredmeny", 833333334, Konyha.fozes(createSzek(7, 2),   createSzek(10, 3), 1000000000));
    }

    @Test
    public void teszt_09() {
        assertEquals("Hibas eredmeny", 995280, Konyha.fozes(createSzek(202, 5), createSzek(1131, 28), 98560));
    }
}