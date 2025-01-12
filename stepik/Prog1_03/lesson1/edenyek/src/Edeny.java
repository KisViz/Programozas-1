public class Edeny {
    private String anyag;
    private int meret;
    private Mazsola[] mazsolak;

    public Edeny(String anyag, int meret, int tombmeret) {
        this.anyag = anyag;
        this.meret = meret;
        this.mazsolak = new Mazsola[tombmeret];
    }

    public void addMazsola(Mazsola mazsola) {
        if (osszesMeret() + mazsola.getMeret() > meret) {
            return;
        }

        for (int i = 0; i < mazsolak.length; i++) {
            if (mazsolak[i] == mazsola) {
                return;
            }

            if (mazsolak[i] == null) {
                mazsolak[i] = mazsola;
                break;
            }
        }
    }

    public void deleteMazsola(Mazsola mazsola) {
        for (int i = 0; i < mazsolak.length; i++) {
            if (mazsolak[i] == mazsola) {
                for (int j = i; j < mazsolak.length - 1; j++) {
                    mazsolak[j] = mazsolak[j+1];
                }
                mazsolak[mazsolak.length - 1] = null;
            }
        }
    }

    private int osszesMeret() {
        int meret = 0;
        for (Mazsola m: mazsolak) {
            if (m != null) {
                meret += m.getMeret();
            }
        }

        return meret;
    }

    public String getAnyag() {
        return anyag;
    }

    public int getMeret() {
        return meret;
    }

    public Mazsola[] getMazsolak() {
        return mazsolak;
    }
}
    // megvalositasok}