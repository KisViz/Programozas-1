import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt() {
        Bolt b1 = new Bolt("Spar", 14, 16, 5);
        Bolt b2 = new Bolt("Tesco", 20, 22, 3);
        Bolt b3 = new Bolt("Lidl", 2, 22, 10);
        Bolt b4 = new Bolt("Avkmaqkmva", 1, 23, 1000304);

        assertEquals("alapertelmezett ertek hibas", 0, Bolt.nyitottBoltok());

        b1.kinyit();
        b3.kinyit();

        assertEquals("nehany bolt kinyitott", 2, Bolt.nyitottBoltok());

        b3.bezar();
        assertEquals("nehany bolt bezart", 1, Bolt.nyitottBoltok());

        b4.kinyit();
        b2.kinyit();
        assertEquals("nehany bolt kinyitott", 3, Bolt.nyitottBoltok());

        for (int i = 0; i < 1000; i++) {
            b2.kinyit();
        }

        assertEquals("egy kinyitott bolt megint ki akart nyitni, ujra es ujra", 3, Bolt.nyitottBoltok());

        for (int i = 0; i < 120; i++) {
            b4.bezar();
        }

        assertEquals("egy bezart bolt ujra be akart zarni", 2, Bolt.nyitottBoltok());

        b1.bezar();
        b2.bezar();
        b3.bezar();
        b4.bezar();

        assertEquals("minden boltbol elvittek az osszes termeket, igy mind bezart", 0, Bolt.nyitottBoltok());
    }
}