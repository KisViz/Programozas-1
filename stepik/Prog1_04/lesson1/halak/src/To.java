public class To {
    private String nev;
    private double meret;
    private Hal[] halak;

    public To(String nev, double meret, int halszam) {
        this.nev = nev;
        this.meret = meret;
        this.halak = new Hal[halszam];
    }


    public To(To masik) {
        this.nev = masik.nev;
        this.meret = masik.meret;

        this.halak = new Hal[masik.halak.length];
        for (int i = 0; i < halak.length; i++) {
            Hal regi = masik.halak[i];
            if (regi != null) {
                halak[i] = new Hal(regi.getFajta(), regi.getSzin(), regi.getMeret(), regi.getKor());
            }
        }
    }
}
