public class Munka {
    public static boolean villamos(int[] felszallok) {
        int ossz = 0;
        for (int i = 0; i < felszallok.length; i++) {
            ossz += felszallok[i];

            if (ossz < 0) {
                return false;
            }
        }

        return true;
    }
}