import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Tests {
    Ruha r1 = new Ruha(5, "piros");
    Ruha r2 = new Ruha(7, "kek");
    Ruha r3 = new Ruha(7, "piros");
    Ruha r4 = new Ruha(12, "zold");
    Ruha r5 = new Ruha(15, "szines");
    Ruha r6 = new Ruha(17, "fekete");
    Ruha r7 = new Ruha(20, "furaszinu");
    Ruha r8 = new Ruha(22, "atlatszo");
    Ruha r9 = new Ruha(200000, "tukrozodo");
    Ruha r10 = new Ruha(40, "piros");

    @Test
    public void teszt_01() {
        RuhasSzekreny szekreny1 = new RuhasSzekreny(new ArrayList<>(Arrays.asList(r1, r2, r5, r6, r7)));
        szekreny1.pirosakatTorol();
        assertEquals("hibas megoldas", Arrays.asList(r2, r5, r6, r7), szekreny1.getRuhak());
    }

    @Test
    public void teszt_02() {
        RuhasSzekreny szekreny2 = new RuhasSzekreny(new ArrayList<>(Collections.singletonList(r2)));
        szekreny2.pirosakatTorol();
        assertEquals("hibas megoldas", Collections.singletonList(r2), szekreny2.getRuhak());
    }

    @Test
    public void teszt_03() {
        RuhasSzekreny szekreny3 = new RuhasSzekreny(new ArrayList<>(Arrays.asList(r1, r3, r10)));
        szekreny3.pirosakatTorol();
        assertEquals("hibas megoldas", Collections.emptyList(), szekreny3.getRuhak());
    }

    @Test
    public void teszt_04() {
        RuhasSzekreny szekreny4 = new RuhasSzekreny(new ArrayList<>(Arrays.asList(r4, r5, r6, r7, r8, r9)));
        szekreny4.pirosakatTorol();
        assertEquals("hibas megoldas", Arrays.asList(r4, r5, r6, r7, r8, r9), szekreny4.getRuhak());
    }

}