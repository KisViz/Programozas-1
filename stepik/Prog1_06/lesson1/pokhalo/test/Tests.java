import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.*;

public class Tests extends BaseTest {

    @Test
    public void pokok() {
        assertTrue("halmaz hibas", testField(Pokhalo.class, "pokok", Set.class, Modifier.PUBLIC));
    }

    @Test
    public void minimalisTavolsag() {
        Pok p1 = new Pok(10, 5);
        Pok p2 = new Pok(4, -2);
        Pok p3 = new Pok(6, 6);
        Pok p4 = new Pok(-8.5, -3.3);
        Pok p5 = new Pok(1.1, -4.8);
        Pok p6 = new Pok(-4.2, 6.5);

        Pokhalo pokhalo = new Pokhalo();
        Set<Pok> pokok = pokhalo.pokok;

        assertNotNull("halmaz nincs inicializalva", pokok);

        pokok.add(p1);
        assertTrue("minimalisTavolsag hibas", Double.isNaN(pokhalo.minimalisTavolsag()));

        pokok.add(p2);
        assertEquals("minimalisTavolsag hibas", 9.2195, pokhalo.minimalisTavolsag(), 0.001);

        pokok.add(p3);
        assertEquals("minimalisTavolsag hibas", 4.1231, pokhalo.minimalisTavolsag(), 0.001);

        pokok.clear();
        pokok.add(p5);
        pokok.add(p6);
        pokok.add(p4);
        assertEquals("minimalisTavolsag hibas", 9.7165, pokhalo.minimalisTavolsag(), 0.001);

        pokok.add(p3);
        pokok.add(p1);
        assertEquals("minimalisTavolsag hibas", 4.1231, pokhalo.minimalisTavolsag(), 0.001);

        pokok.add(p2);
        assertEquals("minimalisTavolsag hibas", 4.0311, pokhalo.minimalisTavolsag(), 0.001);

        pokok.clear();
        pokok.add(p2);
        pokok.add(p6);
        pokok.add(p4);
        assertEquals("minimalisTavolsag hibas", 10.7019, pokhalo.minimalisTavolsag(), 0.001);
    }
}