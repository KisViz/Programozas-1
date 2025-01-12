import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    public void assertIdopontEquals(Idopont i1, Idopont i2) {
        assertEquals("hibas eredmeny", i1.ora, i2.ora);
        assertEquals("hibas eredmeny", i1.perc, i2.perc);
    }

    @Test
    public void idotartam_teszt() {
        assertTrue("az interface nem valtoztathato meg", testInterface(Idotartam.class, Modifier.PUBLIC | Modifier.ABSTRACT | Modifier.INTERFACE));
        assertTrue("az interface nem valtoztathato meg", testMethod(Idotartam.class, "getKezdet", Idopont.class, Modifier.PUBLIC | Modifier.ABSTRACT));
        assertTrue("az interface nem valtoztathato meg", testMethod(Idotartam.class, "getVeg", Idopont.class, Modifier.PUBLIC | Modifier.ABSTRACT));
        assertEquals("az interface nem valtoztathato meg", 2, methodCount(Idotartam.class));
    }

    @Test
    public void bolt_teszt() {
        Idopont i1 = new Idopont(5, 25);
        Idopont i2 = new Idopont(5, 26);
        Idopont i3 = new Idopont(7, 11);
        Idopont i4 = new Idopont(7, 14);
        Idopont i5 = new Idopont(7, 22);
        Idopont i6 = new Idopont(7, 55);
        Idopont i7 = new Idopont(8, 20);
        Idopont i8 = new Idopont(8, 44);
        Idopont i9 = new Idopont(9, 10);
        Idopont i10 = new Idopont(9, 59);
        Idopont i11 = new Idopont(10, 0);
        Idopont i12 = new Idopont(11, 11);
        Idopont i13 = new Idopont(12, 11);
        Idopont i14 = new Idopont(15, 20);
        Idopont i15 = new Idopont(15, 55);
        Idopont i16 = new Idopont(18, 20);
        Idopont i17 = new Idopont(20, 0);
        Idopont i18 = new Idopont(21, 0);
        Idopont i19 = new Idopont(21, 11);
        Idopont i20 = new Idopont(21, 30);

        Bolt b1 = new Bolt(24);
        List<Idopont> e1 = Arrays.asList(i1, i3, i4, i5);
        List<Idopont> t1 = Arrays.asList(i2, i4, i6, i7);
        List<Idotartam> r1 = b1.buntetendoEsetek(e1, t1);
        assertEquals("hibas eredmeny", 0, r1.size());

        Bolt b2 = new Bolt(19);
        List<Idotartam> r2 = b2.buntetendoEsetek(e1, t1);
        assertEquals("hibas eredmeny", 1, r2.size());
        assertIdopontEquals(new Idopont(7, 22), r2.get(0).getKezdet());
        assertIdopontEquals(new Idopont(7, 55), r2.get(0).getVeg());

        Bolt b3 = new Bolt(22);
        List<Idopont> e3 = Arrays.asList(i1, i2, i3, i4, i5, i6, i8, i8, i8);
        List<Idopont> t3 = Arrays.asList(i3, i4, i6, i8, i8, i8, i9, i9, i10);
        List<Idotartam> r3 = b3.buntetendoEsetek(e3, t3);
        assertEquals("hibas eredmeny", 1, r3.size());
        assertIdopontEquals(new Idopont(7, 22), r3.get(0).getKezdet());
        assertIdopontEquals(new Idopont(9, 10), r3.get(0).getVeg());

        Bolt b4 = new Bolt(33);
        List<Idopont> e4 = Arrays.asList(i1, i1, i1, i1, i3, i6, i8, i9, i9, i11, i12, i12);
        List<Idopont> t4 = Arrays.asList(i2, i4, i4, i4, i7, i10, i10, i10, i10, i17, i17, i17);
        List<Idotartam> r4 = b4.buntetendoEsetek(e4, t4);
        assertEquals("hibas eredmeny", 3, r4.size());
        assertIdopontEquals(new Idopont(5, 25), r4.get(0).getKezdet());
        assertIdopontEquals(new Idopont(5, 26), r4.get(0).getVeg());
        assertIdopontEquals(new Idopont(7, 11), r4.get(1).getKezdet());
        assertIdopontEquals(new Idopont(7, 14), r4.get(1).getVeg());
        assertIdopontEquals(new Idopont(9, 10), r4.get(2).getKezdet());
        assertIdopontEquals(new Idopont(9, 59), r4.get(2).getVeg());

        Bolt b5 = new Bolt(29);
        List<Idopont> e5 = Arrays.asList(i1, i1, i3, i4, i6, i7, i7, i11, i12, i12, i12, i12, i16, i19);
        List<Idopont> t5 = Arrays.asList(i2, i4, i7, i8, i10, i13, i14, i15, i16, i17, i18, i19, i20, i20);
        List<Idotartam> r5 = b5.buntetendoEsetek(e5, t5);
        assertEquals("hibas eredmeny", 2, r5.size());
        assertIdopontEquals(new Idopont(7, 55), r5.get(0).getKezdet());
        assertIdopontEquals(new Idopont(9, 59), r5.get(0).getVeg());
        assertIdopontEquals(new Idopont(10, 0), r5.get(1).getKezdet());
        assertIdopontEquals(new Idopont(21, 0), r5.get(1).getVeg());

        Bolt b6 = new Bolt(11);
        List<Idopont> e6 = Arrays.asList(i1, i2, i3, i4, i5, i6);
        List<Idopont> t6 = Arrays.asList(i2, i3, i4, i5, i6, i11);
        List<Idotartam> r6 = b6.buntetendoEsetek(e6, t6);
        assertEquals("hibas eredmeny", 0, r6.size());

        Bolt b7 = new Bolt(29);
        List<Idopont> e7 = Arrays.asList(i6, i1, i16, i4, i1, i12, i7, i11, i12, i7, i12, i12, i3, i19);
        List<Idopont> t7 = Arrays.asList(i7, i4, i2, i8, i20, i13, i14, i15, i17, i18, i16, i19, i20, i10);
        List<Idotartam> r7 = b7.buntetendoEsetek(e7, t7);
        assertEquals("hibas eredmeny", 2, r7.size());
        assertIdopontEquals(new Idopont(7, 55), r7.get(0).getKezdet());
        assertIdopontEquals(new Idopont(9, 59), r7.get(0).getVeg());
        assertIdopontEquals(new Idopont(10, 0), r7.get(1).getKezdet());
        assertIdopontEquals(new Idopont(21, 0), r7.get(1).getVeg());
    }
}