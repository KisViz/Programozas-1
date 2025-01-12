import java.util.HashMap;
import java.util.Map;

public class Allapot {
    private boolean vegallapot;
    private Map<Character, Allapot> atmenetek = new HashMap<>();

    public Allapot(boolean vegallapot) {
        this.vegallapot = vegallapot;
    }

    public boolean isVegallapot() {
        return vegallapot;
    }

    public Map<Character, Allapot> getAtmenetek() {
        return atmenetek;
    }
}
