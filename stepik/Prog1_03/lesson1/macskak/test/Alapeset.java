import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Alapeset extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak = {
                createMacska("szurke", 5),
                createMacska("szurke", 5),
                createMacska("szurke", 7),
                createMacska("szurke", 3)
        };

        assertEquals(2, Etetes.etetes(macskak, 4));
    }

    @Test
    public void teszt_02() {
        Macska[] macskak2 = {
                createMacska("barna", 10),
                createMacska("barna", 3),
                createMacska("barna", 3),
                createMacska("barna", 4)
        };

        assertEquals(2, Etetes.etetes(macskak2, 4));
    }
}
