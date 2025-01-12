import java.util.Arrays;

public class Kutya {
    public String nev;
    private String[] kedvencEtelek;
    private short ehseg;
    private long jokedv;

/**-----------------------------------------------------------------*/
    public Kutya(String nev) { //tuti jo
        this.nev = nev;
        this.kedvencEtelek = new String[]{"csirke","sajt","lazac"};
    }

    public Kutya(String nev, String... kedvencEtelek) { //jo?
        this.nev = nev;
        this.kedvencEtelek = kedvencEtelek;
    }

/**-----------------------------------------------------------------*/
    public boolean szereti (String etel) { //tuti jo
        for (int i = 0; i < kedvencEtelek.length; i++) {
            if (etel.equalsIgnoreCase(kedvencEtelek[i])){
                return true;
            }
        }
        return false;
    }

    public void ehesenNez () { //tuti jo
        this.ehseg++;
        System.out.println("Vau!");
    }

    public Kutya farokCsovalas() { //tuti jo
        this.jokedv++;
        return Kutya.this;
    }

    public void eszik(String etel) { //jo?
        if (!szereti(etel)) {
            ehesenNez();
            return;
        }

        this.ehseg--;
        ehseg = ehseg < 0 ? 0 : ehseg;
        if (ehseg == 0) {
            farokCsovalas();
        }
    }

    public boolean odajon(String nev) { //tuti jo
        if (nev.length() != this.nev.length()) {
            return false;
        } else {
            int kul = 0;
            for (int i = 0; i < nev.length(); i++) {
                if (nev.charAt(i) != this.nev.charAt(i)) {
                    kul++;
                }
            }

            if (kul > 2) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static Kutya kutyaEtetes(Kutya elso, Kutya masodik, String etel) { //tuti jo
        if ( (!elso.szereti(etel)) && (!masodik.szereti(etel)) ) {
            return null;
        } else if (elso.szereti(etel) && (!masodik.szereti(etel)) ) {
            return elso;
        } else if ( (!elso.szereti(etel)) && masodik.szereti(etel) ) {
            return masodik;
        }

        double KEelso = Math.sqrt( ((double) elso.ehseg / 2) * ((double)elso.jokedv / 3) );
        double KEmasodik =Math.sqrt( ((double)masodik.ehseg / 2) * ((double)masodik.jokedv / 3) );

        if (KEelso == KEmasodik) {
            return elso;
        } else if (KEelso > KEmasodik) {
            return elso;
        } else {
            return masodik;
        }
    }
}
