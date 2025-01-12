import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {

    @Test
    public void meret() {
        assertTrue("a meret adattag nem jo", testField(Mobiltelefon.class, "meret", int.class, 0));
    }

    @Test
    public void gyarto() {
        assertTrue("a gyarto adattag nem jo", testField(Mobiltelefon.class, "gyarto", String.class, 0));
    }

    @Test
    public void memoria() {
        assertTrue("a memoria adattag nem jo", testField(Mobiltelefon.class, "memoria", int.class, 0));
    }
}