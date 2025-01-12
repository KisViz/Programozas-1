public class Csavarhuzo {
    private int meret;
    protected Csavarfej csavarfej;

    public Csavarhuzo(int meret, Csavarfej fej) {
        this.meret = meret;
        this.csavarfej = fej;
    }

    public int getMeret() {
        return meret;
    }

    public Csavarfej getCsavarfej() {
        return csavarfej;
    }

    public void setMeret(int ujMeret) {
        this.meret = ujMeret;
    }

    @Override
    public String toString() {
        if ("EGYHORNYU".equalsIgnoreCase(this.csavarfej.name())) {
            return  "hagyomanyos feju csavarhuzo";
        } else if ("PHILLIPS".equalsIgnoreCase(this.csavarfej.name())) {
            return "csillagfeju csavarhuzo";
        } else {
            return "imbuszfeju csavarhuzo";
        }
    }
}
