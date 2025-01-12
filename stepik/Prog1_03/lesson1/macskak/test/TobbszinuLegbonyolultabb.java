import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobbszinuLegbonyolultabb extends TestHelper {
    @Test
    public void teszt_01() {
        Macska[] macskak00 = {
                createMacska("szurke", 5),
                createMacska("kek", 7),
                createMacska("szurke", 3),
                createMacska("szurke", 3),
                createMacska("kek", 8),
                createMacska("szurke", 4),
                createMacska("szurke", 3),
                createMacska("kek", 6),
                createMacska("szurke", 2),
                createMacska("fekete", 5),
                createMacska("kek", 9),
                createMacska("fekete", 5),
                createMacska("kek", 6),
        };

        assertEquals(8, Etetes.etetes(macskak00, 13));
    }

    @Test
    public void teszt_02() {
        Macska[] macskak0 = {
                createMacska("zold", 2),
                createMacska("zold", 4),
                createMacska("fekete", 3),
                createMacska("zold", 2),
                createMacska("fekete", 3),
                createMacska("zold", 2),
                createMacska("fekete", 4),
                createMacska("fekete", 4),
                createMacska("zold", 5),
                createMacska("fekete", 3),
                createMacska("zold", 3),
                createMacska("fekete", 3),
                createMacska("zold", 2)
        };

        assertEquals(4, Etetes.etetes(macskak0, 13));
    }

    @Test
    public void teszt_03() {
        Macska[] macskak = {
                createMacska("fekete", 7),
                createMacska("feher", 4),
                createMacska("feher", 4),
                createMacska("fekete", 3),
                createMacska("feher", 4),
                createMacska("feher", 3),
                createMacska("feher", 4),
                createMacska("fekete", 8),
                createMacska("feher", 3),
                createMacska("feher", 3),
                createMacska("feher", 2),
                createMacska("feher", 3),
                createMacska("fekete", 2),
        };

        assertEquals(5, Etetes.etetes(macskak, 13));
    }

    @Test
    public void teszt_04() {
        Macska[] macskak1 = {
                createMacska("feher", 5),
                createMacska("feher", 3),
                createMacska("feher", 2),
                createMacska("feher", 4),
                createMacska("feher", 4),
                createMacska("feher", 2),
        };

        assertEquals(2, Etetes.etetes(macskak1, 6));
    }

    @Test
    public void teszt_05() {
        Macska[] macskak2 = {
                createMacska("barna", 5),
                createMacska("barna", 4),
                createMacska("barna", 3),
                createMacska("barna", 2),
                createMacska("barna", 6),
        };

        assertEquals(2, Etetes.etetes(macskak2, 5));
    }

    @Test
    public void teszt_06() {
        Macska[] macskak3 = {
                createMacska("barna", 4),
                createMacska("barna", 4),
                createMacska("barna", 3),
                createMacska("barna", 3),
                createMacska("barna", 3),
                createMacska("barna", 3),
        };

        assertEquals(2, Etetes.etetes(macskak3, 6));
    }
}
