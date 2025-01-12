import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        String[] args = {"7", "15", "10"};
        Konyv.main(args);
        assertEquals("Hibas megoldas", "Kiolvasott oldalak szama: 32" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_02() {
        String[] args = {};
        Konyv.main(args);
        assertEquals("Hibas megoldas", "Kiolvasott oldalak szama: 0" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_03() {
        String[] args = {"150", "300", "552", "1050", "3"};
        Konyv.main(args);
        assertEquals("Hibas megoldas", "Kiolvasott oldalak szama: 2055" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_04() {
        String[] args = {"4000", "15362", "161332"};
        Konyv.main(args);
        assertEquals("Hibas megoldas", "Kiolvasott oldalak szama: 180694" + System.lineSeparator(), sout.toString());
    }

    @Test
    public void teszt_05() {
        String[] args = {"53", "44", "75", "20", "105", "222"};
        Konyv.main(args);
        assertEquals("Hibas megoldas", "Kiolvasott oldalak szama: 519" + System.lineSeparator(), sout.toString());
    }
}