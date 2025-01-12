public class ZhEredmenyek {

    public static void main(String[] args) {
        int osszeg = 0;
        for (int i = 0; i < args.length; i++) {
            osszeg += Integer.parseInt(args[i]);
        }
        System.out.println((double) osszeg/args.length);
    }

}