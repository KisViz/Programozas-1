import java.util.Scanner;

public class Osszeg {
    // megoldas
    public static void main(String[] args) {
        int osszeg = 0;
        Scanner beolvas = new Scanner(System.in);
        while (true) {
            int beolvasott = -2;

            beolvasott = beolvas.nextInt();

            if (beolvasott == -1) {
                break;
            }
            osszeg += beolvasott;
        }

        System.out.println("A pontszamok osszege: " + osszeg);
    }
}