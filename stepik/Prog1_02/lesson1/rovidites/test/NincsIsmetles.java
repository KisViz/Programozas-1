import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NincsIsmetles {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", "uzenet", Rovidites.dekodolas("uzenet"));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", "macska", Rovidites.dekodolas("macska"));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", "itt a hold", Rovidites.dekodolas("itt a hold"));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", "a leanderekkel mi lett?", Rovidites.dekodolas("a leanderekkel mi lett?"));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", "ez volt az utolso feladat", Rovidites.dekodolas("ez volt az utolso feladat"));
    }
}
