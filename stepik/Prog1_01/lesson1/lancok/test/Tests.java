import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    public Kapcsolat createKapcsolat(int a, int b) {
        Kapcsolat k = new Kapcsolat();
        k.lancszem1 = a;
        k.lancszem2 = b;
        return k;
    }

    @Test
    public void teszt_01() {
        Kapcsolat[] kapcsolatok = {
                createKapcsolat(4, 3),
                createKapcsolat(1, 2),
                createKapcsolat(4, 5),
                createKapcsolat(3, 2)
        };

        assertEquals(0, Lanc.lanc(kapcsolatok, 5));
    }

    @Test
    public void teszt_02() {
        Kapcsolat[] kapcsolatok2 = {
                createKapcsolat(1, 3),
                createKapcsolat(3, 2),
                createKapcsolat(3, 4),
                createKapcsolat(4, 5),
                createKapcsolat(4, 6)
        };

        assertEquals(2, Lanc.lanc(kapcsolatok2, 6));
    }

    @Test
    public void teszt_03() {
        Kapcsolat[] kapcsolatok3 = {
                createKapcsolat(1, 2),
                createKapcsolat(2, 3),
                createKapcsolat(3, 4),
                createKapcsolat(4, 5),
                createKapcsolat(3, 6),
                createKapcsolat(6, 7)
        };

        assertEquals(1, Lanc.lanc(kapcsolatok3, 7));
    }

    @Test
    public void teszt_04() {
        Kapcsolat[] kapcsolatok = {
                createKapcsolat(9,11),
                createKapcsolat(1,13),
                createKapcsolat(2,10),
                createKapcsolat(3,5),
                createKapcsolat(1,2),
                createKapcsolat(7,13),
                createKapcsolat(3,8),
                createKapcsolat(6,7),
                createKapcsolat(4,12),
                createKapcsolat(4,13),
                createKapcsolat(5,6),
                createKapcsolat(2,14),
                createKapcsolat(11,13)
        };

        assertEquals(3, Lanc.lanc(kapcsolatok, 14));
    }

    @Test
    public void teszt_05() {
        Kapcsolat[] kapcsolatok2 = {
                createKapcsolat(1,3),
                createKapcsolat(2,4),
                createKapcsolat(2,6),
                createKapcsolat(5,4),
                createKapcsolat(2,3)
        };

        assertEquals(1, Lanc.lanc(kapcsolatok2, 6));
    }

}