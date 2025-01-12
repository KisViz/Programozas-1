public class Tolvaj {

    public static boolean koSzamlalas(int lefoglaltKovek, int[] bejelentettKoEltunesek) {
        int szaml = 0;
        for (int i = 0; i < bejelentettKoEltunesek.length; i++) {
            szaml += bejelentettKoEltunesek[i];
        }


        return lefoglaltKovek >= szaml ? true : false;
    }
}