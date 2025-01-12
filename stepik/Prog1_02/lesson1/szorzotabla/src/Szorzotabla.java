public class Szorzotabla {
    public static int[][] letrehoz(int sorok, int oszlopok) {
        int[][] tabla = new int[sorok][oszlopok];
        for (int i = 1; i < sorok + 1; i++) {
            for (int j = 1; j < oszlopok + 1; j++) {
                tabla[i - 1][j - 1] = i * j;
            }
        }
        return tabla;


//        int[][] eredmeny = new int[sorok][oszlopok];
//
//        for (int i = 0; i < sorok; i++) {
//            for (int j = 0; j < oszlopok; j++) {
//                eredmeny[i][j] = (i+1) * (j+1);
//            }
//        }
//
//        return eredmeny;
    }
}