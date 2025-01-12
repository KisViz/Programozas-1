import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest{
    @Test
    public void fejlecek() {
        assertTrue("Osztaly fejlece hibas", testClass(TulNagySebesseg.class, Modifier.PUBLIC, RuntimeException.class));
        assertTrue("Parameteres konstruktor fejlece hibas", testConstructor(TulNagySebesseg.class, Modifier.PUBLIC, int.class));
    }

    @Test
    public void teszt_01() {
        assertEquals("konstruktor hibas", "nem kene 5 km/h-val menni", new TulNagySebesseg(5).getMessage());
    }

    @Test
    public void teszt_02() {
        assertEquals("konstruktor hibas", "nem kene 50 km/h-val menni", new TulNagySebesseg(50).getMessage());
    }

    @Test
    public void teszt_03() {
        assertEquals("konstruktor hibas", "nem kene 5000 km/h-val menni", new TulNagySebesseg(5000).getMessage());
    }

    @Test
    public void teszt_04() {
        assertEquals("konstruktor hibas", "nem kene 0 km/h-val menni", new TulNagySebesseg(0).getMessage());
    }

    @Test
    public void teszt_05() {
        assertEquals("konstruktor hibas", "nem kene -20 km/h-val menni", new TulNagySebesseg(-20).getMessage());
    }
}