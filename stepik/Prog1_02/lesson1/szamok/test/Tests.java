import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt_01() {
        Szamok.main(new String[] {"412", "111", "0"});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "3", serr.toString().trim());
    }

    @Test
    public void teszt_02() {
        Szamok.main(new String[] {"macska", "lo", "tehen"});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "0", serr.toString().trim());
    }

    @Test
    public void teszt_03() {
        Szamok.main(new String[] {" "});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "0", serr.toString().trim());
    }

    @Test
    public void teszt_04() {
        Szamok.main(new String[] {"8907592478125504891244516428937526417854237830562222469154123891938172540179624141524812"});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "1", serr.toString().trim());
    }

    @Test
    public void teszt_05() {
        Szamok.main(new String[] {"3124124", "macska", "77434n", "neptun5", "abalawiqopin4w5634angoa46eagn4oa4a44", "n55"});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "1", serr.toString().trim());
    }

    @Test
    public void teszt_06() {
        Szamok.main(new String[] {"100", "442", "0", "12412415", "-200"});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "4", serr.toString().trim());
    }

    @Test
    public void teszt_07() {
        Szamok.main(new String[] {"mouse", "höher", "10", "550", "Österreich", "weiß", "40.5", "45,5", "?!!", "info@info.info"});
        assertEquals("Rossz csatorna!", "", sout.toString());
        assertEquals("Hibas eredmeny", "2", serr.toString().trim());
    }
}