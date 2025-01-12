import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void teszt_01() {
        Allapot q0 = new Allapot(false);
        Allapot q1 = new Allapot(false);
        Allapot q4 = new Allapot(true);
        Allapot q5 = new Allapot(false);

        q0.getAtmenetek().put('a', q1);
        q0.getAtmenetek().put('b', q5);

        q1.getAtmenetek().put('b', q1);
        q1.getAtmenetek().put('a', q4);

        q4.getAtmenetek().put('a', q4);
        q4.getAtmenetek().put('b', q1);

        q5.getAtmenetek().put('a', q5);
        q5.getAtmenetek().put('b', q5);

        Automata a = new Automata(q0);
        assertTrue(a.felismer("aa"));
        assertTrue(a.felismer("aaa"));
        assertTrue(a.felismer("aaaaaaaaaaa"));
        assertTrue(a.felismer("aaaa"));
        assertTrue(a.felismer("aba"));
        assertTrue(a.felismer("abbba"));
        assertTrue(a.felismer("abbbabbbbbaba"));
        assertFalse(a.felismer("baaaaaa"));
        assertFalse(a.felismer("b"));
        assertFalse(a.felismer("a"));
        assertFalse(a.felismer("ba"));
        assertFalse(a.felismer("ab"));
        assertFalse(a.felismer("baaaab"));
        assertFalse(a.felismer("ab"));
        assertFalse(a.felismer("aaaaaab"));
        assertFalse(a.felismer(""));
    }

    @Test
    public void teszt_02() {
        Allapot q0 = new Allapot(false);
        Allapot q1 = new Allapot(false);
        Allapot q2 = new Allapot(true);

        q0.getAtmenetek().put('a', q1);
        q0.getAtmenetek().put('b', q0);
        q1.getAtmenetek().put('a', q2);
        q1.getAtmenetek().put('b', q0);
        q2.getAtmenetek().put('a', q2);
        q2.getAtmenetek().put('b', q2);

        Automata a = new Automata(q0);
        assertFalse(a.felismer("a"));
        assertFalse(a.felismer("b"));
        assertTrue(a.felismer("baaaa"));
        assertFalse(a.felismer("babbababbab"));
        assertFalse(a.felismer("bababababa"));
        assertFalse(a.felismer("bbbbb"));
        assertTrue(a.felismer("aa"));
        assertTrue(a.felismer("aaa"));
        assertTrue(a.felismer("aaaa"));
        assertTrue(a.felismer("baaaab"));
        assertFalse(a.felismer(""));
    }

    @Test
    public void teszt_03() {
        Allapot q0 = new Allapot(false);
        Allapot q1 = new Allapot(true);
        Allapot q2 = new Allapot(false);
        Allapot q3 = new Allapot(false);
        Allapot q4 = new Allapot(true);
        Allapot q5 = new Allapot(true);
        Allapot q6 = new Allapot(true);

        q0.getAtmenetek().put('l', q5);
        q0.getAtmenetek().put('e', q1);
        q0.getAtmenetek().put('c', q4);

        q1.getAtmenetek().put('e', q1);
        q1.getAtmenetek().put('l', q2);
        q1.getAtmenetek().put('c', q2);

        q2.getAtmenetek().put('l', q2);
        q2.getAtmenetek().put('c', q2);
        q2.getAtmenetek().put('e', q2);

        q3.getAtmenetek().put('l', q2);
        q3.getAtmenetek().put('e', q2);
        q3.getAtmenetek().put('c', q6);

        q4.getAtmenetek().put('l', q2);
        q4.getAtmenetek().put('e', q2);
        q4.getAtmenetek().put('c', q4);

        q5.getAtmenetek().put('l', q2);
        q5.getAtmenetek().put('e', q3);
        q5.getAtmenetek().put('c', q2);

        q6.getAtmenetek().put('l', q6);
        q6.getAtmenetek().put('e', q6);
        q6.getAtmenetek().put('c', q6);

        Automata a = new Automata(q0);
        assertFalse(a.felismer(""));
        assertTrue(a.felismer("l"));
        assertTrue(a.felismer("e"));
        assertTrue(a.felismer("c"));
        assertFalse(a.felismer("le"));
        assertFalse(a.felismer("el"));
        assertFalse(a.felismer("cel"));
        assertTrue(a.felismer("lec"));
        assertTrue(a.felismer("leccc"));
        assertTrue(a.felismer("lecel"));
        assertFalse(a.felismer("lelecel"));
        assertFalse(a.felismer("lelelecel"));
        assertFalse(a.felismer("cel"));
        assertTrue(a.felismer("cccccccc"));
        assertTrue(a.felismer("eeeee"));
        assertFalse(a.felismer("llllllllllllle"));
        assertFalse(a.felismer("ellllllllll"));
        assertFalse(a.felismer("lc"));
        assertFalse(a.felismer("lelec"));
        assertFalse(a.felismer("llec"));
    }

}