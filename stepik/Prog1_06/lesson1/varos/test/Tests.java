import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        Haz h1 = new Haz(5, 2);
        Haz h2 = new Haz(7, 3);
        Haz h3 = new Haz(7, 4);
        Haz h4 = new Haz(2, 2);
        Haz h5 = new Haz(70, 2);
        Haz h6 = new Haz(22, 3);
        Haz h7 = new Haz(5, 3);
        Haz h8 = new Haz(2, 22);
        Haz h9 = new Haz(10, 10);
        Haz h10 = new Haz(20, 20);

        Varos v1 = new Varos();
        Varos v2 = new Varos();

        List<Haz> v1Hazak = v1.hazak;
        List<Haz> v2Hazak = v2.hazak;

        v1.epites(h1);
        assertEquals("epites(haz) hibas", Arrays.asList(h1), v1Hazak);

        v1.epites(h2);
        assertEquals("epites(haz) hibas", Arrays.asList(h1, h2), v1Hazak);

        v1.epites(h3);
        assertEquals("epites(haz) hibas", Arrays.asList(h1, h2, h3), v1Hazak);

        v1.epites(new Haz[] {h4, h5});
        assertEquals("epites(haz tomb) hibas", Arrays.asList(h1, h2, h3, h4, h5), v1Hazak);

        v2.epites(new Haz[] {h6, h7, h8});
        assertEquals("epites(haz tomb) hibas", Arrays.asList(h6, h7, h8), v2Hazak);

        List<Haz> hazs = new ArrayList<>();
        hazs.add(h9);
        hazs.add(h10);
        v2.epites(hazs);
        assertEquals("epites(haz lista) hibas", Arrays.asList(h6, h7, h8, h9, h10), v2Hazak);

        v1.epites(v2);
        assertEquals("epites(varos) hibas", Arrays.asList(h1, h2, h3, h4, h5, h6, h7, h8, h9, h10), v1Hazak);

    }
}