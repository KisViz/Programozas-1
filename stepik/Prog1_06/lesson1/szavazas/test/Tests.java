import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Szavazas szavazas = new Szavazas();
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Macska");

        Map<String, Integer> elvart = new HashMap<String, Integer>() {{
            put("Macska", 5);
        }};

        Map<String, Integer> map = (Map<String, Integer>) fieldValue(Szavazas.class, "szavazatok", szavazas);
        assertTrue("Hibas eredmeny", mapEquals(map, elvart, false));
    }

    @Test
    public void teszt_02() {
        Szavazas szavazas = new Szavazas();
        szavazas.hozzaad("Kira");
        szavazas.hozzaad("Gabor");
        szavazas.hozzaad("Juliska");
        szavazas.hozzaad("Peter");
        szavazas.hozzaad("Antal");

        Map<String, Integer> elvart = new HashMap<String, Integer>() {{
            put("Kira", 1);
            put("Gabor", 1);
            put("Juliska", 1);
            put("Peter", 1);
            put("Antal", 1);
        }};

        Map<String, Integer> map = (Map<String, Integer>) fieldValue(Szavazas.class, "szavazatok", szavazas);
        assertTrue("Hibas eredmeny", mapEquals(map, elvart, false));
    }

    @Test
    public void teszt_03() {
        Szavazas szavazas = new Szavazas();
        szavazas.hozzaad("Eszter");
        szavazas.hozzaad("Anita");
        szavazas.hozzaad("Anita");
        szavazas.hozzaad("Gabor");
        szavazas.hozzaad("Anita");

        Map<String, Integer> elvart = new HashMap<String, Integer>() {{
            put("Eszter", 1);
            put("Anita", 3);
            put("Gabor", 1);
        }};

        Map<String, Integer> map = (Map<String, Integer>) fieldValue(Szavazas.class, "szavazatok", szavazas);
        assertTrue("Hibas eredmeny", mapEquals(map, elvart, false));
    }

    @Test
    public void teszt_04() {
        Szavazas szavazas = new Szavazas();
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Beka");
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Macska");
        szavazas.hozzaad("Beka");
        szavazas.hozzaad("Beka");

        Map<String, Integer> elvart = new HashMap<String, Integer>() {{
            put("Macska", 3);
            put("Beka", 3);
        }};

        Map<String, Integer> map = (Map<String, Integer>) fieldValue(Szavazas.class, "szavazatok", szavazas);
        assertTrue("Hibas eredmeny", mapEquals(map, elvart, false));
    }

    @Test
    public void teszt_05() {
        Szavazas szavazas = new Szavazas();

        Map<String, Integer> elvart = new HashMap<String, Integer>() {{
        }};

        Map<String, Integer> map = (Map<String, Integer>) fieldValue(Szavazas.class, "szavazatok", szavazas);
        assertTrue("Hibas eredmeny", mapEquals(map, elvart, false));
    }
}