import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        Lotto lotto = new Lotto();
        assertTrue("a lista hibas", listEquals(lotto.szamok, Collections.emptyList(), true));

        lotto.hozzaad(5);
        assertTrue("a lista hibas", listEquals(lotto.szamok, Collections.singletonList(5), true));

        lotto.hozzaad(7);
        assertTrue("a lista hibas", listEquals(lotto.szamok, Arrays.asList(5, 7), true));

        lotto.hozzaad(40);
        assertTrue("a lista hibas", listEquals(lotto.szamok, Arrays.asList(5, 7, 40), true));

        lotto.hozzaad(90);
        assertTrue("a lista hibas", listEquals(lotto.szamok, Arrays.asList(5, 7, 40, 90), true));

        lotto.hozzaad(7);
        assertTrue("a lista hibas", listEquals(lotto.szamok, Arrays.asList(5, 7, 40, 90, 7), true));
    }
}