import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Map<Character, Integer> res;

        res = Betuszamolo.szamolas("cica");
        Map<Character, Integer> elvart = new HashMap<Character, Integer>() {{
           put('c', 2);
           put('i', 1);
           put('a', 1);
        }};

        assertTrue("Hibas eredmeny", mapEquals(elvart, res, false));
    }

    @Test
    public void teszt_02() {
        Map<Character, Integer> res;

        res = Betuszamolo.szamolas("Egy-ket lovacska");
        Map<Character, Integer> elvart = new HashMap<Character, Integer>() {{
            put('E', 1);
            put('g', 1);
            put('y', 1);
            put('-', 1);
            put('k', 2);
            put('e', 1);
            put('t', 1);
            put('l', 1);
            put('o', 1);
            put('v', 1);
            put('a', 2);
            put('c', 1);
            put('s', 1);
            put(' ', 1);
        }};

        assertTrue("Hibas eredmeny", mapEquals(elvart, res, false));
    }

    @Test
    public void teszt_03() {
        Map<Character, Integer> res;

        res = Betuszamolo.szamolas("@@#   ---> 3aaa");
        Map<Character, Integer> elvart = new HashMap<Character, Integer>() {{
            put('@', 2);
            put('#', 1);
            put(' ', 4);
            put('-', 3);
            put('>', 1);
            put('3', 1);
            put('a', 3);
        }};

        assertTrue("Hibas eredmeny", mapEquals(elvart, res, false));
    }

    @Test
    public void teszt_04() {
        Map<Character, Integer> res;

        res = Betuszamolo.szamolas("@@ @@@@ @@@ @@@@ @@@@ @@@ @@");
        Map<Character, Integer> elvart = new HashMap<Character, Integer>() {{
            put('@', 22);
            put(' ', 6);
        }};

        assertTrue("Hibas eredmeny", mapEquals(elvart, res, false));
    }

    @Test
    public void teszt_05() {
        Map<Character, Integer> res;

        res = Betuszamolo.szamolas("");
        Map<Character, Integer> elvart = new HashMap<Character, Integer>();

        assertTrue("Hibas eredmeny", mapEquals(elvart, res, false));
    }

    @Test
    public void teszt_06() {
        Map<Character, Integer> res;

        res = Betuszamolo.szamolas("macska");
        Map<Character, Integer> elvart = new HashMap<Character, Integer>() {{
            put('m', 1);
            put('a', 2);
            put('c', 1);
            put('s', 1);
            put('k', 1);
        }};

        assertTrue("Hibas eredmeny", mapEquals(elvart, res, false));
    }
}