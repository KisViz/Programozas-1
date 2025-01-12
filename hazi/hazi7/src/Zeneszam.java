import java.util.Arrays;

public class Zeneszam implements BesorolassalRendelkezo{
    private String eloado;
    private String szamCim;
    private String szoveg;

    public Zeneszam(String eloado, String szamCim, String szoveg) {
        this.eloado = eloado;
        this.szamCim = szamCim;
        this.szoveg = szoveg;
    }

    public String getEloado() {
        return eloado;
    }

    public String getSzamCim() {
        return szamCim;
    }

    @Override
    public int getKorhatarBesorolas() {
        int szaml = 0;
        String[] karomkodasok = {"xeierirg", "kuoulzz", "pqtruei", "fktilop", "kxre", "eifei", "csozrox"};
        String[] darabolt = this.szoveg.split(" ");
        for (int i = 0; i < karomkodasok.length; i++) {
//            System.out.println("karomkodas: "+karomkodasok[i]);
            for (int j = 0; j < darabolt.length; j++) {
//                System.out.println(darabolt[j]);
                if (karomkodasok[i].equalsIgnoreCase(darabolt[j])) {
                    szaml++;
                }
            }
        }
        return szaml;
    }
}
