public class Atalakit {
    public static int[] atalakitas(String[] ertekek) {
        int[] uj = new int[ertekek.length];

        for (int i = 0; i < ertekek.length; i++) {
            uj[i] = Integer.parseInt(ertekek[i]);
        }

        return uj;
    }
}