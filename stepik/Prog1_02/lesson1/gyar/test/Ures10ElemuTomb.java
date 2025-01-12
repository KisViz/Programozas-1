import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ures10ElemuTomb {
    @Test
    public void teszt_01() {
        int[] tomb = Gyar.ures10ElemuTomb();
        assertEquals("a tomb merete nem megfelelo", 10, tomb.length);

        for (int i = 0; i < 10; i++) {
            assertEquals("a tomb N. eleme nem 0", 0, tomb[i]);
        }
    }









}