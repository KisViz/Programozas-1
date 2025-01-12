public class Bevetel {

    public static void main(String[] args) {
        long osszeg = 0;
        int szorzo =Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            osszeg += (double)Double.parseDouble(args[i]);
        }
        System.out.println(osszeg * szorzo);

    }

}