import java.util.Arrays;

public class Gyar {

    public static int[] ures10ElemuTomb() {
        int[] tomb = new int[10];
        Arrays.fill(tomb, 0);
     /*   for (int i = 0; i < 10; i++) {
            tomb[i] = 0;
        }*/
        return tomb;
    }

    public static int[] uresXElemuTomb(int x) {
 /*       int[] tomb = new int[x];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = x;
        }*/
        return new int[x];
    }

    public static int[] novekvoXElemuTomb(int x) {
        int[] tomb = new int[x];
        for (int i = 0; i < x; i++) {
            tomb[i] = i;
        }
        return tomb;
    }

    public static String[] jatekmaciXElemuTomb(int x) {
        String[] tomb = new String[x];
        Arrays.fill(tomb,"jatekmaci");
        return tomb;
    }

    public static String[] vegyesjatekXElemuTomb(String paros, String paratlan, int darab) {
        String[] tomb = new String[darab];
        for (int i = 0; i < darab; i++) {
            if (i % 2 == 0) {
                tomb[i] = paros;
            } else {
                tomb[i] = paratlan;
            }
        }
        return tomb;
    }

}
