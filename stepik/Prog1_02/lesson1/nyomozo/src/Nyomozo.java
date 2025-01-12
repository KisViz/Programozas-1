public class Nyomozo {
    public static boolean nyomkereses(String helyszin, String bizonyitek) {
        if (helyszin == null || bizonyitek == null) {
            return false;
        }

        return helyszin.contains(bizonyitek) ? true : false;
    }
}