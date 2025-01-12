public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length;) {
            if (args[i].equals("Macska")) {
                System.out.println(new Macska(args[i+1], Integer.parseInt(args[i+2])));
                i += 3;
            } else if (args[i].equals("Beka")) {
                System.out.println(new Beka(args[i+1]));
                i += 2;
            } else {
                i++;
                System.err.println("HIBA");
            }
        }
    }
}