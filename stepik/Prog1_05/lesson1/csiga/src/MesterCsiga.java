public class MesterCsiga extends Csiga implements AjtoSzerelo{
    private int szakmaiKepesseg;

    public MesterCsiga(int meret, boolean hazas, int szakmaiKepesseg) {
        super(meret, hazas);
        this.szakmaiKepesseg = szakmaiKepesseg;
    }


    @Override
    public boolean ajtotSzerel(AjtoSzerelo[] tomb) {
        return tomb.length>2;
    }
}