import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void zombi() {
        assertEquals("zombi modosult", 1, fieldCount(Zombi.class));
        assertEquals("zombi modosult", 2, methodCount(Zombi.class));
        assertEquals("zombi modosult", 1, constructorCount(Zombi.class));
    }

    @Test
    public void sebez() {
        Zombi z1 = new Zombi();
        z1.setElet(10);

        Zombi z2 = new Zombi();
        z2.setElet(40);

        Harcos h = new Harcos();
        h.sebez(z1, 5);
        assertEquals("sebez nem jol mukodik", 5, z1.getElet());

        h.sebez(z1, 10);
        assertEquals("sebez nem jol mukodik", -5, z1.getElet());

        h.sebez(z2, 3);
        assertEquals("sebez nem jol mukodik", 37, z2.getElet());

        h.sebez(z2, 6);
        assertEquals("sebez nem jol mukodik", 31, z2.getElet());
    }
}