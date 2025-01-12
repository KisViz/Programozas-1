import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobbszinuBonyolult extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak0 = {
                createMacska("fekete", 3),
                createMacska("szurke", 5),
                createMacska("fekete", 5),
                createMacska("szurke", 7)
        };

        assertEquals(3, Etetes.etetes(macskak0, 4));
    }

    @Test
    public void teszt_02() {
        Macska[] macskak = {
                createMacska("szurke", 2),
                createMacska("szurke", 9),
                createMacska("fekete", 4),
                createMacska("feher", 1),
                createMacska("fekete", 5),
                createMacska("fekete", 7),
                createMacska("fekete", 1),
                createMacska("szurke", 1)
        };

        assertEquals(5, Etetes.etetes(macskak, 8));
    }

    @Test
    public void teszt_03() {
        Macska[] macskak2 = {
                createMacska("barna", 4),
                createMacska("szurke", 3),
                createMacska("feher", 5),
                createMacska("szurke", 4),
                createMacska("szurke", 3),
                createMacska("szurke", 1),
                createMacska("feher", 1),
                createMacska("szurke", 2),
                createMacska("barna", 4),
                createMacska("szurke", 2),
                createMacska("barna", 3),
                createMacska("barna", 1)
        };

        assertEquals(5, Etetes.etetes(macskak2, 12));
    }

    @Test
    public void teszt_04() {
        Macska[] macskak3 = {
                createMacska("barna", 8),
                createMacska("szurke", 3),
                createMacska("feher", 4),
                createMacska("szurke", 2),
                createMacska("szurke", 7),
                createMacska("narancssarga", 6),
                createMacska("feher", 10),
                createMacska("szurke", 9),
                createMacska("narancssarga", 8),
                createMacska("barna", 6),
                createMacska("feher", 5),
                createMacska("barna", 5)
        };

        assertEquals(10, Etetes.etetes(macskak3, 12));
    }
}
