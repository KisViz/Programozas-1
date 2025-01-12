public class Konyv {
    public static void main(String[] args) {
        int osszeg = 0;

        for (int i = 0; i < args.length; i++) {
            osszeg += Integer.parseInt(args[i]);
        }

        System.out.println("Kiolvasott oldalak szama: " + osszeg);
    }
}