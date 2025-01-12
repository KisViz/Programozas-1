import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JatekmaciXElemuTomb {
    @Test
    public void teszt_01() {
        String[] tomb1 = Gyar.jatekmaciXElemuTomb(6);
        assertEquals("a tomb merete nem megfelelo", 6, tomb1.length);

        for (int i = 0; i < 6; i++) {
            assertEquals("a tomb N. eleme nem jatekmaci", "jatekmaci", tomb1[i]);
        }
    }

    @Test
    public void teszt_02() {
        String[] tomb2 = Gyar.jatekmaciXElemuTomb(46);
        assertEquals("a tomb merete nem megfelelo", 46, tomb2.length);

        for (int i = 0; i < 46; i++) {
            assertEquals("a tomb N. eleme nem jatekmaci", "jatekmaci", tomb2[i]);
        }
    }
}
