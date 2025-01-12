// megoldas

import java.util.Scanner;

public class Eletkor {
    public static void main(String[] args) {
        System.out.println("Add meg az eletkorodat!");

        Scanner scanner = new Scanner(System.in);
        int kor = scanner.nextInt();

        System.out.println(kor + " eves vagy.");
    }
}