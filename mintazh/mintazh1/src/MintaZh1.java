public class MintaZh1 {

    public static String atalakit (String eredeti) {
        if (eredeti == null) {
            return null;
        }

        return new String(eredeti.replace('e','a'));
    }

    public static int tuzijatek(int[] tavok, int latotav){
        if (tavok == null || tavok.length == 0) {
            return -1;
        }

        int[] varosDb = new int[tavok.length + 1];

        int nyerovarosIndex = 0;
        int nyerovarosDb = 0;
        for (int i = varosDb.length; i >= 0; i--) {

            int visszafeleDB = 0;
            int visszafeleHossz = 0;
            for (int j = i; j > 0 ; j--) {


                visszafeleHossz += tavok[j - 1];
                if (visszafeleHossz <= latotav) {
                    visszafeleDB++;
                }
            }

            int eloreDB = 0;
            int eloreHossz = 0;
            for (int j = i; j < varosDb.length - 1; j++) {

                eloreHossz += tavok[j];
                if (eloreHossz <= latotav) {
                    eloreDB++;
                }
            }

            if (nyerovarosDb < eloreDB + visszafeleDB) {
                nyerovarosDb = eloreDB + visszafeleDB;
                nyerovarosIndex = i;
            }
        }

        return nyerovarosIndex;
    }




    public static void main(String[] args) {
//        System.out.println(atalakit("szeretlek"));

        int[] tomb = new int[]{1,3,5,3,4,3};
        System.out.println(tuzijatek(tomb, 8));
    }
}
