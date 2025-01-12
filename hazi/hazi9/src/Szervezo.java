import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Szervezo {
    private List<Jatekos> jatekosok;
    private List<Csapat> csapatok;

    public void addJatekos(Jatekos jatekos) {
        if (jatekos != null) {
            jatekosok.add(jatekos);
        }
    }

    public void addCsapat(Csapat csapat) {
        if (csapat != null) {
            csapatok.add(csapat);
        }
    }

    public void gyakoroltat(Map<Jatek, Integer> mibolMennyit) throws SecurityException{
        boolean jatszikValaki = false;
        for (Jatekos jatekos : jatekosok) {
            boolean jatszik = false;
            for (Map.Entry<Jatek, Integer> entry : mibolMennyit.entrySet()) {
                if (entry.getKey().equals(jatekos.getKedvenc())) {
                    try {
                        jatekos.jatszik(entry.getKey(), entry.getValue());
                        jatszik = true;
                        jatszikValaki = true;
                    } catch (NemSzeretiException e) {
                        // A játékos nem játszik ezzel a játékkal
                    }
                }
            }
            if (!jatszik) {
                throw new SecurityException("Az egyik jatekos tul valogatos.");
            }
        }
        if (!jatszikValaki) {
            throw new SecurityException("Az egyik jatekos tul valogatos.");
        }
    }

    public void beoszt() throws Exception {
        for (Jatekos jatekos : jatekosok) {
            boolean siker = false;
            List<Csapat> kompatibilisCsapatok = new ArrayList<>();
            for (Csapat csapat : csapatok) {
                if (csapat.getCelJatek().equals(jatekos.getKedvenc())) {
                    kompatibilisCsapatok.add(csapat);
                }
            }
            for (Csapat csapat : kompatibilisCsapatok) {
                try {
                    csapat.jatekostHozzaad(jatekos);
                    siker = true;
                    break;
                } catch (IllegalArgumentException e) {
                    // A játékos nem kompatibilis a csapattal, próbáljuk a következő csapatot
                } catch (IndexOutOfBoundsException e) {
                    // A csapat megtelt, próbáljuk a következő csapatot
                } catch (Exception e) {
                    throw new Exception("Az egyik jatekosnak nem sikerult megfelelo csapatot talalni.");
                }
            }
            if (!siker) {
                throw new Exception("Az egyik jatekosnak nem sikerult megfelelo csapatot talalni.");
            }
        }
    }
}
