public class Szamsokasag {
    public static void main(String[] args) {
        int legtobbSzam = 0;
        int legtobbDb = 0;

        for (int i = 0; i < args.length; i++) {
            int szam = Integer.parseInt(args[i]);
            int szaml = 0;

            for (int j = 0; j < args.length; j++) {
                if (Integer.parseInt(args[j]) == szam) {
                    szaml++;
                }
            }

            if (szaml > legtobbDb) {
                legtobbDb = szaml;
                legtobbSzam = szam;
            }
        }

        boolean tobb = false;
        for (int i = 0; i < args.length; i++) {
            int szam = Integer.parseInt(args[i]);
            int szaml = 0;

            for (int j = 0; j < args.length; j++) {
                if (Integer.parseInt(args[j]) == szam) {
                    szaml++;
                }
            }

            if (szaml == legtobbDb && szam != legtobbSzam) {
                tobb = true;
            }
        }

        if (tobb) {
            System.out.println("Tobb ilyen szam is van");
        } else {
            System.out.println("Ebbol van a legtobb: " + legtobbSzam);
        }


        // megoldas
    }
}