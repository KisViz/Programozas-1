import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Tests {
    @Test
    public void testSolution() {
        Lista l = new Lista();

        try {
            assertEquals("osszegetSzamol hibas", 0, l.osszegetSzamol(new Tomb()));
            assertEquals("runtimeExceptionDarab hibas", 1, l.runtimeExceptionDarab());

            assertEquals("osszegetSzamol hibas", 0, l.osszegetSzamol(new Tomb(new int[]{3, 5, 7})));
            assertEquals("runtimeExceptionDarab hibas", 2, l.runtimeExceptionDarab());

            assertEquals("szetfoszlik hibas", 0, l.szetfoszlat(new Tomb()), 0.0001);
            assertEquals("runtimeExceptionDarab hibas", 3, l.runtimeExceptionDarab());

            assertEquals("szetfoszlik hibas", 0.1, l.szetfoszlat(new Tomb(new int[] {3, 2, 5})), 0.0001);
            assertEquals("runtimeExceptionDarab hibas", 3, l.runtimeExceptionDarab());

            assertEquals("szetfoszlik hibas", 0, l.szetfoszlat(new Tomb(new int[] {2, 4, 0, 5, 7})), 0.0001);
            assertEquals("runtimeExceptionDarab hibas", 3, l.runtimeExceptionDarab());

            assertEquals("szetfoszlik hibas", 0.1333333, l.szetfoszlat(new Tomb(new int[] {3, 2, 5})), 0.0001);
            assertEquals("runtimeExceptionDarab hibas", 3, l.runtimeExceptionDarab());

            l.beilleszt("5,3,5", new Tomb(new int[] {2, 4, 6}));
            assertEquals("runtimeExceptionDarab hibas", 3, l.runtimeExceptionDarab());

            l.beilleszt("macska,5,7", new Tomb(new int[] {2, 4, 6}));
            assertEquals("runtimeExceptionDarab hibas", 4, l.runtimeExceptionDarab());
        } catch (Exception e) {
            fail("Nem kellett volna kivetelt dobni!");
        }
    }
}