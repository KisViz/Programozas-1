import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    Tetel t1 = new Tetel() {{ ar = 4; mennyiseg = 5; }}; // 20
    Tetel t2 = new Tetel() {{ ar = 7; mennyiseg = 11; }}; // 77
    Tetel t3 = new Tetel() {{ ar = 1; mennyiseg = 120; }}; // 120
    Tetel t4 = new Tetel() {{ ar = 100; mennyiseg = 1; }}; // 100
    Tetel t5 = new Tetel() {{ ar = 70; mennyiseg = 2; }}; //  140
    Tetel t6 = new Tetel() {{ ar = 25; mennyiseg = 120; }}; // 3000
    Tetel t7 = new Tetel() {{ ar = 1; mennyiseg = 1; }}; // 1

    @Test
    public void teszt_01() {
        Tetel[] tetelek = {t1};
        assertEquals("Hibas eredmeny", 20, Bevasarlas.bevasarlas(tetelek));
    }

    @Test
    public void teszt_02() {
        Tetel[] tetelek = {t3, t5, t6};
        assertEquals("Hibas eredmeny", 3260, Bevasarlas.bevasarlas(tetelek));
    }

    @Test
    public void teszt_03() {
        Tetel[] tetelek = {t2, t3, t4};
        assertEquals("Hibas eredmeny", 297, Bevasarlas.bevasarlas(tetelek));
    }

    @Test
    public void teszt_04() {
        Tetel[] tetelek = {t5, t5, t5, t5, t5};
        assertEquals("Hibas eredmeny", 700, Bevasarlas.bevasarlas(tetelek));
    }

    @Test
    public void teszt_05() {
        Tetel[] tetelek = {t1, t2, t3, t4, t5, t6, t7, t7};
        assertEquals("Hibas eredmeny", 3459, Bevasarlas.bevasarlas(tetelek));
    }
}