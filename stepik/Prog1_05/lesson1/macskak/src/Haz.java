public class Haz {
    private Allat[] allatok;

    public Haz(int maxAllatszam) {
        allatok = new Allat[maxAllatszam];
    }

    public Allat[] getAllatok() {
        return allatok;
    }

    public void allatJon (Allat allat) {
        if (allat == null) {
            return;
        } else {
            int ures = -1;
            for (int i = 0; i < allatok.length; i++) {
                if (allatok[i] == allat) {
                    return;
                }

                if (allatok[i] == null) {
                    allatok[i] = allat;
                    return;
                }
            }
        }
    }

    public void tevekenyseg() {
        for (Allat a : allatok) {
            if (a instanceof Macska) {
                ((Macska) a).nyavog();
            } else if (a instanceof Tehen) {
                ((Tehen) a).tejetAd();
            } else if (a instanceof Lo) {
                ((Lo) a).nyerit();
            }
        }
    }
}
