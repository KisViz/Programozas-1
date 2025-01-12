import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String szoveg = "Ez egy nagyon hosszú és szép szöveg:)";
        String[] darabok = szoveg.split(" ");

        for (String elem : darabok) {
            System.out.println(elem);
        }

        /**-------------------------------------------------------------------------*/
        System.out.println("-------------------------------------------------------------------------");

        String bekaString = "Breki;15"; //ilyenek vannak a bekak.txt-ben
        darabok = bekaString.split(";");
        Beka breki = new Beka(darabok[0], Integer.parseInt(darabok[1]));

        /**-------------------------------------------------------------------------*/

        List<Beka> bekaList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("bekak.txt"))) {
            while(scanner.hasNextLine()) {
                bekaString = scanner.nextLine();
                darabok = bekaString.split(";");
                bekaList.add(new Beka(darabok[0], Integer.parseInt(darabok[1])));
            }
        } catch (IOException e) {
            System.err.println("Hiba történt: " + e.getMessage());
        }

        bekaList.forEach(beka -> System.out.println(beka));

        System.out.println("-------------------------------------------------------------------------");

        bekaList.removeIf(beka -> beka.getUgrasiMagassag() < 50); //ezt tanuld meg, mert 4 kötőjel 5 pontot lehet vele szerezni!!!!
        bekaList.forEach(beka -> System.out.println(beka));


    }
}