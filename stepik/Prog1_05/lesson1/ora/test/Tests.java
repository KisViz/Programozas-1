import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt() {
        long start = System.currentTimeMillis();
        long res = new Ora().pontosido();
        long end = System.currentTimeMillis();
        assertTrue("a visszateresi ertek hibas", res >= start && res <= end);

        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        start = System.currentTimeMillis();
        res = new Ora().pontosido();
        end = System.currentTimeMillis();
        assertTrue("a visszateresi ertek hibas", res >= start && res <= end);
    }
}