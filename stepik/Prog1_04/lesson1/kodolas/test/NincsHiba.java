import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NincsHiba {
    @Test
    public void teszt_01() {
        String eredeti = "1100";
        String kodolt = Titok.kodolas(eredeti);
        String dekodolt = Titok.dekodolas(kodolt);
        assertEquals("Hibas eredmeny", eredeti, dekodolt);
    }

    @Test
    public void teszt_02() {
        String eredeti = "111100010101";
        String kodolt = Titok.kodolas(eredeti);
        String dekodolt = Titok.dekodolas(kodolt);
        assertEquals("Hibas eredmeny", eredeti, dekodolt);
    }
}
