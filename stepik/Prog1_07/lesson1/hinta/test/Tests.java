import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void fejlec() {
        assertTrue("Osztaly fejlece hibas (lemaradt a final?)", testClass(Hinta.class, Modifier.FINAL | Modifier.PUBLIC, Object.class));
    }

    @Test
    public void adattag() {
        assertTrue("lengedezodesiSebessegenekAMerteke adattag hianyzik (vagy nem int tipusu?)", testField(Hinta.class, "lengedezodesiSebessegenekAMerteke", int.class, Modifier.PUBLIC));
    }

    @Test
    public void getter() {
        Hinta h = new Hinta(10);
        assertEquals("lengedezodesiSebessegenekAMerteke erteke hibas", 100, h.lengedezodesiSebessegenekAMerteke);
        assertEquals("lengedezodesiSebessegenekAMerteke erteke hibas", 100, h.getLengedezodesiSebessegenekAMerteke());

        Hinta h2 = new Hinta(40);
        assertEquals("lengedezodesiSebessegenekAMerteke erteke hibas", 100, h2.lengedezodesiSebessegenekAMerteke);
        assertEquals("lengedezodesiSebessegenekAMerteke erteke hibas", 100, h2.getLengedezodesiSebessegenekAMerteke());
    }
}