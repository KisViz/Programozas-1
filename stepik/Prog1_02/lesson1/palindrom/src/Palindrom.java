import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;
        kulso: while (true) {
            line = sc.nextLine();
            if (line.length() == 0) {
                break;
            }

            for (int i = 0; i < line.length() / 2; i++) {
                if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                    System.out.println("nem");
                    continue kulso;
                }
            }

            System.out.println("igen");
        }

    }

    // megoldas

}