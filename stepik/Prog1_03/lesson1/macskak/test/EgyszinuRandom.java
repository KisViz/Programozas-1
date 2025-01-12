import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EgyszinuRandom extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak = {
                createMacska("fekete", 3),
                createMacska("fekete", 5),
                createMacska("fekete", 7),
                createMacska("fekete", 5)
        };

        assertEquals(2, Etetes.etetes(macskak, 4));
    }

    @Test
    public void teszt_02() {
        Macska[] macskak2 = {
                createMacska("narancssarga", 9),
                createMacska("narancssarga", 5),
                createMacska("narancssarga", 1),
                createMacska("narancssarga", 2),
                createMacska("narancssarga", 4),
                createMacska("narancssarga", 5),
                createMacska("narancssarga", 1),
                createMacska("narancssarga", 3)
        };

        assertEquals(3, Etetes.etetes(macskak2, 8));
    }
}
