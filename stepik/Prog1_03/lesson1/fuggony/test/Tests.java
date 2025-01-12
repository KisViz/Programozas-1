import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt1() {
        Fuggony fuggony = new Fuggony("piros", "pamut", 7);
        assertEquals("szin hibas", "piros", fieldValue(Fuggony.class, "szin", fuggony));
        assertEquals("anyag hibas", "pamut", fieldValue(Fuggony.class, "anyag", fuggony));
        assertEquals("hossz hibas", 7, fieldValue(Fuggony.class, "hossz", fuggony));
    }

    @Test
    public void teszt2() {
        Fuggony fuggony2 = new Fuggony("szurke", "vas", 10000);
        assertEquals("szin hibas", "szurke", fieldValue(Fuggony.class, "szin", fuggony2));
        assertEquals("anyag hibas", "vas", fieldValue(Fuggony.class, "anyag", fuggony2));
        assertEquals("hossz hibas", 10000, fieldValue(Fuggony.class, "hossz", fuggony2));
    }
}