import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    Alkalmazas a1 = new Alkalmazas(30, "a");
    Alkalmazas a2 = new Alkalmazas(6, "b");
    Alkalmazas a3 = new Alkalmazas(89, "c");
    Alkalmazas a4 = new Alkalmazas(100, "d");
    Alkalmazas a5 = new Alkalmazas(3, "e");
    Alkalmazas a6 = new Alkalmazas(8, "f");
    Alkalmazas a7 = new Alkalmazas(101, "g");
    Alkalmazas a8 = new Alkalmazas(44, "h");

    @Test
    public void osztaly() {
        assertTrue("osztaly fejlece hibas", testClass(Telefon.class, Modifier.PUBLIC, Object.class));
    }

    @Test
    public void adattagok() {
        assertTrue("hibas adattag", testField(Telefon.class, "alkalmazasok", List.class, Modifier.PUBLIC));
    }

    @Test
    public void konstruktor() {
        assertTrue("konstruktor hibas", testConstructor(Telefon.class, Modifier.PUBLIC, List.class));

        Telefon t = new Telefon(new ArrayList<>(Collections.singletonList(new Alkalmazas(5, "a"))));
        assertSame("hibas adattag", t.alkalmazasok.get(0).getClass(), Alkalmazas.class);
    }

    @Test
    public void rendezettAlkalmazasok_01() {
        Telefon t1 = new Telefon(new ArrayList<>(Arrays.asList(a1, a2, a3)));
        assertEquals("rendezettAlkalmazasok hibas", Arrays.asList(a3, a1, a2), t1.rendezettAlkalmazasok());
    }

    @Test
    public void rendezettAlkalmazasok_02() {
        Telefon t2 = new Telefon(new ArrayList<>(Arrays.asList(a1, a3, a4, a7, a6, a8)));
        assertEquals("rendezettAlkalmazasok hibas", Arrays.asList(a7, a4, a3, a8, a1, a6), t2.rendezettAlkalmazasok());
    }

    @Test
    public void rendezettAlkalmazasok_03() {
        Telefon t3 = new Telefon(new ArrayList<>(Collections.singletonList(a4)));
        assertEquals("rendezettAlkalmazasok hibas", Collections.singletonList(a4), t3.rendezettAlkalmazasok());
    }

    @Test
    public void rendezettAlkalmazasok_04() {
        Telefon t4 = new Telefon(new ArrayList<>(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8)));
        assertEquals("rendezettAlkalmazasok hibas", Arrays.asList(a7, a4, a3, a8, a1, a6, a2, a5), t4.rendezettAlkalmazasok());
    }
}