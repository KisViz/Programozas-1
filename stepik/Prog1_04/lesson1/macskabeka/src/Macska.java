public class Macska {
    private String nev;
    private int eletkor;
    private static int num;

    public Macska(String nev, int eletkor) {
        num++;
        this.nev = nev;
        this.eletkor = eletkor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    @Override
    public String toString() {
        return "MACSKA:" + nev + eletkor;
    }
}
