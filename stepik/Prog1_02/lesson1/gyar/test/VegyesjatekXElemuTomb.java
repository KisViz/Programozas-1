import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegyesjatekXElemuTomb {
    @Test
    public void teszt_01() {
        String[] tomb1 = Gyar.vegyesjatekXElemuTomb("jatekvonat", "jatekkatona", 1);
        assertEquals("a tomb merete nem megfelelo", 1, tomb1.length);

        assertEquals("a tomb N. eleme nem megfelelo", "jatekvonat", tomb1[0]);
    }

    @Test
    public void teszt_02() {
        String[] tomb2 = Gyar.vegyesjatekXElemuTomb("igazivonat", "igazikatona", 24);
        assertEquals("a tomb merete nem megfelelo", 24, tomb2.length);

        for (int i = 0; i < 24; i++) {
            assertEquals("a tomb N. eleme nem megfelelo", (i%2==0)?"igazivonat":"igazikatona", tomb2[i]);
        }
    }
}
