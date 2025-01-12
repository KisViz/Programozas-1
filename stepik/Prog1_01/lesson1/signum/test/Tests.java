import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", -1, Matematika.signum(-4));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", -1, Matematika.signum(-85.43));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", -1, Matematika.signum(-0.01));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 1, Matematika.signum(68));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 1, Matematika.signum(0.01));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 1, Matematika.signum(36));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", 0, Matematika.signum(0));
    }
}