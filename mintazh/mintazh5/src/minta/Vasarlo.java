import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vasarlo implements Kozos{
    public final String nev;
    protected String igazolvanySzam;
    private int penz;

    public Vasarlo(String nev, String igazolvanySzam) {
        this.nev = nev;
        this.igazolvanySzam = igazolvanySzam;
        this.penz = 0;
    }

    public void penztKolt(int mennyit) {
        if (getPenz() < mennyit) {
            throw new SajatExeption("Nincs eleg penz!");
        } else {
            this.penz -= mennyit;
        }
    }

    public void vagyontKiszamit(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String[] adat =sor.split(";");
                if (adat[1].equalsIgnoreCase("BEVETEL")) {
                    this.penz += Integer.parseInt(adat[2]);
                } else {
                    this.penztKolt(Integer.parseInt(adat[2]));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int getPenz() {
        return penz;
    }
}
