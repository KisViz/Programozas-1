import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void asztal() {
        Asztal a = new Asztal();
        assertTrue("oroklodes hibas", a instanceof Butor);
    }

    @Test
    public void komod() {
        Komod k = new Komod();
        assertTrue("oroklodes hibas", k instanceof Butor);
    }

    @Test
    public void szekreny() {
        Szekreny sz = new Szekreny();
        assertTrue("oroklodes hibas", sz instanceof Butor);
    }

    @Test
    public void szek() {
        Szek s = new Szek();
        assertTrue("oroklodes hibas", s instanceof Butor);
    }

    @Test
    public void butorgyar() {
        ButorGyar gyar = new ButorGyar();
        Butor[] butorok = gyar.butorGyartas();

        assertEquals("a tomb merete nem megfelelo", 8, butorok.length);
        assertSame(butorok[0].getClass(), Asztal.class);
        assertSame(butorok[1].getClass(), Asztal.class);
        assertSame(butorok[2].getClass(), Szek.class);
        assertSame(butorok[3].getClass(), Szek.class);
        assertSame(butorok[4].getClass(), Szekreny.class);
        assertSame(butorok[5].getClass(), Szekreny.class);
        assertSame(butorok[6].getClass(), Komod.class);
        assertSame(butorok[7].getClass(), Komod.class);
    }
}