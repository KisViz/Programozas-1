public class Gyakorlas {

    public static int szoszaml(String szoveg) {
        if (szoveg == null || szoveg.isEmpty()) {
            return 0;
        }

        int szaml = 1;
        for (int i = 0; i < szoveg.length() - 1; i++) {

            if (szoveg.charAt(i) == ' ' && szoveg.charAt(i + 1) != ' ') {
                szaml++;
            }
        }

        return szaml;
    }

    public static String nagybetusse(String szoveg) {
        szoveg = szoveg.toLowerCase();
        int j = 0;
        StringBuilder uj = new StringBuilder();
        uj.append(Character.toUpperCase(szoveg.charAt(0)));
        for (int i = 1; i < szoveg.length(); i++) {
            if (i > 0 && szoveg.charAt(i) != ' ' && szoveg.charAt(i - 1) == ' ') {
                uj.append(Character.toUpperCase(szoveg.charAt(i)));
            } else {
                uj.append(szoveg.charAt(i));
            }
        }

        return uj.toString();
    }

    public static int[] primek(int[] szamok) {

        int db = 0;
        for (int i = 0; i < szamok.length; i++) {
            int osztokDb = 0;

            for (int j = 1; j < szamok[i]; j++) {
                if (szamok[i] % j == 0) {
                    osztokDb++;
                }
            }

            if (osztokDb == 1) {
                db++;
            }
        }

        int[] uj = new int[db];
        int k = 0;
        for (int i = 0; i < szamok.length; i++) {
            int osztokDb = 0;

            for (int j = 1; j < szamok[i]; j++) {
                if (szamok[i] % j == 0) {
                    osztokDb++;
                }
            }

            if (osztokDb == 1) {
                uj[k] = szamok[i];
                k++;
            }
        }

        for (int i = 0; i < uj.length; i++) {
            System.out.print(uj[i] + ", ");
        }

        return uj;
    }

    public static int[] tokeletes(int kezdet, int veg) {

        int db = 0;
        for (int i = kezdet; i <= veg; i++) {
            int osszeg = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    osszeg += j;
                }
            }
            if (osszeg == i) {
                db++;
            }
        }

        int[] uj = new int[db];
        int k = 0;
        for (int i = kezdet; i <= veg; i++) {
            int osszeg = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    osszeg += j;
                }
            }
            if (osszeg == i) {
                uj[k] = i;
                k++;
            }
        }

        for (int i = 0; i < uj.length; i++) {
            System.out.print(uj[i] + ", ");
        }

        return uj;
    }

    public static boolean isPalindrom(String szoveg) {
        for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.charAt(i) != szoveg.charAt(szoveg.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String prefix(String[] szavak) {

        //alma also, alaklamz, alternativ

        int db = 0;
        int k = 0;
        StringBuilder pre = new StringBuilder();
        for (int i = 0; i < szavak.length; i++) {

            boolean mind = true;
            char betu = szavak[i].charAt(k);
            for (int j = 0; j < szavak.length; j++) {
                if (szavak[j].charAt(k) == betu) {

                } else {
                    mind = false;
                }
            }

            if (mind) {
                pre.append(betu);
                k++;
            }
        }

        return pre.toString();
    }


    public static void main(String[] args) {
        System.out.println(szoszaml("asdsads ad ddd dda"));
        System.out.println(nagybetusse("ASd sasS"));

        int[] szamok = new int[]{1, 2, 3, 4, 5, 6, 11, 12, 15, 19}; //5 db
        System.out.println(primek(szamok));
        System.out.println(tokeletes(2, 29));

        String[] szavak = new String[]{"alma", "also", "alaklamz", "alternativ"};
        System.out.println(prefix(szavak));
        System.out.println(isPalindrom("assdsa"));
    }
}