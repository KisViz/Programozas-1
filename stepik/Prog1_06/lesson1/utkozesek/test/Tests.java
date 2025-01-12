import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        Utkozesek.Golyo g1 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g2 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g3 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g4 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g5 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g6 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g7 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);
        Utkozesek.Golyo g8 = new Utkozesek.Golyo(1, 1, 1, 1, 1, 1);

        Map<Integer, Map<String, Utkozesek.Golyo>> m1 = new HashMap<Integer, Map<String, Utkozesek.Golyo>>() {{
            put(1, new HashMap<String, Utkozesek.Golyo>() {{
                put("macska", g1);
                put("lo", g2);
            }});

            put(2, new HashMap<String, Utkozesek.Golyo>() {{
                put("jeles", g3);
            }});

            put(5, new HashMap<String, Utkozesek.Golyo>() {{
                put("macska", g5);
                put("jeles", g6);
            }});
        }};
        Utkozesek u1 = new Utkozesek(m1, 1, 1);
        assertEquals("hibas eredmeny", g6, u1.utkozesek());

        Map<Integer, Map<String, Utkozesek.Golyo>> m2 = new HashMap<Integer, Map<String, Utkozesek.Golyo>>() {{
            put(1, new HashMap<String, Utkozesek.Golyo>() {{
                put("macska", g1);
            }});

            put(2, new HashMap<String, Utkozesek.Golyo>() {{
                put("jeles", g3);
            }});

            put(3, new HashMap<String, Utkozesek.Golyo>() {{
                put("macska", g4);
                put("jeles", g5);
            }});

            put(5, new HashMap<String, Utkozesek.Golyo>() {{
                put("macska", g6);
                put("jeles", g2);
            }});

            put(7, new HashMap<String, Utkozesek.Golyo>() {{
                put("macska", g7);
                put("jeles", g8);
            }});
        }};
        Utkozesek u2 = new Utkozesek(m2, 1, 1);
        assertEquals("hibas eredmeny", g2, u2.utkozesek());

        Map<Integer, Map<String, Utkozesek.Golyo>> m3 = new HashMap<Integer, Map<String, Utkozesek.Golyo>>() {{
            put(5, new HashMap<String, Utkozesek.Golyo>() {{
                put("jeles", g8);
            }});

            put(-5, new HashMap<String, Utkozesek.Golyo>() {{
                put("jeles", g2);
            }});
        }};
        Utkozesek u3 = new Utkozesek(m3, 1, 1);
        assertEquals("hibas eredmeny", g8, u3.utkozesek());
    }
}