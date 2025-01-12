import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobbszinuEgyszeru extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak = {
                createMacska("fekete", 3),
                createMacska("szurke", 5),
                createMacska("fekete", 7),
                createMacska("szurke", 5)
        };

        assertEquals(2, Etetes.etetes(macskak, 4));
    }

    @Test
    public void teszt_02() {
        Macska[] macskak3 = {
                createMacska("barna", 4),
                createMacska("narancs", 3),
                createMacska("rozsaszin", 5),
                createMacska("piros", 4),
                createMacska("kek", 3),
                createMacska("szurke", 1),
                createMacska("feher", 1),
                createMacska("fekete", 2),
                createMacska("bordo", 4),
                createMacska("sarga", 2),
                createMacska("hatilyenszines", 3),
                createMacska("tobbszinu", 1)
        };

        assertEquals(12, Etetes.etetes(macskak3, 12));
    }
}
