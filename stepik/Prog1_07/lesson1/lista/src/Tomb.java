import com.google.gson.Gson;

public class Tomb {
    int[] tomb;

    public Tomb(int[] tomb) {
        this.tomb = tomb;
    }

    public Tomb() {}

    public int osszeg() {
        int osszeg = 0;
        for (int i = 0; i <= tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }

    public double szetfoszlik(int alap) throws Exception {
        double eredmeny = alap;

        for (int value : tomb) {
            eredmeny /= value;
        }

        if (eredmeny == Double.POSITIVE_INFINITY) {
            throw new Exception("NEMAR!");
        }

        return eredmeny;
    }

    public void beilleszt(String szoveg) {
        String[] darabok = szoveg.split(",");
        for (int i = 0; i < darabok.length; i++) {
            tomb[i] = Integer.parseInt(darabok[i]);
        }
    }

}
