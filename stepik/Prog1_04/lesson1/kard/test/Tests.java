import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        assertEquals("hibas megoldas", Modifier.FINAL | Modifier.PUBLIC, ElesFeherEgykezesHegyesKard.class.getModifiers());
    }
}