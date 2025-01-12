public class Beka {
    private String szin;
    private static int num;

    public Beka(String szin) {
        this.szin = szin;
        num++;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return "BEKA:" + szin;
    }
}
