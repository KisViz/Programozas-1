import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void ember() {
        assertTrue("Ember: nev hibas", testField(Ember.class, "nev", String.class, Modifier.PRIVATE));
        assertTrue("Ember: eletkor hibas", testField(Ember.class, "eletkor", int.class, Modifier.PRIVATE));
        assertTrue("Ember: gyerekek hibas", testField(Ember.class, "gyerekek", List.class, Modifier.PRIVATE));

        Ember e = new Ember("abc", 30);

        e.getGyerekek().add(e);
        assertEquals("Ember: gyerekek hibas", e.getGyerekek().get(0).getClass(), Ember.class);
        assertSame("Ember: gyerekek hibas", e.getGyerekek().get(0), e);

        assertEquals("Ember: konstruktor hibas", 30, e.getEletkor());
        assertEquals("Ember: konstruktor hibas", "abc", e.getNev());
    }

    @Test
    public void jatszoter() {
        Ember e0 = new Ember("Margit neni", 152);
        Ember e1 = new Ember("Marika neni", 133);
        Ember e2 = new Ember("Joco bacsi", 101);
        Ember e3 = new Ember("Karoly bacsi", 88);
        Ember e4 = new Ember("Adel", 66);
        Ember e5 = new Ember("Miska", 48);
        Ember e6 = new Ember("Anett", 30);
        Ember e7 = new Ember("Judit", 23);
        Ember e8 = new Ember("Otto", 15);
        Ember e9 = new Ember("Karcsi", 13);
        Ember e10 = new Ember("Adam", 10);
        Ember e11 = new Ember("Szabolcs", 8);
        Ember e12 = new Ember("Anna", 5);
        Ember e13 = new Ember("Marika", 1);

        e0.getGyerekek().add(e2);
        e0.getGyerekek().add(e6);
        e2.getGyerekek().add(e4);
        e2.getGyerekek().add(e5);
        e4.getGyerekek().add(e12);
        e5.getGyerekek().add(e11);
        e6.getGyerekek().add(e9);
        e1.getGyerekek().add(e3);
        e1.getGyerekek().add(e7);
        e3.getGyerekek().add(e10);
        e7.getGyerekek().add(e8);
        e8.getGyerekek().add(e13);

        Jatszoter j = new Jatszoter();

        j.emberJon(e13);
        assertEquals("emberJon metodus utan hibas az emberek szama", 1, j.emberek.size());
        assertTrue("emberJon metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13)));

        j.emberJon(e5);
        assertEquals("emberJon metodus utan hibas az emberek szama", 3, j.emberek.size());
        assertTrue("emberJon metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11)));

        j.emberJon(e2);
        assertEquals("emberJon metodus utan hibas az emberek szama", 6, j.emberek.size());
        assertTrue("emberJon metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e2, e4, e12)));


        j.emberMegy(e12);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 5, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e2, e4)));

        j.emberMegy(e4);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 4, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e2)));

        j.emberMegy(e2);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 3, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11)));

        j.emberJon(e6);
        assertEquals("emberJon metodus utan hibas az emberek szama", 5, j.emberek.size());
        assertTrue("emberJon metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e6, e9)));

        j.emberMegy(e6);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 4, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e9)));

        j.emberJon(e1);
        assertEquals("emberJon metodus utan hibas az emberek szama", 9, j.emberek.size());
        assertTrue("emberJon metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e9, e1, e3, e7, e10, e8)));

        j.emberMegy(e1);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 8, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e9, e3, e7, e10, e8)));

        j.emberMegy(e8);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 8, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e9, e3, e7, e10, e8)));

        j.emberMegy(e3);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 8, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e9, e3, e7, e10, e8)));

        j.emberMegy(e10);
        assertEquals("emberMegy metodus utan hibas az emberek szama", 7, j.emberek.size());
        assertTrue("emberMegy metodus utan hibas az emberek halmaza", j.emberek.containsAll(Arrays.asList(e13, e5, e11, e9, e3, e7, e8)));

    }
}