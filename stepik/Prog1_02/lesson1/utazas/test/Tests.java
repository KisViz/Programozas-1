import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 1, Promocio.utazas("Jaj de szep delfin!"));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 1, Promocio.utazas("Meg szerencse, hogy nincs tulsozva ez a hus"));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 0, Promocio.utazas("sos, sos! Segitseg, bajban vagyunk!"));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 0, Promocio.utazas("Beleestem a vizbe, sos!"));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 0, Promocio.utazas("Hatalmas viharba keveredtunk, sos!"));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 1, Promocio.utazas("Nezd mar Jocoka, milyen szep a naplemente"));
    }
}