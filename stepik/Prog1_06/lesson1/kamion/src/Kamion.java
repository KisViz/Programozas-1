public class Kamion {
    public int[] csomagok;

    public Kamion(int meret) {
        csomagok = new int[meret];
    }

    public void csomagotFelvesz(int meret) {
        for (int i = 0; i < csomagok.length; i++) {
            if (csomagok[i] == 0) {
                csomagok[i] = meret;
                break;
            }
        }
    }

}