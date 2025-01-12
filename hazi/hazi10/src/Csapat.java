import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Csapat {
    private String neve;
    private Map<String, List<Jatekos>> jatekosok;
    private String poziciok;

    public Csapat(String neve) {
        if (neve != null) {
            this.neve = neve;
        }
    }

    public String getNeve() {
        return neve;
    }

    public Map<String, List<Jatekos>> getJatekosok() {
        return jatekosok;
    }

    public void setJatekosok(Map<String, List<Jatekos>> jatekosok) {
        this.jatekosok = jatekosok;
    }

    public void beolvas (File fajlnev){
        try (Scanner scanner = new Scanner(fajlnev)) {
            while (scanner.hasNextLine()) {
                String ember = scanner.nextLine();
                String[] em = ember.split(";");
                Jatekos uj = new Jatekos(em[0],Integer.parseInt(em[2]),Integer.parseInt(em[3]),Integer.parseInt(em[4]));
                
                String[] pozik = {"asd", "Starting Pitcher", "First Baseman", "Shortstop", "Third Baseman", "Designated Hitter", "Catcher", "Second Baseman", "Relief Pitcher", "Outfielder"};

                List<Jatekos> a = jatekosok.get(pozik[Integer.parseInt(em[1])]);
                a.add(uj);
                jatekosok.put(pozik[Integer.parseInt(em[1])],a);
            }
        } catch (IOException e) {

        }

    }

    public List<String> hianyzoPoziciok() {
        List<String> hianyzok = new ArrayList<>();

        for (Map.Entry<String, List<Jatekos>> elem : jatekosok.entrySet()) {
            if (elem.getValue().isEmpty()) {
                hianyzok.add(elem.getKey());
            }
        }

        return hianyzok;
    }

    public float atlag (String melyikAtlag) {

        if (melyikAtlag.equals("magassag")) {
            int szaml = 0;
            int osszeg = 0;
            for (Map.Entry<String, List<Jatekos>> elem : jatekosok.entrySet()) {
                
                List<Jatekos> adott = elem.getValue();

                for (Jatekos jatekos : adott) {
                    osszeg += jatekos.getMagassag();
                    szaml++;
                }

            }

            return (float) osszeg / szaml;
        }

        if (melyikAtlag.equals("suly")) {
            int szaml = 0;
            int osszeg = 0;
            for (Map.Entry<String, List<Jatekos>> elem : jatekosok.entrySet()) {

                List<Jatekos> adott = elem.getValue();

                for (Jatekos jatekos : adott) {
                    osszeg += jatekos.getSuly();
                    szaml++;
                }

            }

            return (float) osszeg / szaml;
        }

        return 0;
    }
}
