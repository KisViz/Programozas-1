import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Utkozesek {
    static class Golyo {
        int meret;
        int tomeg;
        int sebessegX;
        int sebessegY;
        int pozicioX;
        int pozicioY;

        public Golyo(int meret, int tomeg, int sebessegX, int sebessegY, int pozicioX, int pozicioY) {
            this.meret = meret;
            this.tomeg = tomeg;
            this.sebessegX = sebessegX;
            this.sebessegY = sebessegY;
            this.pozicioX = pozicioX;
            this.pozicioY = pozicioY;
        }
    }

    public Map<Integer, Map<String, Golyo>> golyok;
    public int meretX;
    public int meretY;

    public Utkozesek(Map<Integer, Map<String, Golyo>> golyok, int meretX, int meretY) {
        this.golyok = golyok;
        this.meretX = meretX;
        this.meretY = meretY;
    }

    public Golyo utkozesek() {
        return null;
    }

}