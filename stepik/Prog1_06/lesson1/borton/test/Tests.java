import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertSame;


public class Tests {
    Ember e1 = new Ember(50, "Marika neni");
    Ember e2 = new Ember(20, "Szabolcs");
    Ember e3 = new Ember(44, "Jozsi");
    Ember e4 = new Ember(40, "Otto");
    Ember e5 = new Ember(22, "Karoly");
    Ember e6 = new Ember(400, "Dante");

    @Test
    public void teszt_01() {
        Map<Ember, Integer> gy1 = new HashMap<Ember, Integer>() {{
            put(e1, 1);
            put(e2, 2);
        }};

        Borton b1 = new Borton(gy1);
        assertSame("hibas eredmeny", e1, b1.valasztas());
    }

    @Test
    public void teszt_02() {
        Map<Ember, Integer> gy2 = new HashMap<Ember, Integer>() {{
            put(e6, 1000);
            put(e5, 999);
        }};

        Borton b2 = new Borton(gy2);
        assertSame("hibas eredmeny", e5, b2.valasztas());
    }

    @Test
    public void teszt_03() {
        Map<Ember, Integer> gy3 = new HashMap<Ember, Integer>() {{
            put(e3, 5);
            put(e4, 0);
        }};

        Borton b3 = new Borton(gy3);
        assertSame("hibas eredmeny", e4, b3.valasztas());
    }

    @Test
    public void teszt_04() {
        Map<Ember, Integer> gy4 = new HashMap<Ember, Integer>() {{
            put(e1, 40);
            put(e2, 22);
            put(e3, 241);
            put(e4, 23);
            put(e5, 24);
            put(e6, 600);
        }};

        Borton b4 = new Borton(gy4);
        assertSame("hibas eredmeny", e2, b4.valasztas());
    }
}
