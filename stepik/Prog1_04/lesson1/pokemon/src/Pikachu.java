public final class Pikachu extends Pokemon {

    private MogyoroBokor[] bokrok;

    public Pikachu(int kor, int maxbokor) {
        super("Pikachu", kor);
        this.bokrok = new MogyoroBokor[maxbokor];
    }

    public boolean ultetes(MogyoroBokor bokor) {
        if (bokor.kipusztult) { /**eeeeeeeeeeeeeeeeeeeeeeee*/
            return false;
        }

        for (int i = 0; i < this.bokrok.length; i++) {
            if (this.bokrok[i] == null) {
                bokor.elultet();
                this.bokrok[i] = bokor;
                return true;
            }
        }

        return false;
    }

    public int ossztermes() {
        int osszeg = 0;
        for (MogyoroBokor bokor : bokrok) {
            if (bokor != null && !bokor.kipusztult) {
                osszeg += bokor.termesSzam;
            }
        }

        return osszeg;
    }

    public void kigyomlal() {
        for (int i = 0; i < bokrok.length; i++) {
            if (bokrok[i] != null && bokrok[i].kipusztult) {
                bokrok[i] = null;
            }
        }
    }

    /*    private MogyoroBokor[] bokrok;

    public Pikachu(int kor, int maxBokrok) {
        super("Pikachu", kor);
        bokrok = new MogyoroBokor[maxBokrok];
    }

    public boolean ultetes(MogyoroBokor bokor) {
        if (bokor.isKipusztult()) {
            return false;
        }

        for (int i = 0; i < bokrok.length; i++) {
            if (bokrok[i] == null) {
                bokor.elultet();
                bokrok[i] = bokor;
                return true;
            }
        }

        return false;
    }

    public int ossztermes() {
        int osszeg = 0;

        for (MogyoroBokor mogyoroBokor : bokrok) {
            if (mogyoroBokor != null && !mogyoroBokor.isKipusztult()) {
                osszeg += mogyoroBokor.termesSzam;
            }
        }

        return osszeg;
    }

    public void kigyomlal() {
        for (int i = 0; i < bokrok.length; i++) {
            if (bokrok[i] != null && bokrok[i].isKipusztult()) {
                bokrok[i] = null;
            }
        }
    }*/

}