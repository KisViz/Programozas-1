public class Csavarhuzo2 {
    protected Csavarfej2 csavarfej;
    private int meret;

    public Csavarhuzo2(int meret, Csavarfej2 csavarfej) {
        this.csavarfej = csavarfej;
        this.meret = meret;
    }

    public Csavarfej2 getCsavarfej() {
        return csavarfej;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    @Override
    public String toString() {
        if (csavarfej == Csavarfej2.EGYHORNYU){
            return "hagyomanyos feju csavarhuzo";
        }

        if (csavarfej == Csavarfej2.PHILLIPS) {
            return "csillagfeju csavarhuzo";
        }

        else {
            return  "imbuszfeju csavarhuzo";
        }
    }


}
