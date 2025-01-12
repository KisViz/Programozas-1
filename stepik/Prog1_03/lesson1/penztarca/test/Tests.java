import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Penztarca p = new Penztarca("piros", "bor", 8.4, 100);
        assertEquals("hibas mukodes", "A penztarca piros szinu, bor anyagu. A merete: " + fieldValue(Penztarca.class, "meret", p) + ", a benne levo penzmennyiseg: 100.", p.toString());
    }

    @Test
    public void teszt_02() {
        Penztarca p2 = new Penztarca("rozsaszin", "uveg", 0.01, 1000000);
        assertEquals("hibas mukodes", "A penztarca rozsaszin szinu, uveg anyagu. A merete: " + fieldValue(Penztarca.class, "meret", p2) + ", a benne levo penzmennyiseg: 1000000.", p2.toString());
    }
}