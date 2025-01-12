public class Pusztitas {

    public static int osszegyujtes (int[] tomb, int biras) {
        int szaml = 0;
        for (int i = 0; i < tomb.length; i++) {
            szaml += tomb[i];
        }

        return szaml % biras == 0 ? szaml / biras : (szaml / biras) + 1;
    }

    // megoldas

}