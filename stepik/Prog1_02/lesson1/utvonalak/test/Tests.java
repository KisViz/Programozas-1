import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 1, Utvonalak.legrovidebb(new int[] {6, 3, 5}));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 1, Utvonalak.legrovidebb(new int[] {6, 3, 5, 4, 5, 7}));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 4, Utvonalak.legrovidebb(new int[] {6, 4, 9, 11, 3, 6}));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 0, Utvonalak.legrovidebb(new int[] {6000}));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 2, Utvonalak.legrovidebb(new int[] {6, 6, 2, 2, 5, 4, 5, 7}));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", 0, Utvonalak.legrovidebb(new int[] {5, 5, 5, 5, 5, 5}));
    }

}