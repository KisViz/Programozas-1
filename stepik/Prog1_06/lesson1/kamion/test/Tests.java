import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        Kamion k = new Kamion(5);
        assertArrayEquals("a tomb nem megfelelo", new int[] {0, 0, 0, 0, 0}, k.csomagok);
        k.csomagotFelvesz(10);
        assertArrayEquals("a tomb nem megfelelo", new int[] {10, 0, 0, 0, 0}, k.csomagok);
        k.csomagotFelvesz(5);
        assertArrayEquals("a tomb nem megfelelo", new int[] {10, 5, 0, 0, 0}, k.csomagok);
        k.csomagotFelvesz(3);
        assertArrayEquals("a tomb nem megfelelo", new int[] {10, 5, 3, 0, 0}, k.csomagok);
        k.csomagotFelvesz(7);
        assertArrayEquals("a tomb nem megfelelo", new int[] {10, 5, 3, 7, 0}, k.csomagok);
        k.csomagotFelvesz(7);
        assertArrayEquals("a tomb nem megfelelo", new int[] {10, 5, 3, 7, 7}, k.csomagok);
        k.csomagotFelvesz(4);
        assertArrayEquals("a tomb nem megfelelo", new int[] {10, 5, 3, 7, 7}, k.csomagok);
    }

    @Test
    public void teszt_02() {
        Kamion k2 = new Kamion(2);
        assertArrayEquals("a tomb nem megfelelo", new int[] {0, 0}, k2.csomagok);
        k2.csomagotFelvesz(6);
        assertArrayEquals("a tomb nem megfelelo", new int[] {6, 0}, k2.csomagok);
        k2.csomagotFelvesz(6);
        assertArrayEquals("a tomb nem megfelelo", new int[] {6, 6}, k2.csomagok);
        k2.csomagotFelvesz(6);
        assertArrayEquals("a tomb nem megfelelo", new int[] {6, 6}, k2.csomagok);
    }
}