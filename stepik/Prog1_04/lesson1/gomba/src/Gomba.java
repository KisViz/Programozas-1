public class Gomba {
    private boolean eheto;
    private double meret;

    @Override
    public String toString() {
        return "Gomba{" +
                "eheto=" + eheto +
                ", meret=" + meret +
                '}';
    }

    public Gomba(boolean eheto, double meret) {
        this.eheto = eheto;
        this.meret = meret;
    }

// megoldasok


    public static int ehetokSzama (Gomba[] tomb) {
        int szaml = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i].eheto) {
                szaml++;
            }
        }

        return szaml;
    }

    public static Gomba legnagyobbEheto (Gomba[] tomb) {
        Gomba legnagyobb = null;

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i].eheto) {
                if (legnagyobb == null) {
                    legnagyobb = tomb[i];

                } else if (tomb[i].meret > legnagyobb.meret) {
                    legnagyobb = tomb[i];
                }
            }

        }
        return legnagyobb;
    }

    public static Gomba[] nagyobbak (Gomba[] tomb) {
        double osszeg = 0;
        for (Gomba gomba : tomb) {
            osszeg += gomba.meret;
        }

        double atlag = osszeg / tomb.length;
        int szaml = 0;
        for (Gomba gomba : tomb) {
            if (gomba.meret > atlag) {
                szaml++;
            }
        }

        Gomba[] uj = new Gomba[szaml];
        int k = 0;
        for (Gomba gomba : tomb){
            if (gomba.meret > atlag) {
                uj[k] = gomba;
                k++;
            }
        }

        return uj;
    }
}