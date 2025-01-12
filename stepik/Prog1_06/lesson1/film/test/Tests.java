import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Film f1 = new Film("Az eltunt magnesek felderitese", 50);
        Film f2 = new Film("Vonzas", 55);
        Film f3 = new Film("Az exit tabla rejtelmei", 77);
        Film f4 = new Film("A hatalmas zaszlolopas", 100);
        Film f5 = new Film("Zaszlotolvajok nyomaban", 105);
        Film f6 = new Film("Behatolas a lampaba", 110);
        Film f7 = new Film("Az exit tabla rejtelmei 2.", 87);

        Szekreny szekreny = new Szekreny();
        Set<Film> filmek = (Set<Film>) fieldValue(Szekreny.class, "filmek", szekreny);
        filmek.addAll(Arrays.asList(f1, f2, f3, f4, f5, f6, f7));

        szekreny.filmeketKivalaszt(100);

        Set<Film> elvart = new HashSet<>(Arrays.asList(f1, f2, f3, f4, f7));

        assertTrue("Hibas eredmeny", setEquals(filmek, elvart, true));
    }

    @Test
    public void teszt_02() {
        Film f1 = new Film("Az eltunt magnesek felderitese", 50);
        Film f2 = new Film("Vonzas", 55);
        Film f3 = new Film("Az exit tabla rejtelmei", 77);
        Film f4 = new Film("A hatalmas zaszlolopas", 100);
        Film f5 = new Film("Zaszlotolvajok nyomaban", 105);
        Film f6 = new Film("Behatolas a lampaba", 110);
        Film f7 = new Film("Az exit tabla rejtelmei 2.", 87);

        Szekreny szekreny = new Szekreny();
        Set<Film> filmek = (Set<Film>) fieldValue(Szekreny.class, "filmek", szekreny);
        filmek.addAll(Arrays.asList(f1, f2, f3, f4, f5, f6, f7));

        szekreny.filmeketKivalaszt(70);

        Set<Film> elvart = new HashSet<>(Arrays.asList(f1, f2));

        assertTrue("Hibas eredmeny", setEquals(filmek, elvart, true));
    }

    @Test
    public void teszt_03() {
        Film f1 = new Film("Az eltunt magnesek felderitese", 50);
        Film f2 = new Film("Vonzas", 55);
        Film f4 = new Film("A hatalmas zaszlolopas", 100);
        Film f5 = new Film("Zaszlotolvajok nyomaban", 105);
        Film f6 = new Film("Behatolas a lampaba", 110);

        Szekreny szekreny = new Szekreny();
        Set<Film> filmek = (Set<Film>) fieldValue(Szekreny.class, "filmek", szekreny);
        filmek.addAll(Arrays.asList(f1, f2, f4, f5, f6));

        szekreny.filmeketKivalaszt(110);

        Set<Film> elvart = new HashSet<>(Arrays.asList(f1, f2, f4, f5, f6));

        assertTrue("Hibas eredmeny", setEquals(filmek, elvart, true));
    }

    @Test
    public void teszt_04() {
        Film f3 = new Film("Az exit tabla rejtelmei", 77);
        Film f4 = new Film("A hatalmas zaszlolopas", 100);
        Film f5 = new Film("Zaszlotolvajok nyomaban", 105);
        Film f6 = new Film("Behatolas a lampaba", 110);
        Film f7 = new Film("Az exit tabla rejtelmei 2.", 87);

        Szekreny szekreny = new Szekreny();
        Set<Film> filmek = (Set<Film>) fieldValue(Szekreny.class, "filmek", szekreny);
        filmek.addAll(Arrays.asList(f5, f3, f4, f6, f7));

        szekreny.filmeketKivalaszt(76);

        Set<Film> elvart = new HashSet<>(Collections.emptyList());

        assertTrue("Hibas eredmeny", setEquals(filmek, elvart, true));
    }
}