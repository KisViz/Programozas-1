import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UresXElemuTomb {
    @Test
    public void teszt_01() {
        int[] tomb1 = Gyar.uresXElemuTomb(17);
        assertEquals("a tomb merete nem megfelelo", 17, tomb1.length);

        for (int i = 0; i < 17; i++) {
            assertEquals("a tomb N. eleme nem 0", 0, tomb1[i]);
        }
    }

    @Test
    public void teszt_02() {
        int[] tomb2 = Gyar.uresXElemuTomb(4);
        assertEquals("a tomb merete nem megfelelo", 4, tomb2.length);

        for (int i = 0; i < 4; i++) {
            assertEquals("a tomb N. eleme nem 0", 0, tomb2[i]);
        }
    }
}
