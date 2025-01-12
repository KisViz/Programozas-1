import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        testMethod(Main.class, "main", void.class, Modifier.STATIC | Modifier.PUBLIC, String[].class);
    }
}