public class Lista {
    public static String vasarlas(Bolt[] boltok) {
        double olcsoAr = boltok[0].almaAr / boltok[0].almaTomeg;
        int olcsoIndex = 0;
        for (int i = 0; i < boltok.length; i++) {
            double kilonkenti = boltok[i].almaAr / boltok[i].almaTomeg;
            // 2 kg 500 ft -> 1 kg 500/2 = 250 ft

            if (kilonkenti < olcsoAr) {
                olcsoAr = kilonkenti;
                olcsoIndex = i;
            }
        }

        return boltok[olcsoIndex].nev;
    }
}