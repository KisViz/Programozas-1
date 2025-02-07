import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    Ember e1 = new Ember("a", 30, 55);
    Ember e2 = new Ember("aa", 66, 54);
    Ember e3 = new Ember("aaa", 85, 40);
    Ember e4 = new Ember("aaaa", 46, 30);
    Ember e5 = new Ember("aaaaa", 55, 20);
    Ember e6 = new Ember("b", 65, 100);
    Ember e7 = new Ember("bb", 69, 69);
    Ember e8 = new Ember("bbb", 77, 555);
    Ember e9 = new Ember("bbbb", 91, 400);
    Ember e10 = new Ember("bbbbb", 103, 1010);
    Ember e11 = new Ember("c", 68, 20000);

    List<Ember> l1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
    List<Ember> ll1 = Arrays.asList(e2, e3, e6, e7);

    List<Ember> l2 = Collections.emptyList();
    List<Ember> ll2 = Collections.emptyList();

    List<Ember> l3 = Arrays.asList(e2, e4, e6);
    List<Ember> ll3 = Arrays.asList(e2, e6);

    List<Ember> l4 = Arrays.asList(e1, e4, e5);
    List<Ember> ll4 = Collections.emptyList();

    List<Ember> l5 = Arrays.asList(e10, e8, e4, e2, e3, e1);
    List<Ember> ll5 = Arrays.asList(e10, e8, e2, e3);

    List<Ember> l6 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    List<Ember> ll6 = Arrays.asList(e2, e3,e6, e7, e8, e9, e10, e11);

    @Test
    public void teszt_01() {
        Fesztival f1 = new Fesztival();
        f1.belepes(l1);
        assertTrue("a belepes metoduson ne modosits!", listEquals(f1.emberek, l1, true));
        f1.kidobas();
        assertTrue("hibas eredmeny!", listEquals(f1.emberek, ll1, true));
    }

    @Test
    public void teszt_02() {
        Fesztival f1 = new Fesztival();
        f1 = new Fesztival();
        f1.belepes(l2);
        assertTrue("a belepes metoduson ne modosits!", listEquals(f1.emberek, l2, true));
        f1.kidobas();
        assertTrue("hibas eredmeny!", listEquals(f1.emberek, ll2, true));
    }

    @Test
    public void teszt_03() {
        Fesztival f1 = new Fesztival();
        f1 = new Fesztival();
        f1.belepes(l3);
        assertTrue("a belepes metoduson ne modosits!", listEquals(f1.emberek, l3, true));
        f1.kidobas();
        assertTrue("hibas eredmeny!", listEquals(f1.emberek, ll3, true));
    }

    @Test
    public void teszt_04() {
        Fesztival f1 = new Fesztival();
        f1 = new Fesztival();
        f1.belepes(l4);
        assertTrue("a belepes metoduson ne modosits!", listEquals(f1.emberek, l4, true));
        f1.kidobas();
        assertTrue("hibas eredmeny!", listEquals(f1.emberek, ll4, true));
    }

    @Test
    public void teszt_05() {
        Fesztival f1 = new Fesztival();
        f1 = new Fesztival();
        f1.belepes(l5);
        assertTrue("a belepes metoduson ne modosits!", listEquals(f1.emberek, l5, true));
        f1.kidobas();
        assertTrue("hibas eredmeny!", listEquals(f1.emberek, ll5, true));
    }

    @Test
    public void teszt_06() {
        Fesztival f1 = new Fesztival();
        f1 = new Fesztival();
        f1.belepes(l6);
        assertTrue("a belepes metoduson ne modosits!", listEquals(f1.emberek, l6, true));
        f1.kidobas();
        assertTrue("hibas eredmeny!", listEquals(f1.emberek, ll6, true));
    }
}