import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt_01() {
        Bolygo b = new Bolygo();

        b.tavolsag = 149597887;
        b.keringesiSebesseg = 29.783;
        b.forgasiIdo = 1440;
        assertEquals("hibas eredmeny", 365, b.napokSzamaEvenkent());
    }

    @Test
    public void teszt_02() {
        Bolygo b = new Bolygo();

        b.tavolsag = 11000;
        b.keringesiSebesseg = 1.4;
        b.forgasiIdo = 300;
        assertEquals("hibas eredmeny", 2, b.napokSzamaEvenkent());
    }

    @Test
    public void teszt_03() {
        Bolygo b = new Bolygo();

        b.tavolsag = 412463;
        b.keringesiSebesseg = 11.1;
        b.forgasiIdo = 60;
        assertEquals("hibas eredmeny", 64, b.napokSzamaEvenkent());
    }

    @Test
    public void teszt_04() {
        Bolygo b = new Bolygo();

        b.tavolsag = 1412541563;
        b.keringesiSebesseg = 10.7443;
        b.forgasiIdo = 16000;
        assertEquals("hibas eredmeny", 860, b.napokSzamaEvenkent());
    }

    @Test
    public void teszt_05() {
        Bolygo b = new Bolygo();

        b.tavolsag = 2100000000;
        b.keringesiSebesseg = 0.001;
        b.forgasiIdo = 2880;
        assertEquals("hibas eredmeny", 76358154, b.napokSzamaEvenkent());
    }
}