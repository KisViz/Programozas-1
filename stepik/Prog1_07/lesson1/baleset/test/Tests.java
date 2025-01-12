import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.Assert.*;

public class Tests {
    class Troli implements Jarmu {
        @Override
        public void halad() {
            System.out.println("CSING-CSING");
        }

        @Override
        public void megall() {
            System.out.println("NYIKK");
        }
    }

    class Auto implements Jarmu {
        @Override
        public void halad() {}

        @Override
        public void megall() {}
    }

    class Bicikli implements Jarmu {
        @Override
        public void halad() {}

        @Override
        public void megall() {}
    }

    @Test
    public void teszt_01() {
        Baleset b = new Baleset(new HashSet<>(Arrays.asList(
                new Troli(),
                new Troli(),
                new Bicikli(),
                new Auto()
        )));

        assertEquals("Os inicializalasa hibas", "Baleset tortent!", b.getMessage());
    }

    @Test
    public void teszt_02() {
        Baleset b = new Baleset(new HashSet<>(Arrays.asList(
                new Troli(),
                new Troli(),
                new Bicikli(),
                new Auto()
        )));

        assertFalse("villamosBaleset hibas", b.villamosBaleset());
    }

    @Test
    public void teszt_03() {
        Baleset b = new Baleset(new HashSet<>(Arrays.asList(
                new Villamos(),
                new Villamos(),
                new Villamos(),
                new Villamos()
        )));

        assertTrue("villamosBaleset hibas", b.villamosBaleset());
    }

    @Test
    public void teszt_04() {
        Baleset b = new Baleset(new HashSet<>(Arrays.asList(
                new Villamos(),
                new Bicikli(),
                new Troli(),
                new Auto()
        )));

        assertTrue("villamosBaleset hibas", b.villamosBaleset());
    }

    @Test
    public void teszt_05() {
        Baleset b = new Baleset(new HashSet<>(Collections.singletonList(
                new Villamos()
        )));

        assertTrue("villamosBaleset hibas", b.villamosBaleset());
    }

    @Test
    public void teszt_06() {
        Baleset b = new Baleset(new HashSet<>(Collections.emptyList()));
        assertFalse("villamosBaleset hibas", b.villamosBaleset());
    }
}