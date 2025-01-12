import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testSolution() {
        Lo[] lovak = Lo.lovakOsszeallnak();
        assertNotNull("A visszaadott tomb null", lovak);
        assertEquals("a tomb merete nem megfelelo", 10, lovak.length);
        for (int i = 0; i < 10; i++) {
            //noinspection ConstantConditions
            assertTrue("a tombben az egyik pozicion nem lo van", lovak[i] instanceof Lo);
        }
    }
}