public class Kiralyno extends Ember{
    private int megkoronazva;
    private Ember[] szolgak;

    public Kiralyno(String nev, int kor, int vagyon, int megkoronazva, int maxSzolgak) {
        super(nev, kor, vagyon, false);
        this.megkoronazva = megkoronazva;
        this.szolgak = new Ember[maxSzolgak];
    }

    @Override
    public boolean eszik(Etel etel) {
        boolean ok = true;
        for (Ember e: szolgak) {
            if (e != null) {
                ok = ok && e.eszik(etel);
            }
        }

        if (ok) {
            System.out.println("az etel finom volt");
            return true;
        }

        return false;
    }

    private double atlagEletkor() {
        int osszeg = 0;
        int db = 0;
        for (Ember e: szolgak) {
            if (e != null) {
                osszeg += e.getKor();
                db++;
            }
        }

        return osszeg / (double) db;
    }

    public void szolgatFelvesz(Ember e) {
        if (e == this) {
            return;
        }

        if (szolgak[0] == null) {
            szolgak[0] = e;
            vagyon += e.vagyon;
            e.vagyon = 0;
            return;
        }

        double atlag = atlagEletkor();
        if (e.getKor() >= atlag) {
            return;
        }

        for (int i = 0; i < szolgak.length; i++) {
            if (szolgak[i] == null) {
                szolgak[i] = e;
                vagyon += e.vagyon;
                e.vagyon = 0;
                break;
            }
        }
    }

    public int getMegkoronazva() {
        return megkoronazva;
    }

    public Ember[] getSzolgak() {
        return szolgak;
    }
}