import java.util.Arrays;

public class Sorozat extends TVMusor{
    private int korhatarBesorolas;

    public Sorozat(String nev, double hossz, int... korhatarBesorolas) {
        super(nev, hossz);

        int max = korhatarBesorolas[0];
        for (int i = 0; i < korhatarBesorolas.length; i++) {
            max = Math.max(max,korhatarBesorolas[i]);
        }
        this.korhatarBesorolas = max;
    }

    @Override
    public int getKorhatarBesorolas() {
        return korhatarBesorolas;
    }
}
