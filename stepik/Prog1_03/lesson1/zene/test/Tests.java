import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void eloado() {
        Zene zene = new Zene();
        setFieldValue(Zene.class, "eloado", zene, "en");
        assertEquals("eloado gettere nem jo", "en", zene.getEloado());
    }

    @Test
    public void cim() {
        Zene zene = new Zene();
        setFieldValue(Zene.class, "cim", zene, "EN");
        assertEquals("cim gettere nem jo", "EN", zene.getCim());
    }

    @Test
    public void hossz() {
        Zene zene = new Zene();
        setFieldValue(Zene.class, "hossz", zene, 40);
        assertEquals("hossz gettere nem jo", 40, zene.getHossz());
    }
}