import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Pikachu {
    public void tamad() {
        throw new Aramutes("pika pika");
    }
}

public class Tests {
    @Test
    public void teszt_01() {
        Aramutes a = new Aramutes("pika");
        assertEquals("hibas eredmeny", "pika", a.getMessage());
    }

    @Test
    public void teszt_02() {
        RuntimeException re = new Aramutes("raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz");
        assertEquals("hibas eredmeny", "raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", re.getMessage());
    }
}