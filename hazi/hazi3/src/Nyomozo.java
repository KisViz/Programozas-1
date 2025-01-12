public class Nyomozo {

    public String nev;
    private String[] gyanusitottak;
    private int[] nyomok;

    /**----------------------------------------------------------------------------*/
    public Nyomozo(String[] gyanusitottak, int[] nyomok) {
        this.gyanusitottak = gyanusitottak;
        this.nyomok = nyomok;
        this.nev = "Columbo";
    }

    public Nyomozo(String nev, String[] gyanusitottak, int[] nyomok) {
        this.nev = nev;
        this.gyanusitottak = gyanusitottak;
        this.nyomok = nyomok;
    }

    /**----------------------------------------------------------------------------*/
    public String[] getGyanusitottak() {
        return gyanusitottak;
    }

    public int[] getNyomok() {
        return nyomok;
    }

    public void setGyanusitottak(String[] gyanusitottak) {
        this.gyanusitottak = gyanusitottak;
    }

    public void setNyomok(int[] nyomok) {
        this.nyomok = nyomok;
    }

    /**----------------------------------------------------------------------------*/
    public boolean nyomotFelhasznal(int index) {
        if (index > this.nyomok.length - 1 || index < 0 || this.nyomok.length == 0) {
            //1 2 3 4 5 6
            //len = 6
            //6-os index nincs
            return false;
        }

        int[] uj = new int[this.nyomok.length - 1];
        int ujszaml = 0;
        int regiszaml = 0;
        while (true) {
            if (regiszaml == index) {
                regiszaml++;
            } else {
                uj[ujszaml] = this.nyomok[regiszaml];
                ujszaml++;
                regiszaml++;
            }

            if (ujszaml == this.nyomok.length - 1) {
                break;
            }
        }

        setNyomok(uj);
        return true;
    }

    public boolean felmentoBizonyitek(String kit) {
        if (this.gyanusitottak.length == 0) {
            return false;
        }

        boolean tartalmazza = false;
        int index = 0;
        for (int i = 0; i < this.gyanusitottak.length; i++) {
            if (kit.equals(this.gyanusitottak[i])) {
                tartalmazza = true;
                index = i;
            }
        }
        if (!tartalmazza) {
            return false;
        }

        String[] uj = new String[this.gyanusitottak.length - 1];
        int ujszaml = 0;
        int regiszaml = 0;
        while (true) {
            if (regiszaml == index) {
                regiszaml++;
            } else {
                uj[ujszaml] = this.gyanusitottak[regiszaml];
                ujszaml++;
                regiszaml++;
            }

            if (ujszaml == this.gyanusitottak.length - 1) {
                break;
            }
        }
        setGyanusitottak(uj);
        return true;
    }

    public void inditek() {
        if (this.gyanusitottak.length == 0) {
            return;
        }

        String tart =this.gyanusitottak[0];
        for (int i = 0; i < this.gyanusitottak.length - 1; i++) {
            this.gyanusitottak[i] = this.gyanusitottak[i + 1];
        }
        this.gyanusitottak[this.gyanusitottak.length - 1] = tart;
    }

    public void nyomokatRendez() {
        if (this.nyomok.length == 0) {
            return;
        }
        //elso masodik harmadik nagyedik otodik
        //[0] = len - 1 - 0     [i] = len - 1 -i
        for (int i = 0; i < this.nyomok.length / 2; i++) {
            int tart = this.nyomok[i];
            this.nyomok[i] = this.nyomok[this.nyomok.length - 1 - i];
            nyomok[this.nyomok.length - 1 - i] = tart;
        }
    }

    public void alibikEliminalasa() {
        if (this.nyomok.length < 3) {
            return;
        }

        //0 1 2 3 4 5 6 7 8 9
        //0 1 - 3 4 - 6 7 - 9
        //i % 3 = 2
        int[] uj = new int[this.nyomok.length - (this.nyomok.length / 3)];
        int ujszaml = 0;
        for (int i = 0; i < this.nyomok.length; i++) {
            if (i % 3 != 2) {
                uj[ujszaml] = this.nyomok[i];
                ujszaml++;
            }
        }
        setNyomok(uj);
    }

    public boolean bajbanVan () {
        int index = -1;
        for (int i = 0; i < this.nyomok.length; i++) {
            if (nyomok[i] == 1) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            if (nyomotFelhasznal(index)) {
                if (felmentoBizonyitek(this.nev)) {
                   return true;
                }
            }
        }
        return false;
    }

    public String nyomozas() {
        while (true) {
            if (this.gyanusitottak.length < 1) {
                return "Sajnos az ügy megoldatlan, nincs gyanúsított";
            }

            if (this.nyomok.length == 0 && this.gyanusitottak.length > 0) {
                StringBuilder ki = new StringBuilder();
                ki.append("Nincs elég nyom, a megmaradt gyanúsítottak: ");
                for (int i = 0; i < this.gyanusitottak.length - 1; i++) {
                    ki.append(this.gyanusitottak[i]+ " ");
                }
                ki.append(this.gyanusitottak.length - 1);
                return ki.toString();
            }

            if (this.gyanusitottak.length == 1) {
                return "Az ügy megoldva, a bűnös: " + this.gyanusitottak[0];
            }

            if (nyomok.length - 1 > 0) {
                nyomotFelhasznal(0);
            }

            if (this.gyanusitottak[0].equals(this.nev)){
                bajbanVan();
            }

            if (this.nyomok[0] == 1) {
                felmentoBizonyitek(this.gyanusitottak[0]);
//                nyomotFelhasznal(0);
            } else if (this.nyomok[0] == 2) {
                inditek();
            } else if (this.nyomok[0] == 3) {
                nyomokatRendez();
            } else if (this.nyomok[0] == 4) {
                alibikEliminalasa();
            } else if (this.nyomok[0] == 5) {
                nyomotFelhasznal(0);
                nyomotFelhasznal(0);
            }
        }
    }
}
