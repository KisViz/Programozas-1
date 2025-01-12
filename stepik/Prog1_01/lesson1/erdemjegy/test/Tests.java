import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", "Jutka neni, figyeljen oda milyen jegyet ad!", Erdemjegy.ertekeles(6));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", "elegtelen", Erdemjegy.ertekeles(1));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", "kozepes", Erdemjegy.ertekeles(3));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", "Jutka neni, figyeljen oda milyen jegyet ad!", Erdemjegy.ertekeles(381770));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", "jo", Erdemjegy.ertekeles(4));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", "elegseges", Erdemjegy.ertekeles(2));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", "jeles", Erdemjegy.ertekeles(5));
    }

    @Test
    public void teszt_08() {
        assertEquals("hibas eredmeny", "Jutka neni, figyeljen oda milyen jegyet ad!", Erdemjegy.ertekeles(0));
    }

    @Test
    public void teszt_09() {
        assertEquals("hibas eredmeny", "Jutka neni, figyeljen oda milyen jegyet ad!", Erdemjegy.ertekeles(-23411));
    }
}