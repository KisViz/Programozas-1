public class Konyha {
    public static int fozes(Szek normal, Szek epikus, int szuksegesFutoero) {

        int osszAr = 0;
        int meglevoFutoero = 0;
        while (meglevoFutoero < szuksegesFutoero) {
            int normalSum = (int) Math.ceil((szuksegesFutoero - meglevoFutoero) / (4.0 * normal.futoeroLabankent)) * normal.ar;
            int epikusSum = (int) Math.ceil((szuksegesFutoero - meglevoFutoero) / (4.0 * epikus.futoeroLabankent)) * epikus.ar;

            if (normalSum < epikusSum) {
                osszAr += normal.ar;
                meglevoFutoero += normal.futoeroLabankent * 4;
            } else {
                osszAr += epikus.ar;
                meglevoFutoero += epikus.futoeroLabankent * 4;
            }
        }

        return osszAr;
    }
}