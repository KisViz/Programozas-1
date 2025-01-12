public class Sieles {
    public static int sieles(int hossz, int silecAr, int berlesAr) {
        if (hossz * berlesAr < silecAr) {
            return 0;
        } else {
            return 1;
        }
    }
}