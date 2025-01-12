import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        Log.logError("HIBA");
        assertEquals("A standard outputra ne irodjon ki semmi", "", sout.toString());
        assertEquals("Hibas kiiratas", "HIBA" + System.lineSeparator(), serr.toString());
    }

    @Test
    public void teszt_02() {
        Log.logError("Valami nem mukodik...");
        assertEquals("A standard outputra ne irodjon ki semmi", "", sout.toString());
        assertEquals("Hibas kiiratas", "Valami nem mukodik..." + System.lineSeparator(), serr.toString());
    }

    @Test
    public void teszt_03() {
        Log.logError("404");
        assertEquals("A standard outputra ne irodjon ki semmi", "", sout.toString());
        assertEquals("Hibas kiiratas", "404" + System.lineSeparator(), serr.toString());
    }
}