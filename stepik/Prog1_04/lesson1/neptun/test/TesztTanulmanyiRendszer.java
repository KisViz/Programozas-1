import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesztTanulmanyiRendszer {
    @Test
    public void teszt_01() {
        TanulmanyiRendszer t = new TanulmanyiRendszer();
        assertEquals("tanulmanyi rendszer hibas", "a tanulmanyi rendszer elindult!", t.elindit(9500));

    }

    @Test
    public void teszt_02() {
        TanulmanyiRendszer t = new TanulmanyiRendszer();
        assertEquals("tanulmanyi rendszer hibas", "a tanulmanyi rendszer elindult!", t.elindit(10000));
    }

    @Test
    public void teszt_03() {
        TanulmanyiRendszer t = new TanulmanyiRendszer();
        assertEquals("tanulmanyi rendszer hibas", "tul sok felhasznalo!", t.elindit(10001));
    }
}