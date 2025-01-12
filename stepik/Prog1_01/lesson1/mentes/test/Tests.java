import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Mentes mentes = new Mentes();
        mentes.reset();

        List<Integer> lista = Arrays.asList(3, 5, 7);
        for (int i: lista) {
            mentes.completeLevel(i);
        }

        for (int i = 0; i <= 30; i++) {
            assertEquals("hibas eredmeny", lista.contains(i), mentes.isCompleted(i));
        }
    }

    @Test
    public void teszt_02() {
        Mentes mentes = new Mentes();
        mentes.reset();

        Random r = new Random();
        List<Integer> lista = Arrays.asList(r.nextInt(4) + 25, r.nextInt(5), r.nextInt(5) + 5, r.nextInt(10) + 12);
        for (int i: lista) {
            mentes.completeLevel(i);
        }

        for (int i = 0; i <= 30; i++) {
            assertEquals("hibas eredmeny", lista.contains(i), mentes.isCompleted(i));
        }
    }

    @Test
    public void teszt_03() {
        Mentes mentes = new Mentes();
        mentes.reset();

        Random r = new Random();
        List<Integer> lista = Arrays.asList(r.nextInt(4) + 25, r.nextInt(5), r.nextInt(5) + 5, r.nextInt(10) + 12);
        for (int i: lista) {
            mentes.completeLevel(i);
        }

        for (int i = 0; i <= 30; i++) {
            assertEquals("hibas eredmeny", lista.contains(i), mentes.isCompleted(i));
        }

        mentes.reset();

        for (int i = 0; i <= 30; i++) {
            assertFalse("hibas eredmeny", mentes.isCompleted(i));
        }
    }

    @Test
    public void teszt_04() {
        Mentes mentes = new Mentes();
        mentes.reset();

        List<Integer> lista = Arrays.asList(30, 2, 5, 1, 7, 7, 2, 5, 5, 3);
        for (int i: lista) {
            mentes.completeLevel(i);
        }

        for (int i = 0; i <= 30; i++) {
            assertEquals("hibas eredmeny", lista.contains(i), mentes.isCompleted(i));
        }

        mentes.reset();

        for (int i = 0; i <= 30; i++) {
            assertFalse("hibas eredmeny", mentes.isCompleted(i));
        }
    }

    @Test
    public void teszt_05() {
        Mentes mentes = new Mentes();
        mentes.reset();

        List<Integer> lista = Arrays.asList(30, 1, 5, 8, 3, 4, 9, 14, 17, 19, 23, 21, 28, 2);
        for (int i: lista) {
            mentes.completeLevel(i);
        }

        for (int i = 0; i <= 30; i++) {
            assertEquals("hibas eredmeny", lista.contains(i), mentes.isCompleted(i));
        }

        int oldValue = (int) fieldValue(Mentes.class, "gameSave", mentes);

        mentes.reset();

        for (int i = 0; i <= 30; i++) {
            assertFalse("hibas eredmeny", mentes.isCompleted(i));
        }

        mentes.completeLevel(3);
        assertTrue("hibas eredmeny", mentes.isCompleted(3));

        setFieldValue(Mentes.class, "gameSave", mentes, oldValue);

        for (int i = 0; i <= 30; i++) {
            assertEquals("hibas eredmeny", lista.contains(i), mentes.isCompleted(i));
        }
    }

    @Test
    public void teszt_06() {
        assertEquals("Nem hozhatsz letre extra adattagokat", 1, fieldCount(Mentes.class));
        assertEquals("Nem hozhatsz letre extra metodusokat", 3, methodCount(Mentes.class));

        assertEquals("Nem hozhatsz letre extra osztalyokat!", 1, new File("./src").listFiles().length);
        assertEquals("Nem hozhatsz letre extra osztalyokat!", 1, new File("./test").listFiles().length);
        assertEquals("Nem hozhatsz letre extra osztalyokat!", 6, new File(".").listFiles().length);
    }
}