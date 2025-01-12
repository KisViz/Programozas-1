public class Munkahely {
    public static int lepcsozes(int[] viragok, int lepcsoszam) {
        int ossz = 0;
        for (int i = 0; i < viragok.length; i++) {
            ossz += 2 * (viragok[i] * lepcsoszam);

        }
        return ossz;
    }
}