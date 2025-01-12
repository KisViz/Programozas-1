public class Logika {

    public static boolean logikai(boolean[] ertekek) {
        for (int i = 0; i < ertekek.length; i++) {
            if (ertekek[i] == false){
                return false;
            }
        }
        return true;
    }

}