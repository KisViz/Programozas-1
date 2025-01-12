import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegyesIsmetles {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", "mmmmmmmmmmssssss", Rovidites.dekodolas("10m3(ss)"));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", "A mama otthon van...", Rovidites.dekodolas("A 2(ma) otthon van3."));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", "Osszesitve: abababcccaaabcabcabcabcss", Rovidites.dekodolas("O2szesitve: 3(ab)3caa4(abc)2s"));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", "aaabbbcccdddedededed", Rovidites.dekodolas("3a3b3c3(d)4(ed)"));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", "ababcttt", Rovidites.dekodolas("1a1b1(abc)3t"));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", "macskamacskamacskamacskamacskamacskamacskamacskamacskamacskamacska", Rovidites.dekodolas("11(macska)"));
    }
}
