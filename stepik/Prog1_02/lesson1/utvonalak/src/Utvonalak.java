import java.util.Arrays;

public class Utvonalak {

    public static int legrovidebb(int[] tomb) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] == min) {
                return i;
            }
        }

        return 0;

    }

}