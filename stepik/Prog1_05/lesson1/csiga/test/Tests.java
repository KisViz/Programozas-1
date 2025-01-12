import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void ajtoSzerelo() {
        assertTrue("Az interface hibas", testInterface(AjtoSzerelo.class, Modifier.PUBLIC | Modifier.ABSTRACT | Modifier.INTERFACE));
        assertTrue("AjtoSzerelo - ajtotSzerel", testMethod(AjtoSzerelo.class, "ajtotSzerel", boolean.class, Modifier.PUBLIC | Modifier.ABSTRACT, AjtoSzerelo[].class));
        assertEquals("Az interface nem 1 metodust tartalmaz", 1, methodCount(AjtoSzerelo.class));
    }

    @Test
    public void csiga() {
        testClass(Csiga.class, Modifier.PUBLIC, Object.class);

        assertTrue("Csiga - meret", testField(Csiga.class, "meret", int.class, Modifier.PRIVATE));
        assertTrue("Csiga - hazas", testField(Csiga.class, "hazas", boolean.class, Modifier.PRIVATE));

        assertTrue("Csiga - konstruktor", testConstructor(Csiga.class, Modifier.PUBLIC, int.class, boolean.class));

        Csiga csiga = new Csiga(4, true);
        assertEquals("csiga - konstruktor", 4, fieldValue(Csiga.class, "meret", csiga));
        assertEquals("csiga - konstruktor", true, fieldValue(Csiga.class, "hazas", csiga));

        csiga = new Csiga(9, false);
        assertEquals("csiga - konstruktor", 9, fieldValue(Csiga.class, "meret", csiga));
        assertEquals("csiga - konstruktor", false, fieldValue(Csiga.class, "hazas", csiga));
    }

    @Test
    public void mesterCsiga() {
        testClass(MesterCsiga.class, Modifier.PUBLIC, Csiga.class, AjtoSzerelo.class);

        assertTrue("MesterCsiga - szakmaiKepesseg", testField(MesterCsiga.class, "szakmaiKepesseg", int.class, Modifier.PRIVATE));
        assertTrue("MesterCsiga - konstruktor", testConstructor(MesterCsiga.class, Modifier.PUBLIC, int.class, boolean.class, int.class));
        assertTrue("MesterCsiga - ajtotSzerel", testMethodInherited(MesterCsiga.class, "ajtotSzerel", boolean.class, Modifier.PUBLIC, AjtoSzerelo[].class));

        MesterCsiga csiga = new MesterCsiga(7, true, 2);
        assertEquals("MesterCsiga - konstruktor", 7, fieldValue(Csiga.class, "meret", csiga));
        assertEquals("MesterCsiga - konstruktor", true, fieldValue(Csiga.class, "hazas", csiga));
        assertEquals("MesterCsiga - konstruktor", 2, fieldValue(MesterCsiga.class, "szakmaiKepesseg", csiga));

        csiga = new MesterCsiga(427, false, 77);
        assertEquals("MesterCsiga - konstruktor", 427, fieldValue(Csiga.class, "meret", csiga));
        assertEquals("MesterCsiga - konstruktor", false, fieldValue(Csiga.class, "hazas", csiga));
        assertEquals("MesterCsiga - konstruktor", 77, fieldValue(MesterCsiga.class, "szakmaiKepesseg", csiga));
    }
}