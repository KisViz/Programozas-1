package pista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kutya2 {
    private final String fajta;
    private int treningSzint;
    private int nepszeruseg = 0;

    public Kutya2(String fajta) {
        this.fajta = fajta;
        this.treningSzint = 50;
    }

    public void trening(int orak) {
        if (orak < 0) {
            throw new RuntimeException("Nem lehet 0");
        }

        this.treningSzint += orak;
        this.treningSzint = Math.min(100, this.treningSzint);
    }

    public void jatekAParkban(int embi, int kutyak) {
        this.nepszeruseg = kutyak + embi * 2;
    }

    public String getFajta() {
        return fajta;
    }

    public int getTreningSzint() {
        return treningSzint;
    }

    public int getNepszeruseg() {
        return nepszeruseg;
    }

    public void beolvas() {
        try (Scanner scanner = new Scanner(new File("kutyak.csv"))) {
            while (scanner.hasNextLine()) {
                String adat = scanner.nextLine();
                String[] sor = adat.split(";");
                new Kutya2(sor[0]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
