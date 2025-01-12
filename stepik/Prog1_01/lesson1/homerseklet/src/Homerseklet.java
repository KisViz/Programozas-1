public class Homerseklet {
    public static double atlaghomerseklet(int[] homersekletek) {
        double osszeg = 0;
        for (int i = 0; i < homersekletek.length; i++) {
            osszeg += homersekletek[i];
        }
        return osszeg/homersekletek.length;
    }
}