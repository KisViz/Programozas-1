public class Pokemon {
    protected String nev;
    protected int kor;

    public Pokemon(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }
}