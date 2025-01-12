import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void teszt_01() {
        Jatek j = new Jatek("Ori", 24.2, true);
        assertEquals("cim gettere nem jo", "Ori", j.getCim());
        assertEquals("hossz gettere nem jo", 24.2, j.getHossz(), 0.001);
        assertTrue("idegesito gettere nem jo", j.isIdegesito());
    }

    @Test
    public void teszt_02() {
        Jatek j2 = new Jatek("Forza", 55.3, false);
        assertEquals("cim gettere nem jo", "Forza", j2.getCim());
        assertEquals("hossz gettere nem jo", 55.3, j2.getHossz(), 0.001);
        assertFalse("idegesito gettere nem jo", j2.isIdegesito());
    }
}