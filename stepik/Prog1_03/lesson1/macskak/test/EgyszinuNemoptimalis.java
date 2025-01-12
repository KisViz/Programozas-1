import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EgyszinuNemoptimalis extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak0 = {
                createMacska("szurke", 8)
        };

        assertEquals(1, Etetes.etetes(macskak0, 1));
    }

    @Test
    public void teszt_02() {
        Macska[] macskak1 = {
                createMacska("szurke", 2),
                createMacska("szurke", 2),
                createMacska("szurke", 2),
                createMacska("szurke", 2),
                createMacska("szurke", 2)
        };

        assertEquals(1, Etetes.etetes(macskak1, 5));
    }

    @Test
    public void teszt_03() {
        Macska[]macskak = {
                createMacska("szurke", 2),
                createMacska("szurke", 7),
                createMacska("szurke", 4),
                createMacska("szurke", 5)
        };

        assertEquals(2, Etetes.etetes(macskak, 4));
    }

    @Test
    public void teszt_04() {
        Macska[] macskak2 = {
                createMacska("szurke", 2),
                createMacska("szurke", 6),
                createMacska("szurke", 9),
                createMacska("szurke", 2)
        };

        assertEquals(2, Etetes.etetes(macskak2, 4));
    }
}
