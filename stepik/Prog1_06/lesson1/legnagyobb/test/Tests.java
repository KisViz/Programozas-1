import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Tests {
    Legnagyobb l = new Legnagyobb();

    @Test
    public void teszt_01() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(3, 5, 2, 8));
        assertEquals("Hibas eredmeny", 8, l.legnagyobb(s1));
    }

    @Test
    public void teszt_02() {
        Set<Integer> s2 = new HashSet<>(Arrays.asList(-4, -6, -1, -88, -53));
        assertEquals("Hibas eredmeny", -1, l.legnagyobb(s2));
    }

    @Test
    public void teszt_03() {
        Set<Integer> s3 = new HashSet<>(Arrays.asList(10, -4, -130, 52, 0));
        assertEquals("Hibas eredmeny", 52, l.legnagyobb(s3));
    }

    @Test
    public void teszt_04() {
        Set<Integer> s4 = new HashSet<>(Collections.singletonList(-4));
        assertEquals("Hibas eredmeny", -4, l.legnagyobb(s4));
    }

    @Test
    public void teszt_05() {
        Set<Integer> s5 = new HashSet<>(Collections.singletonList(1));
        assertEquals("Hibas eredmeny", 1, l.legnagyobb(s5));
    }
}