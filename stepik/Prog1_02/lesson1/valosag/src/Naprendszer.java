public class Naprendszer {
    public static boolean valosagos(Bolygo[] bolygok) {
        for (int i = 1; i < bolygok.length; i++) {
            if (bolygok[i].kozetbolygo && !bolygok[i-1].kozetbolygo) {
                return false;
            }
        }

        return true;
    }
    // megoldas
}