import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void oroklodes() {
        Exception e = new KicsiMergesPokException("pooooook");
        assertTrue("Hibas oroklodes", e instanceof KicsiMergesPokException);
        assertFalse("Hibas oroklodes", e instanceof RuntimeException);
        assertSame("Hibas oroklodes", KicsiMergesPokException.class.getSuperclass(), Exception.class);
    }

    @Test
    public void mukodes() {
        KicsiMergesPokException e = new KicsiMergesPokException("szalad a pok");
        assertEquals("Hibas hibauzenet", "szalad a pok", e.getMessage());
    }
}