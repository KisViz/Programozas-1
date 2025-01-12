import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NovekvoXElemuTomb {
    @Test
    public void teszt_01() {
        int[] tomb1 = Gyar.novekvoXElemuTomb(17);
        assertEquals("a tomb merete nem megfelelo", 17, tomb1.length);

        for (int i = 0; i < 17; i++) {
            assertEquals("a tomb N. eleme nem megfelelo", i, tomb1[i]);
        }
    }

    @Test
    public void teszt_02() {
        int[] tomb2 = Gyar.novekvoXElemuTomb(40000);
        assertEquals("a tomb merete nem megfelelo", 40000, tomb2.length);

        for (int i = 0; i < 40000; i++) {
            assertEquals("a tomb N. eleme nem megfelelo", i, tomb2[i]);
        }
    }
}
