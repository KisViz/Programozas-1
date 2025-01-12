public class Erdemjegy {

    public static String ertekeles(int erdemjegy) {
        if (erdemjegy > 5 || erdemjegy < 1) {
            return "Jutka neni, figyeljen oda milyen jegyet ad!";
        }

        if (erdemjegy == 5) {
            return "jeles";
        } else if (erdemjegy == 4) {
            return "jo";
        } else if (erdemjegy == 3) {
            return "kozepes";
        } else if (erdemjegy == 2) {
            return "elegseges";
        } else {
            return "elegtelen";
        }
    }

}