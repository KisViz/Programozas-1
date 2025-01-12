import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void adattagok() {
        assertTrue("nev adattag hibas", testField(Pilota.class, "nev", String.class, 0));
        assertTrue("eletkor adattag hibas", testField(Pilota.class, "eletkor", int.class, 0));
        assertTrue("tapasztalat adattag hibas", testField(Pilota.class, "tapasztalat", double.class, 0));
    }

    @Test
    public void metodus_fejlecek() {
        assertTrue("vezet metodus hibas", testMethod(Pilota.class, "vezet", boolean.class, 0, int.class));
        assertTrue("fejlodik metodus hibas", testMethod(Pilota.class, "fejlodik", void.class, 0));
        assertTrue("oregszik metodus hibas", testMethod(Pilota.class, "oregszik", void.class, 0));
    }

    @Test
    public void oregszik() {
        Pilota p = new Pilota();

        p.eletkor = 20;
        p.oregszik();
        assertEquals("az oregszik metodus nem mukodik", 21, p.eletkor);
        p.oregszik();
        assertEquals("az oregszik metodus nem mukodik", 22, p.eletkor);
    }

    @Test
    public void fejlodik() {
        Pilota p = new Pilota();

        p.tapasztalat = 30;
        p.fejlodik();
        assertEquals("a fejlodik metodus nem mukodik", 33, p.tapasztalat, 0.001);

        p.tapasztalat = 21.2;
        p.fejlodik();
        assertEquals("a fejlodik metodus nem mukodik", 23.32, p.tapasztalat, 0.001);
    }

    @Test
    public void vezet() {
        Pilota p = new Pilota();

        p.tapasztalat = 20;
        assertTrue("a vezet metodus nem mukodik", p.vezet(1));
        assertTrue("a vezet metodus nem mukodik", p.vezet(5));
        assertFalse("a vezet metodus nem mukodik", p.vezet(40));
        assertFalse("a vezet metodus nem mukodik", p.vezet(48));
        assertFalse("a vezet metodus nem mukodik", p.vezet(66));
    }
}