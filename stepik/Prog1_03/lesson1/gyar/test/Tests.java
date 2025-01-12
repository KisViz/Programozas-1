import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void csokiGyartas() {
        Gyar gyar = new Gyar();
        Csoki csoki = gyar.csokiGyartas();
        assertEquals("csokigyartas hibas", Csoki.class, csoki == null ? null : csoki.getClass());
    }

    @Test
    public void szaloncukorGyartas() {
        Gyar gyar = new Gyar();
        Szaloncukor szaloncukor = gyar.szaloncukorGyartas();
        assertEquals("szaloncukorGyartas hibas", Szaloncukor.class, szaloncukor == null ? null : szaloncukor.getClass());
    }

    @Test
    public void kekszGyartas() {
        Gyar gyar = new Gyar();
        Keksz keksz = gyar.kekszGyartas();
        assertEquals("kekszGyartas hibas", Keksz.class, keksz == null ? null : keksz.getClass());
    }

    @Test
    public void nyalokaGyartas() {
        Gyar gyar = new Gyar();
        Nyaloka nyaloka = gyar.nyalokaGyartas();
        assertEquals("nyalokaGyartas hibas", Nyaloka.class, nyaloka == null ? null : nyaloka.getClass());
    }
}