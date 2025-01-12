public class Matematika {
    public static int signum(double ertek) {
        if (ertek < 0) {
            return -1;
        } else if (ertek > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}