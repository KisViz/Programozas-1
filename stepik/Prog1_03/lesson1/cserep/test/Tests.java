import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void adattagok() {
        testField(Cserep.class, "forma", String.class, Modifier.PRIVATE);
        testField(Cserep.class, "virag", Virag.class, Modifier.PRIVATE);
    }

    @Test
    public void konstruktor_2_parameteres() {
        testConstructor(Cserep.class, Modifier.PUBLIC, String.class, Virag.class);

        Virag v1 = new Virag("kek", 11);
        Virag v2 = new Virag("piros", 33);

        Cserep cs1 = new Cserep("szogletes", v1);
        Cserep cs2 = new Cserep("kerek", v2);

        assertSame(v1, fieldValue(Cserep.class, "virag", cs1));
        assertSame(v2, fieldValue(Cserep.class, "virag", cs2));

        assertEquals("szogletes", fieldValue(Cserep.class, "forma", cs1));
        assertEquals("kerek", fieldValue(Cserep.class, "forma", cs2));
    }

    @Test
    public void konstruktor_1_parameteres() {
        testConstructor(Cserep.class, Modifier.PUBLIC, String.class);

        Cserep cs1 = new Cserep("szogletes");
        Cserep cs2 = new Cserep("kerek");

        assertNull(fieldValue(Cserep.class, "virag", cs1));
        assertNull(fieldValue(Cserep.class, "virag", cs2));

        assertEquals("szogletes", fieldValue(Cserep.class, "forma", cs1));
        assertEquals("kerek", fieldValue(Cserep.class, "forma", cs2));
    }

}