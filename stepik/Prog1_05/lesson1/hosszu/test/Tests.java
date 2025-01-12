import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        assertEquals("Hibas eredmeny", 2, Hosszu.hossz("110010"));
    }

    @Test
    public void teszt_02() {
        assertEquals("Hibas eredmeny", 0, Hosszu.hossz("00000000000"));
    }

    @Test
    public void teszt_03() {
        assertEquals("Hibas eredmeny", 3, Hosszu.hossz("01011000001110"));
    }

    @Test
    public void teszt_04() {
        assertEquals("Hibas eredmeny", 3, Hosszu.hossz("0111011101110111"));
    }

    @Test
    public void teszt_05() {
        assertEquals("Hibas eredmeny", 10, Hosszu.hossz("1111111111"));
    }

    @Test
    public void teszt_06() {
        assertEquals("Hibas eredmeny", 10, Hosszu.hossz("11111111110111111111"));
    }

    @Test
    public void teszt_07() {
        assertEquals("Hibas eredmeny", 3, Hosszu.hossz("10110110110101110"));
    }

    @Test
    public void teszt_08() {
        assertEquals("Hibas eredmeny", 1, Hosszu.hossz("1"));
    }

    @Test
    public void teszt_09() {
        assertEquals("Hibas eredmeny", 1, Hosszu.hossz("101"));
    }

    @Test
    public void teszt_10() {
        assertEquals("Hibas eredmeny", 3, Hosszu.hossz("111011"));
    }

    @Test
    public void teszt_11() {
        assertEquals("Hibas eredmeny", 3, Hosszu.hossz("110111"));
    }

    @Test
    public void teszt_12() {
        assertEquals("Hibas eredmeny", 1, Hosszu.hossz("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100"));
    }

    @Test
    public void fajlmeret() {
        checkFileSize("./src/Hosszu.java", 140, 1, 1, 5);
    }
}