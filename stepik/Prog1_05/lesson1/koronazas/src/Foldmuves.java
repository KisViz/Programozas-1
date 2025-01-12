public class Foldmuves extends Ember implements Allatkereskedo{
    private int muvelendoFoldterulet;

    public Foldmuves(String nev, int kor, int vagyon, boolean ferfi, int muvelendoFoldterulet) {
        super(nev, kor, vagyon, ferfi);
        this.muvelendoFoldterulet = muvelendoFoldterulet;
    }

    @Override
    public boolean eszik(Etel etel) {
        this.beteg = !(etel.getMinoseg() > (double) this.kor / 100);
        return etel.getMinoseg() > (double) this.kor /100;
    }

    @Override
    public void kereskedik() {
        this.vagyon++;
    }


}