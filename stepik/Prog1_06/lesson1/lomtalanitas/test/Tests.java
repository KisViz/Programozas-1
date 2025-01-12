import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Targy t1 = new Targy("polo", 7);
        Targy t2 = new Targy("titanium fem menetes nyel", 0);
        Targy t3 = new Targy("magnes", 100);
        Targy t4 = new Targy("monitor", 95);
        Targy t5 = new Targy("asztal", 0);
        Targy t6 = new Targy("toll", 0);

        Raktar raktar = new Raktar();
        List<Targy> targyak = (List<Targy>) fieldValue(Raktar.class, "targyak", raktar);
        targyak.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

        raktar.lomtalanit();

        assertTrue("a lista helytelen", listEquals(new ArrayList<>(Arrays.asList(t1, t3, t4)), targyak, true));
    }

    @Test
    public void teszt_02() {
        Targy t1 = new Targy("polo", 7);
        Targy t3 = new Targy("magnes", 100);
        Targy t4 = new Targy("monitor", 95);

        Raktar raktar = new Raktar();
        List<Targy> targyak = (List<Targy>) fieldValue(Raktar.class, "targyak", raktar);
        targyak.addAll(Arrays.asList(t3, t4, t1, t1, t1));

        raktar.lomtalanit();

        assertTrue("a lista helytelen", listEquals(new ArrayList<>(Arrays.asList(t3, t4, t1, t1, t1)), targyak, true));
    }

    @Test
    public void teszt_03() {
        Targy t1 = new Targy("polo", 0);
        Targy t3 = new Targy("magnes", 0);
        Targy t4 = new Targy("monitor", 0);

        Raktar raktar = new Raktar();
        List<Targy> targyak = (List<Targy>) fieldValue(Raktar.class, "targyak", raktar);
        targyak.addAll(Arrays.asList(t1, t1, t1, t1, t1, t4, t3, t3));

        raktar.lomtalanit();

        assertTrue("a lista helytelen", listEquals(new ArrayList<>(Collections.emptyList()), targyak, true));
    }

    @Test
    public void teszt_04() {
        Raktar raktar = new Raktar();
        List<Targy> targyak = (List<Targy>) fieldValue(Raktar.class, "targyak", raktar);

        raktar.lomtalanit();

        assertTrue("a lista helytelen", listEquals(new ArrayList<>(Collections.emptyList()), targyak, true));
    }
}