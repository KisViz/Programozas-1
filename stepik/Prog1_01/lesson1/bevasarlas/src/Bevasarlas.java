public class Bevasarlas {
    public static int bevasarlas(Tetel[] tetelek) {
        int ossz = 0;
        for (int i = 0; i < tetelek.length; i++) {
            ossz += tetelek[i].ar * tetelek[i].mennyiseg;
        }
        return ossz;
    }
}