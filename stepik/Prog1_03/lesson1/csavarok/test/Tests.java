import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void default_konstruktor() {
        Csavar csavar = new Csavar();
        assertEquals("anyag hibas", "fa", csavar.getAnyag());
        assertEquals("hossz hibas", 50, csavar.getHossz(), 0.001);
        assertEquals("vastagsag hibas", 3.5, csavar.getVastagsag(), 0.001);
        assertEquals("erosseg hibas", 7, csavar.getErosseg());
        assertEquals("ar hibas", 100000, csavar.getAr());
    }

    @Test
    public void ot_parameteres_konstruktor() {
        Csavar csavar2 = new Csavar("vas", 60, 4, -4, 4000);
        assertEquals("anyag hibas", "vas", csavar2.getAnyag());
        assertEquals("hossz hibas", 60, csavar2.getHossz(), 0.001);
        assertEquals("vastagsag hibas", 4, csavar2.getVastagsag(), 0.001);
        assertEquals("erosseg hibas", 1, csavar2.getErosseg());
        assertEquals("ar hibas", 4000, csavar2.getAr());

        Csavar csavar3 = new Csavar("uveg", 1, 2, 3, 4);
        assertEquals("anyag hibas", "uveg", csavar3.getAnyag());
        assertEquals("hossz hibas", 1, csavar3.getHossz(), 0.001);
        assertEquals("vastagsag hibas", 2, csavar3.getVastagsag(), 0.001);
        assertEquals("erosseg hibas", 3, csavar3.getErosseg());
        assertEquals("ar hibas", 1000, csavar3.getAr());
    }

    @Test
    public void negy_parameteres_konstruktor() {
        Csavar csavar4 = new Csavar("homok", 3.22, 1.2, 4);
        assertEquals("anyag hibas", "homok", csavar4.getAnyag());
        assertEquals("hossz hibas", 3.22, csavar4.getHossz(), 0.001);
        assertEquals("vastagsag hibas", 1.2, csavar4.getVastagsag(), 0.001);
        assertEquals("erosseg hibas", 5, csavar4.getErosseg());
        assertEquals("ar hibas", 5313, csavar4.getAr());

        Csavar csavar5 = new Csavar("pamut", 15, 10, 6);
        assertEquals("anyag hibas", "pamut", csavar5.getAnyag());
        assertEquals("hossz hibas", 15, csavar5.getHossz(), 0.001);
        assertEquals("vastagsag hibas", 10, csavar5.getVastagsag(), 0.001);
        assertEquals("erosseg hibas", 6, csavar5.getErosseg());
        assertEquals("ar hibas", 5313, csavar5.getAr());
    }
}