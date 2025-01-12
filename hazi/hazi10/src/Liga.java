import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liga {
    private List<Csapat> csapatok;
    private List<Meccs> meccsek;

    public Liga(String directoryName) {
        this.csapatok = new ArrayList<>();
        this.meccsek = new ArrayList<>();

        File directory = new File(directoryName);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                Csapat csapat = new Csapat(file.getName().replace(".csv", ""));
                csapat.beolvas(file);
                csapatok.add(csapat);
            }
        }
    }

    public Liga(List<Csapat> csapatok) {
        this.csapatok = csapatok;
    }

    public List<Csapat> getCsapatok() {
        return csapatok;
    }

    public List<Meccs> getMeccsek() {
        return meccsek;
    }

    public List<Csapat> hianyosCsapatok() {
        List<Csapat> hianyosak = new ArrayList<>();

        for (Csapat csapat : csapatok) {
            if (!csapat.hianyzoPoziciok().isEmpty()) {
                hianyosak.add(csapat);
            }
        }

        return hianyosak;
    }

    public int csapatokKizarasa() {
        int hany = hianyosCsapatok().size();

        csapatok.addAll(hianyosCsapatok());

        return hany;
    }

    public Csapat jatek() {
        int i = 0;
        while (csapatok.size() > 1) {
            Meccs meccs = new Meccs(csapatok.get(i), csapatok.get(i + 1));

            meccsek.add(meccs);
            Csapat gyoztesCsapat = meccs.gyoztes();
            csapatok.remove(i);
            csapatok.remove(i);
            csapatok.add(gyoztesCsapat);
            i += 2;
        }
        return csapatok.get(0);
    }

    public void eredmenyTabla(String fajlnev) {
        try {
//            Scanner scanner = new Scanner(new File("eredmeny.csv"));
            PrintStream printStream = new PrintStream(fajlnev);

//            File file = new File("eredmeny.csv");
//            java.io.FileWriter fileWriter = new java.io.FileWriter(file);
            printStream.println("ElsoCsapat;MasodikCsapat;GyoztesCsapat");
            for (Meccs meccs : meccsek) {
                printStream.println(meccs.gyoztes());
            }
//            fileWriter.close();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
