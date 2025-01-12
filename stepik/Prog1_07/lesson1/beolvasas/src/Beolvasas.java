import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Beolvasas {

    public static int beolvas(String file, int mennyiseg) {
        int osszeg = 0;
        Scanner sc = new Scanner(new File(file));
        for (int i = 0; i < mennyiseg; i++) {
            osszeg += sc.nextInt();
        }

        return osszeg;
    }

}