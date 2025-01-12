import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt() {
        Macska m = new Macska();
        //noinspection ConstantConditions
        assertTrue("nem jo az oroklodes", m instanceof Allat);
    }
}