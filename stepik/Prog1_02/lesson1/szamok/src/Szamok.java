
public class Szamok {
    public static void main(String[] args) {
        int db = 0;


        kulso: for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {
                if (args[i].charAt(j) < '0' || args[i].charAt(j) > '9') {
                    continue kulso;
                }
            }

            db++;
        }

        System.err.println(db);
    }

}



// megoldas