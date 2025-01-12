package hu.sed.kutyapark;

import java.util.*;

//6. feladat
public class KutyaPark {
    //a map inicializálása a konstruktorban is megoldható, ilyenkor a konstruktorban: this.kutyak = new HashMap<>(); itt pedig csak: private Map<String, Kutya> kutyak;
    private Map<String, Kutya> kutyak = new HashMap<>();
    private final String parkNev;

    //6. feladat
    public KutyaPark(String parkNev) {
        this.parkNev = parkNev;
    }

    //7. feladat
    public void kutyaErkezik(String nev, String fajta) {
        //a containsKey() segítségével ellenőrizhető, hogy egy kulcsot tartalmaz-e a map
        if (!kutyak.containsKey(nev)) {
            //put segítségével beletesszük a map-be az új kutyánkat
            kutyak.put(nev, new Kutya(fajta));
        }
    }

    //8. feladat
    public void trening(String nev, int orak) {
        //az előzőhöz hasonló módon ellenőzizzük van e ilyen nevű (kulcsú) kutyánk
        if (kutyak.containsKey(nev)) {
            //amennyiben létezik, lekérjük a kulcs alapján és meghívjuk rá a tréning metódust
            kutyak.get(nev).trening(orak);
        }
    }

    //9. feladat
    public void jatek(String nev, int latogatokSzama) {
        //az előzőhöz hasonló módon ellenőzizzük van e ilyen nevű (kulcsú) kutyánk
        if (kutyak.containsKey(nev)) {
            //amennyiben létezik, lekérjük a kulcs alapján és meghívjuk rá a jatekAParkban metódust
            kutyak.get(nev).jatekAParkban(latogatokSzama, this.kutyak.size());
        }
    }

    //10. feladat
    public String[] kutyakNepszerusegSzerint() {
        //A kutyák mapet listává alakítjuk
        List<Map.Entry<String, Kutya>> rendezettKutyak = new ArrayList<>(kutyak.entrySet());
        //rendezésre egy egyszerű lambdás megoldás, csökkenő sorrand miatt először a 2. tagot írjuk majd az elsőt
        rendezettKutyak.sort((entry1, entry2) -> Integer.compare(entry2.getValue().getNepszeruseg(), entry1.getValue().getNepszeruseg()));
        /* a rendezés igy is megoldható:
         rendezettKutyak.sort(new Comparator<Map.Entry<String, Kutya>>() {
            @Override
            public int compare(Map.Entry<String, Kutya> o1, Map.Entry<String, Kutya> o2) {
                return Integer.compare(o1.getValue().getNepszeruseg(), o2.getValue().getNepszeruseg());
            }
        });
        */
        //létrehozunk egy akkora méretű tömböt mint amekkora a rendezett listánk
        String[] result = new String[rendezettKutyak.size()];
        //belemásoljuk a tömbbe a lista kulcs értékeit, mivel a kulcs a kutyánk neve
        for (int i = 0; i < rendezettKutyak.size(); i++) {
            result[i] = rendezettKutyak.get(i).getKey();
        }
        //visszaadjuk a rendezett márcsak neveket tartalmazó tömböt
        return result;
    }

    //11. feladat
    public String[] kutyakTreningSzerint() {
        //A kutyák mapet listává alakítjuk
        List<Map.Entry<String, Kutya>> rendezettKutyak = new ArrayList<>(kutyak.entrySet());
        //rendezésre egy egyszerű lambdás megoldás, csökkenő sorrand miatt először a 2. tagot írjuk majd az elsőt
        rendezettKutyak.sort((entry1, entry2) -> Integer.compare(entry2.getValue().getTreningSzint(), entry1.getValue().getTreningSzint()));
        /* a rendezés igy is megoldható:
         rendezettKutyak.sort(new Comparator<Map.Entry<String, Kutya>>() {
            @Override
            public int compare(Map.Entry<String, Kutya> o1, Map.Entry<String, Kutya> o2) {
                return Integer.compare(o2.getValue().getTreningSzint(), o1.getValue().getTreningSzint());
            }
        });
        */
        //létrehozunk egy akkora méretű tömböt mint amekkora a rendezett listánk
        String[] result = new String[rendezettKutyak.size()];
        //belemásoljuk a tömbbe a lista kulcs értékeit, mivel a kulcs a kutyánk neve
        for (int i = 0; i < rendezettKutyak.size(); i++) {
            result[i] = rendezettKutyak.get(i).getKey();
        }
        //visszaadjuk a rendezett márcsak neveket tartalmazó tömböt
        return result;
    }

    //12. feladat
    public List<String> csakOkosKutyak(int mikortolOkos) {
        //készítünk egy eredmények listát
        List<String> result = new ArrayList<>();
        //lambdás megoldással egyszerűen bejárjuk a kutyák mapet, természetesen szokásos entrys mnegoldás is jó
        kutyak.forEach((nev, kutya) -> {
            if (kutya.getTreningSzint() >= mikortolOkos) {
                result.add(nev);
            }
        });
        //mivel a stringnek van compareTo metódusa így tudjuk használni a Collections.sort()-ot, nem kell külön compare vagy compareTo
        Collections.sort(result);
        return result;
    }

    //13. feladat
    public int adottFajtaKutyakSzama(String fajta) {
        int result = 0;
        //bejárjuk a kutyak map értékeit (a kutyákat)
        for (Kutya kutya : kutyak.values()) {
            //ha a fajta megegyezik a paraméterben kapottal akkor növeljük a változónkat
            if (kutya.getFajta().equals(fajta)) {
                result++;
            }
        }
        return result;
    }

    //14. feladat
    public List<String> nepszerutlenKutyakTorlese(int mikortolNepszeru) {
        //létrehozunk egy listát
        List<String> result = new ArrayList<>();
        //lambdával bejárjuk a kutyak mapet
        kutyak.forEach((nev, kutya) -> {
            //ha nem olyan népszerű akkor hozzááadjuk a listához a kutya nevét (key)
            if (kutya.getNepszeruseg() < mikortolNepszeru) {
                result.add(nev);
            }
        });
        //a listában lévő kutya nevekhez (key) tartozó elemeket kitöröljük a mapből
        for (String nev : result) {
            kutyak.remove(nev);
        }
        //visszaadjuk a kitörölt kutyák neveit egy listában
        return result;
    }


    //15. feladat
    public boolean butakutyakTanitasa(int mikortolOkos, int hanyOrat) {
        //kezdetben false mivel egyelőre egy kutyát se tanítottunk
        boolean result = false;
        //bejárjuk a kutyak map értékeit (a kutyákat)
        for (Kutya kutya : kutyak.values()) {
            //ha kevésbé okos akkor tréningeljük
            if (kutya.getTreningSzint() < mikortolOkos) {
                kutya.trening(hanyOrat);
                //tréningeltünk szóval igazzal kell majd visszatérni, így a result true
                result = true;
            }
        }

        return result;
    }


}
