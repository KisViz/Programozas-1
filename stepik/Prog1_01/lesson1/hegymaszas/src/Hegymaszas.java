public class Hegymaszas {

    static int maszas (int[] tomb) {
        int ossz = Math.max(tomb[0], 0);

        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] > tomb[i - 1]) {
                ossz += tomb[i] - tomb[i - 1];
            }
        }
        return ossz;
    }

}