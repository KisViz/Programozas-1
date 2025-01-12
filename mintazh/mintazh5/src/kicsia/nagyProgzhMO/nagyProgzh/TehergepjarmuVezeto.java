import java.io.*;
import java.sql.SQLOutput;

public class TehergepjarmuVezeto implements  Teherinterface {
    public final String nev;
    protected  int tapasztalat;
    private int kilometer = 1000;

    public TehergepjarmuVezeto (String nev, int tapasztalat){
        this.nev = nev;
        this.tapasztalat = tapasztalat;
        this.kilometer = 1000;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void kilometertKiszamit (String fuvarlevelFajl){
        try {
            BufferedReader br = new BufferedReader((new FileReader(fuvarlevelFajl)));
            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(";");
                this.kilometer += Integer.parseInt(adatok[1]) * (adatok[0].equals("PIHENES") ? 1 : -1);

                sor = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void kilometertTesz (int mennyit){
        if (getKilometer() < mennyit) {
            throw new Teherkivetel("Nincs eleg kilometer!");
        } else {
            this.kilometer -= mennyit;
        }
    }


}
