import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        Statisztika s = new Statisztika();
        assertEquals("Gondolkozza'! Mit tudunk a halmazrol?", 0, s.tobbszorElofordulok());

        s.hozzaad("aaa");
        s.hozzaad("bbb");
        s.hozzaad("ccc");
        s.hozzaad("ccc");
        assertEquals("Gondolkozza'! Mit tudunk a halmazrol?", 0, s.tobbszorElofordulok());
    }
}