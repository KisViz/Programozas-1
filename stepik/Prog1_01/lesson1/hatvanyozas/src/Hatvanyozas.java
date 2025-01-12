public class Hatvanyozas {

    public static int hatvany(int alap, int kitevo) {
//        return (int) Math.pow(alap, kitevo);
        int vege = 1;
        for (int i = 0; i < kitevo; i++) {
            vege *= alap;
        }
        return vege;
    }

}