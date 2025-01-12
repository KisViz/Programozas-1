import java.time.LocalDateTime;
public class Bokor {
    protected int meret;
    protected LocalDateTime ultetesiIdopont;
    protected boolean kipusztult;

    public Bokor(int meret) {
        this.meret = meret;
        this.ultetesiIdopont = null;
        this.kipusztult = false;
    }

    public int getMeret() {
        return meret;
    }

    public LocalDateTime getUltetesiIdopont() {
        return ultetesiIdopont;
    }

    public boolean isKipusztult() {
        return kipusztult;
    }

    public void kipusztul () {
        this.kipusztult = true;
    }

    public void elultet () {
        if (this.ultetesiIdopont == null) {
            this.ultetesiIdopont = LocalDateTime.now();
        }
    }
}