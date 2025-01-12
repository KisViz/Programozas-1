public class Zhgyak {

    public static int[] javitas (int[] magassag) {
        int jo = 0;

        if (magassag[0] > magassag[1]) {
            jo++;
        }
        for (int i = 1; i < magassag.length; i++) {
            if (magassag[i] <= magassag[i - 1]) {
                jo++;
            }
        }
//        System.out.println(jo);

        int[] uj = new int[jo];
        int k = 0;
        if (magassag[0] > magassag[1]) {
            uj[k] = magassag[0];
            k++;
        }
        for (int i = 1; i < magassag.length; i++) {
            if (magassag[i] <= magassag[i - 1]) {
                uj[k] = magassag[i];
                k++;
            }
        }

        for (int i = 0; i < uj.length; i++) {
            System.out.println(uj[i]);
        }
        return uj;
    }


    public static double sorozat (double elso, double d, int a, int b) {
        double x = elso+(a-1) * d;
        double y = elso+(b-1) * d;
        double szorzat = x;
        for (double i = x + d; i < y; i += d) {
            szorzat*=i;
            }

        return szorzat;
    }

    public static void main(String[] args) {
        int[] tomb1 = new int[] {4,3,2,1};
        int[] tomb2 = new int[] {6,6,6,6};
        int[] tomb3 = new int[] {100,80,100,90,70,50};

//        System.out.println(javitas(tomb1));
//        System.out.println(javitas(tomb2));
//        System.out.println(javitas(tomb3));

        System.out.println(sorozat(1.0,1.0, 3,5));
    }
}
