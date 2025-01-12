import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobbszinuRandomsorrend extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak = {
                createMacska("fekete", 2),
                createMacska("szurke", 5),
                createMacska("fekete", 6),
                createMacska("szurke", 5),
                createMacska("szurke", 5),
                createMacska("fekete", 8),
                createMacska("szurke", 5),
                createMacska("fekete", 4)
        };

        assertEquals(4, Etetes.etetes(macskak, 8));
    }
}
