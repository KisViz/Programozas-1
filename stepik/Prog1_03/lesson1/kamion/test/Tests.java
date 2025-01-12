import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void rendszam() {
        assertTrue("rendszam hibas", testField(Kamion.class, "rendszam", String.class, 0));
    }

    @Test
    public void maxTelefonok() {
        assertTrue("max telefonok hibas", testField(Kamion.class, "maxTelefonok", int.class, 0));
    }

    @Test
    public void hossz() {
        assertTrue("hossz hibas", testField(Kamion.class, "hossz", double.class, 0));
    }

    @Test
    public void szelesseg() {
        assertTrue("szelesseg hibas", testField(Kamion.class, "szelesseg", double.class, 0));
    }
}