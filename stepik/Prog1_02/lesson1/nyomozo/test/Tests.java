import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt_01() {
        assertTrue("Hibas eredmeny", Nyomozo.nyomkereses("konyha kes butor macska", "kes"));
    }

    @Test
    public void teszt_02() {
        assertFalse("Hibas eredmeny", Nyomozo.nyomkereses("kanape kulcs asztal felgyurodott szonyeg fuggony gyufa", "kes"));
    }

    @Test
    public void teszt_03() {
        assertFalse("Hibas eredmeny", Nyomozo.nyomkereses("kanape kulcs asztal felgyurodott szonyeg fuggony gyufa", "felgyurodott lepedo"));
    }

    @Test
    public void teszt_04() {
        assertTrue("Hibas eredmeny", Nyomozo.nyomkereses("eger tehen lo", "eger tehen"));
    }

    @Test
    public void teszt_05() {
        assertFalse("Hibas eredmeny", Nyomozo.nyomkereses("", "kes"));
    }

    @Test
    public void teszt_06() {
        assertFalse("Hibas eredmeny", Nyomozo.nyomkereses("butor polc konyvek", null));
    }

    @Test
    public void teszt_07() {
        assertFalse("Hibas eredmeny", Nyomozo.nyomkereses(null, "kes"));
    }

    @Test
    public void teszt_08() {
        assertFalse("Hibas eredmeny", Nyomozo.nyomkereses(null, null));
    }
}