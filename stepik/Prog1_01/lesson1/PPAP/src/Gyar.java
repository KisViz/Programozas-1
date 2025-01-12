public class Gyar {
    public static int PPAP(int pen, int apple, int pineapple) {
        int db = Math.min(pineapple, apple);
        return Math.min(db, pen / 2);
    }
}