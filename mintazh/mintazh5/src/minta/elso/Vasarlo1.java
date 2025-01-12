package elso;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Vasarlo1 implements KozosResz1 {
    public final String nev;
    protected String igazolvanySzam;
    private int penz;

    public Vasarlo1(String nev, String igazolvanySzam) {
        this.nev = nev;
        this.igazolvanySzam = igazolvanySzam;
        this.penz = 0;
    }

    public int getPenz() {
        return penz;
    }

    public void penztKolt(int mennyit) {
        if (getPenz() < mennyit) {
            throw new SajatException1("Nincs eleg penz!");
        } else {
            this.penz -= mennyit;
        }
    }

    public void vagyontKiszamit(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String[] adott = sor.split(";");

                if (adott[1].equalsIgnoreCase("BEVETEL")) {
                    this.penz += Integer.parseInt(adott[2]);
                }
                if (adott[1].equalsIgnoreCase("KIADAS")) {
                    penztKolt(Integer.parseInt(adott[2]));
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
