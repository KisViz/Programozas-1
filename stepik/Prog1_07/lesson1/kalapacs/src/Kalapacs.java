public class Kalapacs {

    public void kalapalas(int[] szogMeret, int falmeret) {
        if (szogMeret == null) {
            throw new NullPointerException("nincsenek szogek");
        }

        if (falmeret == 0) {
            throw new IllegalArgumentException("nincs fal");
        }

        int res = 0;
        for (int i = 0; i <= szogMeret.length; i++) {
            res += falmeret / szogMeret[i];
        }

        System.out.println(res);
    }

}