public class Szamossag {

    public static void main(String[] args) {
        int poz = 0;
        int neg = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) < 0) {
                neg++;
            } else if (Integer.parseInt(args[i]) > 0) {
                poz++;
            }
        }

        System.out.println(neg == poz ? "mind a kettobol ugyanannyi van" : poz > neg ? "pozitivbol van tobb" : "negativbol van tobb");

        // megoldas
    }

}