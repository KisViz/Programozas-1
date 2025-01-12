public class Lottozas {

    static int lotto (int[] joco, int[] sors) {
        int talalat = 0;
        for (int i = 0; i < sors.length; i++) {

            for (int j = 0; j < joco.length; j++) {

                if (sors[i] == joco[j]){
                    talalat++;
                }
            }
        }
        return talalat;
    }

}