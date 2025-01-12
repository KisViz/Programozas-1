import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.*;

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
        Set<Allapot> allapotok = a.elerheto();
        assertEquals("az allapotok szama nem megfelelo", 4, allapotok.size());
        assertTrue("a visszaadott halmaz nem megfelelo", allapotok.containsAll(Arrays.asList(q0, q1, q4, q5)));
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
        Set<Allapot> allapotok = a.elerheto();
        assertEquals("az allapotok szama nem megfelelo", 3, allapotok.size());
        assertTrue("a visszaadott halmaz nem megfelelo", allapotok.containsAll(Arrays.asList(q0, q1, q2)));
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
        Allapot q7 = new Allapot(false);

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

        q6.getAtmenetek().put('l', q7);
        q6.getAtmenetek().put('e', q7);
        q6.getAtmenetek().put('c', q7);

        q7.getAtmenetek().put('l', q7);
        q7.getAtmenetek().put('e', q7);
        q7.getAtmenetek().put('c', q7);

        Automata a = new Automata(q0);

        Set<Allapot> allapotok = a.elerheto();
        assertEquals("az allapotok szama nem megfelelo", 8, allapotok.size());
        assertTrue("a visszaadott halmaz nem megfelelo", allapotok.containsAll(Arrays.asList(q0, q1, q2, q3, q4, q5, q6, q7)));
    }

}