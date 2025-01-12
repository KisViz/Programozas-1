import java.util.Random;

public class RandomNamer implements Namer {
    private int length;
    private java.util.Random rnd;
    private final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";

    public RandomNamer(java.util.Random rnd, int length) {
        this.length = length;
        this.rnd = rnd;
    }


    @Override
    public void rename(FileSystemEntry adat) {
        StringBuilder nev = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            nev.append(ALPHABET.charAt(rnd.nextInt(ALPHABET.length())));
        }
        adat.setName(nev.toString());
    }
}
