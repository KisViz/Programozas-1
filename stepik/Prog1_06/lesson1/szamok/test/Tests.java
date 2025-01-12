import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        Szamok sz = new Szamok();
        sz.szamotHozzaad(7);
        sz.szamotHozzaad(5);
        sz.szamotHozzaad(3);
        assertEquals("hibas lista", Arrays.asList(7,5,3), sz.szamok);
        sz.szamotHozzaad(8);
        assertEquals("hibas lista", Arrays.asList(7,5,3,8), sz.szamok);
        sz.szamok.clear();
        assertEquals("hibas lista", Collections.emptyList(), sz.szamok);
    }
}