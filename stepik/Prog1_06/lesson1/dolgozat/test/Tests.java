import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Dolgozat d = new Dolgozat();
        d.pontszamok = new HashMap<String, Integer>() {{
            put("LMBDKA", 55);
            put("BDKFLM", 30);
            put("BSDLKB", 51);
            put("NLDKMD", 36);
            put("MNBKLD", 57);
            put("LNFKKK", 77);
            put("MKALVS", 23);
        }};

        List<String> res = d.tehetsegesek(50);
        List<String> elvart = Arrays.asList("BSDLKB", "LMBDKA", "LNFKKK", "MNBKLD");

        assertTrue("Hibas eredmeny", listEquals(res, elvart, false));
    }

    @Test
    public void teszt_02() {
        Dolgozat d = new Dolgozat();
        d.pontszamok = new HashMap<String, Integer>() {{
            put("LMBDKB", 30);
            put("LMBDKA", 55);
        }};

        List<String> res = d.tehetsegesek(25);
        List<String> elvart = Arrays.asList("LMBDKA", "LMBDKB");

        assertTrue("Hibas eredmeny", listEquals(res, elvart, false));
    }

    @Test
    public void teszt_03() {
        Dolgozat d = new Dolgozat();
        d.pontszamok = new HashMap<String, Integer>() {{
            put("LMBDKA", 55);
            put("BDKFLM", 30);
            put("BSDLKB", 51);
            put("NLDKMD", 36);
            put("MNBKLD", 57);
            put("LNFKKK", 77);
            put("MKALVS", 23);
        }};

        List<String> res = d.tehetsegesek(70);
        List<String> elvart = Collections.singletonList("LNFKKK");

        assertTrue("Hibas eredmeny", listEquals(res, elvart, false));
    }

    @Test
    public void teszt_04() {
        Dolgozat d = new Dolgozat();
        d.pontszamok = new HashMap<String, Integer>() {{
            put("LMBDKA", 55);
            put("BDKFLM", 30);
            put("BSDLKB", 51);
            put("NLDKMD", 36);
            put("MNBKLD", 57);
            put("LNFKKK", 77);
            put("MKALVS", 23);
        }};

        List<String> res = d.tehetsegesek(57);
        List<String> elvart = Arrays.asList("LNFKKK", "MNBKLD");

        assertTrue("Hibas eredmeny", listEquals(res, elvart, false));
    }
}