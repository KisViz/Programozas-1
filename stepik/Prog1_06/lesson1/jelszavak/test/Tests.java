import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void regisztral() {
        Rendszer r = new Rendszer();

        assertFalse("regisztral hibas", r.regisztral("ma", "aa4BBl"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral(null, "aa4BBl"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("maaaaa166", null));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral(null, null));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("maabb bbbs", "aa4BBl"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("mawra*fasva", "aa4BBl"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("madfsdfsa", "Ga7"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("maaaaaaaaaa", " aaBB33a"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("maaaaaaaaaaa", "aaBB33a "));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("maaaaaaaaaaaa", " aaBB33a "));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("vvvvvvvvava", "aaBBccDDee"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("vvvvvvvvava", "aa3aamvzz"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("vvvvvvvvava", "AASSMSKK43A"));
        assertEquals("regisztral hibas", 0, r.azonositok.size());

        assertTrue("regisztral hibas", r.regisztral("vvvvvvvvava", "AAaSSMSKK43A"));
        assertEquals("regisztral hibas", 1, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("vvvvvvvvava", "aaaaaAA55"));
        assertEquals("regisztral hibas", 1, r.azonositok.size());
        assertEquals("regisztral hibas", "AAaSSMSKK43A", r.azonositok.get("vvvvvvvvava"));

        assertTrue("regisztral hibas", r.regisztral("asdasd", "aaAA33"));
        assertEquals("regisztral hibas", 2, r.azonositok.size());

        assertTrue("regisztral hibas", r.regisztral("Kiscica2", "UlAFub3n"));
        assertEquals("regisztral hibas", 3, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("", "aaaaaAA44"));
        assertEquals("regisztral hibas", 3, r.azonositok.size());

        assertFalse("regisztral hibas", r.regisztral("aaaaaa", ""));
        assertEquals("regisztral hibas", 3, r.azonositok.size());
    }

    @Test
    public void belepes() {
        Rendszer r = new Rendszer();

        r.regisztral("macska", "aaAA33");
        r.regisztral("kutya23", "qqQQ44");
        r.regisztral("lovacska55", "anjasmSVn35");
        r.regisztral("bjnaakaAA", "2ajknAMAMa");

        assertFalse(r.belepes("aaaaaa", "aaAA33"));
        assertFalse(r.belepes("macska", "aaAAs33"));
        assertTrue(r.belepes("macska", "aaAA33"));
        assertFalse(r.belepes("kutya23", "aaAA33"));
        assertTrue(r.belepes("kutya23", "qqQQ44"));
        assertFalse(r.belepes("kutya233", "qqQQ44"));
        assertFalse(r.belepes(null, "aaAA33"));
        assertFalse(r.belepes("aaaaaa", null));
        assertFalse(r.belepes(null, null));
        assertTrue(r.belepes("lovacska55", "anjasmSVn35"));
        assertTrue(r.belepes("bjnaakaAA", "2ajknAMAMa"));
        assertFalse(r.belepes("bjnaakaAAA", "2ajknAMAMa"));
        assertTrue(r.belepes("kutya23", "qqQQ44"));
        assertFalse(r.belepes("", "aaBB33"));
        assertFalse(r.belepes("asdasdasd", ""));
    }
}