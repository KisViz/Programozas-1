import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    public Pozicio createPozision(int a, int b) {
        Pozicio p = new Pozicio();
        p.x = a;
        p.y = b;
        return p;
    }

    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 0,  Eger.kurzormozgatas(createPozision(10, 10), createPozision(10, 10)));

    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 90, Eger.kurzormozgatas(createPozision(100, 300), createPozision(100, 600)));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 270, Eger.kurzormozgatas(createPozision(100, 600), createPozision(100, 353)));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 0, Eger.kurzormozgatas(createPozision(100, 300), createPozision(500, 300)));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 180, Eger.kurzormozgatas(createPozision(500, 300), createPozision(100, 300)));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 45, Eger.kurzormozgatas(createPozision(100, 100), createPozision(500, 500)));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", 53, Eger.kurzormozgatas(createPozision(100, 100), createPozision(400, 500)));
    }

    @Test
    public void teszt_08() {
        assertEquals("Hibas eredmeny", 355, Eger.kurzormozgatas(createPozision(313, 523), createPozision(745, 484)));
    }

    @Test
    public void teszt_09() {
        assertEquals("Hibas eredmeny", 174, Eger.kurzormozgatas(createPozision(1030, 523) ,createPozision(444, 587)));
    }

    @Test
    public void teszt_10() {
        assertEquals("Hibas eredmeny", 186, Eger.kurzormozgatas(createPozision(500, 500), createPozision(100, 460)));
    }
}