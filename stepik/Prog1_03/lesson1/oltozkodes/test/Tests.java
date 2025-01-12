import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void ember_nev() {
        assertTrue("nev hibas", testField(Ember.class, "nev", String.class, 0));
    }

    @Test
    public void ember_cipo() {
        assertTrue("a cipo hibas", testField(Ember.class, "cipo", Cipo.class, 0));
    }

    @Test
    public void ember_nadrag() {
        assertTrue("a nadrag hibas", testField(Ember.class, "nadrag", Nadrag.class, 0));
    }

    @Test
    public void ember_polo() {
        assertTrue("a polo hibas", testField(Ember.class, "polo", Polo.class, 0));
    }

    @Test
    public void cipo_szin() {
        assertTrue("a Cipo osztaly modositva lett", testField(Cipo.class, "szin", String.class, 0));
    }

    @Test
    public void nadrag_szin() {
        assertTrue("a Nadrag osztaly modositva lett", testField(Nadrag.class, "szin", String.class, 0));
    }

    @Test
    public void nadrag_tipus() {
        assertTrue("a Nadrag osztaly modositva lett", testField(Nadrag.class, "tipus", String.class, 0));
    }

    @Test
    public void polo_mintas() {
        assertTrue("a Polo osztaly modositva lett", testField(Polo.class, "mintas", boolean.class, 0));
    }

    @Test
    public void Polo_meret() {
        assertTrue("a Polo osztaly modositva lett", testField(Polo.class, "meret", int.class, 0));
    }
}