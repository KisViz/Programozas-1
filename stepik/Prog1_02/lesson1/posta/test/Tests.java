import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt_01() {
        assertFalse("Hibas eredmeny", Posta.atveheto(new String("Emma"), new String("Gyorgy")));
    }

    @Test
    public void teszt_02() {
        assertTrue("Hibas eredmeny", Posta.atveheto("Gabor", "Gabor"));
    }

    @Test
    public void teszt_03() {
        assertFalse("Hibas eredmeny", Posta.atveheto(new String("Agnes"), new String("Vivien")));
    }

    @Test
    public void teszt_04() {
        assertTrue("Hibas eredmeny", Posta.atveheto(new String("Peter"), new String("Peter")));
    }
}