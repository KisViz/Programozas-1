public class Argumentumok {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i += 2) {
            if (i + 1 < args.length) {
                System.out.println(args[i + 1]);

            }
        }
        // megoldas
    }

}
