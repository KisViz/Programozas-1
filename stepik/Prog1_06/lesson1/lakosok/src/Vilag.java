import java.util.ArrayList;
import java.util.List;

public class Vilag {
    public List<Orszag> orszagok = new ArrayList<>();

    public Ember legoregebbEmber() {
        Ember max = null;

        for (Orszag o: orszagok) {
            for (Megye m: o.megyek) {
                for (Varos v: m.varosok) {
                    for (Utca u: v.utcak) {
                        for (Haz h: u.hazak) {
                            for (Ember e: h.lakok) {
                                if (max == null) {
                                    max = e;
                                } else if (e.eletkor > max.eletkor) {
                                    max = e;
                                }
                            }
                        }
                    }
                }
            }
        }

        return max;
    }

    public List<Varos> fovarosok() {
        List<Varos> fovarosok  = new ArrayList<>();

        for (Orszag o : orszagok) {
            for (Megye megye : o.megyek) {
                for (Varos v : megye.varosok) {
                    if (v.fovaros) {
                        fovarosok.add(v);
                    }
                }
            }
        }

        return fovarosok;
    }

    public int lakossag() {

        int osszeg = 0;

        for (Orszag o: orszagok) {
            for (Megye m: o.megyek) {
                for (Varos v: m.varosok) {
                    for (Utca u: v.utcak) {
                        for (Haz h: u.hazak) {
                            osszeg += h.lakok.size();
                        }
                    }
                }
            }
        }

        return osszeg;
//        return 0;
    }

}
