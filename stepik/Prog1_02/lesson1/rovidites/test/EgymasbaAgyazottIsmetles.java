import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EgymasbaAgyazottIsmetles {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", "AAxlkbasssssbasssss", Rovidites.dekodolas("AAxlk2(ba5s)"));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", "aabbaabbsaabbaabbsaabbaabbsq", Rovidites.dekodolas("3(2(aa2b)s)q"));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", "absssssqqqqqqqqabsssssqqqqqqqqabsssssqqqqqqqq", Rovidites.dekodolas("3(ab5s4(qq))"));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", "lomplplplplamplplplplaqlomplplplplamplplplplaqlomplplplplamplplplplaqy", Rovidites.dekodolas("3(lo2(m4(pl)a)q)y"));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", "lommmmmmmmmmmmplplplplammmmmmmmmmmmplplplplaqlommmmmmmmmmmmplplplplammmmmmmmmmmmplplplplaqlommmmmmmmmmmmplplplplammmmmmmmmmmmplplplplaqy", Rovidites.dekodolas("3(lo2(12m4(pl)a)q)y"));
    }

    @Test
    public void teszt_06() {
        assertEquals("hibas eredmeny", "ma", Rovidites.dekodolas("ma0(sa0hsa3(bk)5a)"));
    }

    @Test
    public void teszt_07() {
        assertEquals("hibas eredmeny", "ma", Rovidites.dekodolas("ma0(sa10000hsa300(bk)5a)"));
    }

    @Test
    public void teszt_08() {
        assertEquals("hibas eredmeny", "skbaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooobaooo", Rovidites.dekodolas("sk100(ba3(o))"));
    }
}
