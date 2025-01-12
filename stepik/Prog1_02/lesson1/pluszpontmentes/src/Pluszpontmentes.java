public class Pluszpontmentes {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            if (Double.parseDouble(args[i + 1]) == 0) {
                System.out.println(args[i]);
            }
        }
    }

}