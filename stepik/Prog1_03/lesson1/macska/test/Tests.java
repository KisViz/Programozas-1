import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_konstruktor() {
        Macska macska = new Macska("Cirmi", "lila", 7);
        assertEquals("nev hibas", "Cirmi", macska.getNev());
        assertEquals("szin hibas", "lila", macska.getSzin());
        assertEquals("meret hibas", 7, macska.getMeret());

        Macska macska2 = new Macska("Cirmi2", "szurke", 70);
        assertEquals("nev hibas", "Cirmi2", macska2.getNev());
        assertEquals("szin hibas", "szurke", macska2.getSzin());
        assertEquals("meret hibas", 70, macska2.getMeret());
    }

    @Test
    public void teszt_adattag() {
        assertTrue(testField(Macska.class, "nev", String.class, Modifier.PRIVATE | Modifier.FINAL));
    }
}