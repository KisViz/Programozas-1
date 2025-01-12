import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        Auto a1 = new Auto("ASD", "AAA-111");
        Auto a2 = new Auto("ASD2", "BBB-111");
        Auto a3 = new Auto("ASD3", "CCC-111");
        Auto a4 = new Auto("ASD2", "DDD-111");
        Auto a5 = new Auto("ASD", "ABC-123");
        Auto a6 = new Auto("BHW", "WLB-362");

        Parkolo p = new Parkolo(2);
        List<Auto> lista = p.getAutok();

        assertEquals("hibas kapacitas", 2, p.getKapacitas());
        assertEquals("a lista hibas", Collections.emptyList(), lista);

        p.beall(a1);
        assertEquals("beallas utan a lista hibas", Collections.singletonList(a1), lista);

        p.beall(a2);
        assertEquals("beallas utan a lista hibas", Arrays.asList(a1, a2), lista);

        p.beall(a3);
        assertEquals("beallas utan a lista hibas", Arrays.asList(a1, a2), lista);

        p.bovit();
        assertEquals("bovites utan hibas kapacitas", 4, p.getKapacitas());

        p.beall(a4);
        assertEquals("beallas utan a lista hibas", Arrays.asList(a1, a2, a4), lista);

        p.beall(a5);
        assertEquals("beallas utan a lista hibas", Arrays.asList(a1, a2, a4, a5), lista);

        p.beall(a6);
        assertEquals("beallas utan a lista hibas", Arrays.asList(a1, a2, a4, a5), lista);

        p.kiall(a1);
        assertEquals("kiallas utan a lista hibas", Arrays.asList(a2, a4, a5), lista);

        p.kiall(a5);
        assertEquals("kiallas utan a lista hibas", Arrays.asList(a2, a4), lista);

        p.kiall(a6);
        assertEquals("kiallas utan a lista hibas", Arrays.asList(a2, a4), lista);

        p.ledozerol();
        assertEquals("ledozerolas utan a kapacitas hibas", 0, p.getKapacitas());
        assertEquals("ledozerolas utan a lista hibas", Collections.emptyList(), lista);
    }
}