import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt_01() {
        assertFalse(Zaszlo.torpezaszlo("piros;kek;zold"));
    }

    @Test
    public void teszt_02() {
        assertFalse(Zaszlo.torpezaszlo("piros;sarga;lila"));
    }

    @Test
    public void teszt_03() {
        assertFalse(Zaszlo.torpezaszlo("lila;piros;sarga"));
    }

    @Test
    public void teszt_04() {
        assertFalse(Zaszlo.torpezaszlo("kek;piros;lila;zold"));
    }

    @Test
    public void teszt_05() {
        assertFalse(Zaszlo.torpezaszlo("halvanypiros;hupilila"));
    }

    @Test
    public void teszt_06() {
        assertTrue(Zaszlo.torpezaszlo("lila;piros"));
    }

    @Test
    public void teszt_07() {
        assertTrue(Zaszlo.torpezaszlo("piros;lila"));
    }

    @Test
    public void teszt_08() {
        assertFalse(Zaszlo.torpezaszlo("piros;lila;zold"));
    }

    @Test
    public void teszt_09() {
        assertFalse(Zaszlo.torpezaszlo("feher;piros;lila"));
    }

    @Test
    public void teszt_10() {
        assertFalse(Zaszlo.torpezaszlo(null));
    }
}