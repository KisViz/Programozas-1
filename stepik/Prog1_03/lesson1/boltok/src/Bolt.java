public class Bolt {
    private String nev;
    private int nyitasiIdopont;
    private int zarasiIdopont;
    private int szemelyzet;
    private boolean nyitva;

    private static int boltszam;

    public static int nyitottBoltok() {
        return boltszam;
    }
    public void kinyit() {
//        if (nyitva) {
            boltszam++;
//        }
        nyitva = true;
    }

    public void bezar() {
//        if (!nyitva) {
            boltszam--;
//        }
        nyitva = false;
    }

    public Bolt(String nev, int nyitasiIdopont, int zarasiIdopont, int szemelyzet) {
        this.nev = nev;
        this.nyitasiIdopont = nyitasiIdopont;
        this.zarasiIdopont = zarasiIdopont;
        this.szemelyzet = szemelyzet;
        this.nyitva = false;
    }

    public String getNev() {
        return nev;
    }

    public int getNyitasiIdopont() {
        return nyitasiIdopont;
    }

    public int getZarasiIdopont() {
        return zarasiIdopont;
    }

    public int getSzemelyzet() {
        return szemelyzet;
    }

    public boolean isNyitva() {
        return nyitva;
    }
}