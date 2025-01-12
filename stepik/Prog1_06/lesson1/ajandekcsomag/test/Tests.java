import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    Termek t1 = new Termek("a", 40);
    Termek t2 = new Termek("b", 33);
    Termek t3 = new Termek("c", 22);
    Termek t4 = new Termek("d", 55);
    Termek t5 = new Termek("e", 33);
    Termek t6 = new Termek("f", 20);
    Termek t7 = new Termek("g", 100);
    Termek t8 = new Termek("h", 30);
    Termek t9 = new Termek("g", 25);
    Termek t10 = new Termek("h", 10);

    @Test
    public void legdragabb() {
        List<Termek> tt1 = new ArrayList<>(Arrays.asList(t1, t2, t3, t6));
        List<Termek> tt2 = new ArrayList<>(Arrays.asList(t4, t5));
        List<Termek> tt3 = new ArrayList<>(Arrays.asList(t7));
        List<Termek> tt4 = new ArrayList<>(Arrays.asList(t8, t10));
        List<Termek> tt5 = new ArrayList<>(Arrays.asList(t9, t2, t5, t4));

        NyeremenyJatek j = new NyeremenyJatek();
        j.hozzaad(new ArrayList<>(tt1));
        j.hozzaad(new ArrayList<>(tt2));
        j.hozzaad(new ArrayList<>(tt3));
        j.hozzaad(new ArrayList<>(tt4));

        Set<List<Termek>> set = new HashSet<>(Arrays.asList(tt1, tt2, tt3, tt4));
        assertTrue("hozzaad hibas", setEquals(j.ajandekCsomagok, set, true));
        assertTrue("legdragabb hibas", listEquals(j.legdragabb(), tt1, true));

        NyeremenyJatek j2 = new NyeremenyJatek();
        j2.hozzaad(tt4);
        assertTrue("legdragabb hibas", listEquals(j2.legdragabb(), tt4, true));

        j2.hozzaad(tt2);
        assertTrue("legdragabb hibas", listEquals(j2.legdragabb(), tt2, true));

        j2.hozzaad(tt3);
        assertTrue("legdragabb hibas", listEquals(j2.legdragabb(), tt3, true));

        j2.hozzaad(tt1);
        assertTrue("legdragabb hibas", listEquals(j2.legdragabb(), tt1, true));

        j2.hozzaad(tt5);
        assertTrue("legdragabb hibas", listEquals(j2.legdragabb(), tt5, true));
    }

    @Test
    public void hozzaad() {
        List<Termek> tt1 = new ArrayList<>(Arrays.asList(t1, t2, t3, t6));
        List<Termek> tt2 = new ArrayList<>(Arrays.asList(t4, t5));
        List<Termek> tt3 = new ArrayList<>(Arrays.asList(t7));
        List<Termek> tt4 = new ArrayList<>(Arrays.asList(t8, t10));
        List<Termek> tt5 = new ArrayList<>(Arrays.asList(t9, t2, t5, t4));

        NyeremenyJatek j = new NyeremenyJatek();
        j.hozzaad(new ArrayList<>(tt1));
        j.hozzaad(new ArrayList<>(tt2));
        j.hozzaad(new ArrayList<>(tt3));
        j.hozzaad(new ArrayList<>(tt4));
        j.hozzaad(new ArrayList<>(tt5));

        Termek ut1 = new Termek("aaa", 220);
        j.hozzaad(ut1);
        tt4.add(ut1);
        Set<List<Termek>> set = new HashSet<>(Arrays.asList(tt1, tt2, tt3, tt4, tt5));
        assertTrue("hozzaad hibas", setEquals(j.ajandekCsomagok, set, true));

        Termek ut2 = new Termek("bb", 10);
        j.hozzaad(ut2);
        tt2.add(ut2);
        set = new HashSet<>(Arrays.asList(tt1, tt2, tt3, tt4, tt5));
        assertTrue("hozzaad hibas", setEquals(j.ajandekCsomagok, set, true));

        Termek ut3 = new Termek("bbb", 10);
        j.hozzaad(ut3);
        tt2.add(ut3);
        set = new HashSet<>(Arrays.asList(tt1, tt2, tt3, tt4, tt5));
        assertTrue("hozzaad hibas", setEquals(j.ajandekCsomagok, set, true));

        Termek ut4 = new Termek("bbbb", 10);
        j.hozzaad(ut4);
        tt3.add(ut4);
        set = new HashSet<>(Arrays.asList(tt1, tt2, tt3, tt4, tt5));
        assertTrue("hozzaad hibas", setEquals(j.ajandekCsomagok, set, true));
    }
}