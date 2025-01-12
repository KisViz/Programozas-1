import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt1() {
        assertEquals("Hibas eredmeny!", Szorzas.szoroz(5, 4), 20, 0.0001f);
    }

    @Test
    public void teszt2() {
        assertEquals("Hibas eredmeny!", Szorzas.szoroz(5.5, 4), 22, 0.0001f);
    }

    @Test
    public void teszt3() {
        assertEquals("Hibas eredmeny!", Szorzas.szoroz(7.22, -4.25), -30.685, 0.0001f);
    }

    @Test
    public void teszt4() {
        assertEquals("Hibas eredmeny!", Szorzas.szoroz(-42.62, 3.56), -151.7272, 0.0001f);
    }

    @Test
    public void teszt5() {
        assertEquals("Hibas eredmeny!", Szorzas.szoroz(2.55, 0), 0, 0.0001f);
    }
}