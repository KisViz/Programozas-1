import java.util.Arrays;

public class Hangverseny {

    private Hangszer[] hangszerek;

    public Hangverseny(Hangszer[] hangszerek) {
        this.hangszerek = hangszerek;
    }

    public Hangszer[] getHangszerek() {
        return hangszerek;
    }


    public Hangszer legjobb() {
        if (hangszerek.length == 0 || hangszerek[0] == null) {
            return null;
        }

        Hangszer legngyobb = hangszerek[0];
        for (Hangszer hangszer : hangszerek) {
            if (hangszer.getErtekeles() > legngyobb.getErtekeles()) {
                legngyobb = hangszer;
            }
        }

        return legngyobb;
    }

    public int kitiltas() {
        int szaml = 0;
        for (Hangszer hangszer : hangszerek) {
            if (!hangszer.isGitar() && !hangszer.isHarfa() && hangszer != null) {
                szaml++;
            }
        }
        return szaml;
    }

    public Hangszer leghangosabbHarfaGitar () {
        if (hangszerek.length == 0 || hangszerek[0] == null) {
            return null;
        }

        Hangszer leghangosabb = null;
        for (Hangszer hangszer : hangszerek) {
            if (hangszer.isGitar() && hangszer.isHarfa() && hangszer != null) {
                if (leghangosabb == null) {
                    leghangosabb = hangszer;
                }

                if (leghangosabb.getHangossag() < hangszer.getHangossag()) {
                    leghangosabb = hangszer;
                }
            }
        }

        return leghangosabb;
    }

    public void rangsor () {
        Arrays.sort(hangszerek, (a, b) -> Integer.compare(b.getErtekeles(), a.getErtekeles()));
    }
}


