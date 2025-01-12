import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        assertEquals("hibas eredmeny", 0, Felvonulas.szavazas(new String[] {"sarkanyszeker", "sarkanyszeker", "gyalogosok", "gyalogosok"}));
    }

    @Test
    public void teszt_02() {
        assertEquals("hibas eredmeny", 1, Felvonulas.szavazas(new String[] {"sarkanyszeker", "lovasszeker", "gyalogosok", "gyalogosok"}));
    }

    @Test
    public void teszt_03() {
        assertEquals("hibas eredmeny", 4, Felvonulas.szavazas(new String[] {"lovasszeker", "lovasszeker", "lovasszeker", "lovasszeker"}));
    }

    @Test
    public void teszt_04() {
        assertEquals("hibas eredmeny", 2, Felvonulas.szavazas(new String[] {"lovasszeker", "sarkanyszeker", "gyalogosok", "lovasszeker", "auto", "motor", "bicikli"}));
    }

    @Test
    public void teszt_05() {
        assertEquals("hibas eredmeny", 1, Felvonulas.szavazas(new String[] {"lovaskocsi", "lovaskocsi", "lovasszeker", "szeker", "szekereslo"}));
    }
}
