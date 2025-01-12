public class Bolt {
    public static boolean viragRendeles(Csokor[] raktarkeszlet, Csokor[] rendeles) {
        if (raktarkeszlet.length < rendeles.length) {
            return false;
        }

        for (int i = 0; i < rendeles.length; i++) {
            boolean letezik = false;

            for (int j = 0; j < raktarkeszlet.length; j++) {
                if (rendeles[i].tipus == raktarkeszlet[j].tipus) {
                    if (raktarkeszlet[j].mennyiseg < rendeles[i].mennyiseg) {
                        return false;
                    } else {
                        letezik = true;
                    }
                }
            }

            if (letezik == false) {
                return false;
            }
        }

        return true;
    }
}