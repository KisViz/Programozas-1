public class Gyumolcskosar {
    private Gyumolcs[] gyumolcsok;

    public Gyumolcskosar(int meret) {
        gyumolcsok = new Gyumolcs[meret];
    }

    public Gyumolcs[] getGyumolcsok() {
        return gyumolcsok;
    }

    public int gyumolcsSzam() {
        int szaml = 0;
        for (Gyumolcs gy : gyumolcsok) {
            if (gy != null) {
                szaml++;
            }
        }
        return szaml;
    }


    public boolean gyumolcsotHozzaad(Gyumolcs gyumolcs) {
        int i;
        for (i = 0; i < gyumolcsok.length; i++) {
            if (gyumolcsok[i] != null) {
                if (gyumolcsok[i].getClass() == gyumolcs.getClass()) {
                    return false;
                }
            } else {
                break;
            }
        }

        if (i >= gyumolcsok.length) {
            return false;
        }

        gyumolcsok[i] = gyumolcs;
        return true;
    }

/*    public boolean gyumolcsotHozzaad(Gyumolcs gy) {
        int i;
        for (i = 0; i < gyumolcsok.length; i++) {
            if (gyumolcsok[i] != null) {
                if (gyumolcsok[i].getClass() == gy.getClass()) {
                    return false;
                }
            } else {
                break;
            }
        }

        if (i >= gyumolcsok.length) {
            return false;
        }

        gyumolcsok[i] = gy;
        return false;
    }*/
}