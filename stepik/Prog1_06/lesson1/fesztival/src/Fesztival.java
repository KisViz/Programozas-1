import java.util.ArrayList;
import java.util.List;

public class Fesztival {
    public List<Ember> emberek = new ArrayList<>();

    public void belepes(Ember e) {
        emberek.add(e);
    }

    public void belepes(List<Ember> e) {
        emberek.addAll(e);
    }

    public void kidobas() {
        emberek.removeIf(e -> e.eletkor < 65);
    }

}