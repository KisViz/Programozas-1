package hu.sed.kutyapark;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. feladat
public class Kutya {
    private final String fajta;
    private int treningSzint; // 0-100 kozotti egesz
    private int nepszeruseg = 0;

    //1. feladat
    public Kutya(String fajta) {
        this.fajta = fajta;
        this.treningSzint = 50;
    }

    //2. feladat
    public void trening(int orak) {
        if (orak < 0) {
            throw new NemLehetNulla("Nem lehet 0");
            //kicserélés előtt még az alap RuntimeExceptiont kellene dobnunk
            //throw new RuntimeException("Nem lehet 0");
        }
        treningSzint += orak;
        if (treningSzint > 100) {
            treningSzint = 100;
        }
        //a 21-24 sorok egyszerűbb megoldása:  treningSzint = Math.min(100, treningSzint+orak);
    }

    //3. feladat
    public void jatekAParkban(int mennyiEmber, int mennyiKutya) {
        this.nepszeruseg += mennyiKutya;
        this.nepszeruseg += mennyiEmber * 2;
    }


    //4. feladat
    public String getFajta() {
        return fajta;
    }
    public int getTreningSzint() {
        return treningSzint;
    }
    public int getNepszeruseg() {
        return nepszeruseg;
    }

    //5. feladat
    public List<Kutya> beolvas() {
        //kutyak lista létrehozása, ebbe fogunk olvasni ezt fogjuk visszaadni
        List<Kutya> kutyak = new ArrayList<>();
        //try-with-resources esetén nem kell a fájt külön lezárni, a Scannert írjuk a try zárójelébe
        try(Scanner f = new Scanner(new File("kutyak.csv"))){
            //addig olvasunk amíg van sorunk
            while(f.hasNextLine()){
                //beolvasunk egy sort
                String sor = f.nextLine();
                //feldaraboljuk ; mentén
                String[] temp = sor.split(";");
                //ezután pedig a | karakter mentén, mivel ez a karakter mást is jelenthet (vagy) így érdemes \\-jelet tenni elé a split során
                String[] temp2 = temp[1].split("\\|");
                //létrehozunk egy új kutyát, a fajtával
                Kutya kutya = new Kutya(temp[0]);
                //átalakítjuk a beolvasott számunkat (jelenleg még string) integerré
                kutya.treningSzint = Integer.parseInt(temp2[0]);
                kutya.nepszeruseg = Integer.parseInt(temp2[1]);
                //hozzáadjuk a kutyak listához
                kutyak.add(kutya);
            }
            //elkapjuk az esetleges kivételeket
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //visszaadjuk a kutyak listánkat
        return kutyak;
    }

}
