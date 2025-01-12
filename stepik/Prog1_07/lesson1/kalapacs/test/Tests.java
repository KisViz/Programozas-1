import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        Ember e = new Ember(new int[] {3, 5, 7, 8});
        String s = e.kalapal(5);
        assertEquals("hibas eredmeny", "majdnem sikerult", s);
    }

    @Test
    public void teszt_02() {
        Ember e = new Ember(new int[] {3, 5, 7, 8});
        String s2 = e.kalapal(0);
        assertEquals("hibas eredmeny", "hibas parameterek: nincs fal", s2);
    }

    @Test
    public void teszt_03() {
        Ember e2 = new Ember(null);
        String s3 = e2.kalapal(5);
        assertEquals("hibas eredmeny", "valami nem talalhato: nincsenek szogek", s3);
    }

    @Test
    public void teszt_04() {
        Ember e3 = new Ember(new int[] {});
        String s4 = e3.kalapal(5);
        assertEquals("hibas eredmeny", "majdnem sikerult", s4);
    }
}