import java.util.Arrays;

public class Masolat {

    public static int[] masol(int[] eredeti) {
        int[] uj = new int[eredeti.length];
        uj = Arrays.copyOf(eredeti, eredeti.length);
        return uj;
    }

}