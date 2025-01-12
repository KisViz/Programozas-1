import java.util.Map;

public class Jatekos {
    private String nev;
    private Jatek kedvenc;
    private Map<Jatek, Integer> eddigJatszott;



    public Jatekos(String nev) {
        this.nev = nev;
        this.kedvenc = null;
    }

    public void  jatszik(Jatek mit, int mennyit) throws NemSzeretiException {
        if (kedvenc == null || kedvenc.equals(mit)) {
            if (eddigJatszott.containsKey(mit)) {
                eddigJatszott.put(mit, eddigJatszott.get(mit) + mennyit);
            } else {
                eddigJatszott.put(mit, mennyit);
            }
            kedvenc = getLegtobbetJatszottJatek();
        } else {
            throw new NemSzeretiException(mit);
        }
    }

    private Jatek getLegtobbetJatszottJatek() {
        Jatek legtobbetJatszott = null;
        int maxIdo = 0;
        for (Map.Entry<Jatek, Integer> entry : eddigJatszott.entrySet()) {
            if (entry.getValue() > maxIdo) {
                maxIdo = entry.getValue();
                legtobbetJatszott = entry.getKey();
            }
        }
        return legtobbetJatszott;
    }

    /**--plusz-----------------------*/

    public Jatek getKedvenc() {
        return kedvenc;
    }

    public String getNev() {
        return nev;
    }
}
