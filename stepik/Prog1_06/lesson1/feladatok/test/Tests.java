import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Feladat f1 = new Feladat("Magnes leszedese az exit tablarol", "nehez fizikai", 30);
        Feladat f2 = new Feladat("Magnes felhelyezese a lampara", "konnyu fizikai", 35);
        Feladat f3 = new Feladat("Egy maximum kereso fuggveny elkeszitese", "borzasztoan nehez szellemi", 300);
        Feladat f4 = new Feladat("Maszas a sorok kozott", "konnyu fizikai", 55);
        Feladat f5 = new Feladat("Harcolas szeklabbal", "konnyu fizikai", 10);
        Feladat f6 = new Feladat("Szupertitkos vegigvonulas a hadvezerig", "borzasztoan nehez fizikai", 50);

        Beosztas beosztas = new Beosztas();
        beosztas.beosztas = new HashMap<String, Feladat>() {{
            put("Istvan", f1);
            put("Kira", f2);
            put("Balazs", f3);
            put("Barna", f4);
            put("Dorka", f5);
            put("Mark", f6);
        }};

        Map<Feladat, String> res = beosztas.megfordit();

        Map<Feladat, String> elvart = new HashMap<Feladat, String>() {{
            put(f1, "Istvan");
            put(f2, "Kira");
            put(f3, "Balazs");
            put(f4, "Barna");
            put(f5, "Dorka");
            put(f6, "Mark");
        }};

        assertTrue("Hibas megoldas", mapEquals(res, elvart, true));
    }

    @Test
    public void teszt_02() {
        Feladat f2 = new Feladat("Magnes felhelyezese a lampara", "konnyu fizikai", 35);
        Feladat f4 = new Feladat("Maszas a sorok kozott", "konnyu fizikai", 55);
        Feladat f6 = new Feladat("Szupertitkos vegigvonulas a hadvezerig", "borzasztoan nehez fizikai", 50);

        Beosztas beosztas = new Beosztas();
        beosztas.beosztas = new HashMap<String, Feladat>() {{
            put("Kira", f2);
            put("Barna", f4);
            put("Mark", f6);
        }};

        Map<Feladat, String> res = beosztas.megfordit();

        Map<Feladat, String> elvart = new HashMap<Feladat, String>() {{
            put(f2, "Kira");
            put(f4, "Barna");
            put(f6, "Mark");
        }};

        assertTrue("Hibas megoldas", mapEquals(res, elvart, true));
    }

    @Test
    public void teszt_03() {
        Feladat f1 = new Feladat("Magnes leszedese az exit tablarol", "nehez fizikai", 30);

        Beosztas beosztas = new Beosztas();
        beosztas.beosztas = new HashMap<String, Feladat>() {{
            put("Istvan", f1);
            put("Kira", f1);
            put("Balazs", f1);
            put("Barna", f1);
            put("Dorka", f1);
            put("Mark", f1);
        }};

        Map<Feladat, String> res = beosztas.megfordit();

        assertNull("Hibas megoldas", res);
    }


    @Test
    public void teszt_04() {
        Feladat f1 = new Feladat("Magnes leszedese az exit tablarol", "nehez fizikai", 30);
        Feladat f2 = new Feladat("Magnes felhelyezese a lampara", "konnyu fizikai", 35);
        Feladat f3 = new Feladat("Egy maximum kereso fuggveny elkeszitese", "borzasztoan nehez szellemi", 300);
        Feladat f4 = new Feladat("Maszas a sorok kozott", "konnyu fizikai", 55);
        Feladat f5 = new Feladat("Harcolas szeklabbal", "konnyu fizikai", 10);

        Beosztas beosztas = new Beosztas();
        beosztas.beosztas = new HashMap<String, Feladat>() {{
            put("Istvan", f1);
            put("Kira", f2);
            put("Balazs", f3);
            put("Barna", f4);
            put("Dorka", f5);
            put("Mark", f2);
        }};

        Map<Feladat, String> res = beosztas.megfordit();

        assertNull("Hibas megoldas", res);
    }

    @Test
    public void teszt_05() {
        Feladat f1 = new Feladat("Magnes leszedese az exit tablarol", "nehez fizikai", 30);
        Feladat f2 = new Feladat("Magnes felhelyezese a lampara", "konnyu fizikai", 35);
        Feladat f4 = new Feladat("Maszas a sorok kozott", "konnyu fizikai", 55);
        Feladat f6 = new Feladat("Szupertitkos vegigvonulas a hadvezerig", "borzasztoan nehez fizikai", 50);

        Beosztas beosztas = new Beosztas();
        beosztas.beosztas = new HashMap<String, Feladat>() {{
            put("Istvan", f1);
            put("Kira", f2);
            put("Balazs", f2);
            put("Barna", f4);
            put("Dorka", f4);
            put("Mark", f6);
        }};

        Map<Feladat, String> res = beosztas.megfordit();

        assertNull("Hibas megoldas", res);
    }
}