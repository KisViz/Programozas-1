public class Pokemon {
    private String nev;
    private String allapot;

    public Pokemon(String nev, String allapot) {
        this.nev = nev;
        this.allapot = allapot;
        System.out.println("EGY POKEMON LETREJOTT");
    }

    public Pokemon(String nev) {
        this(nev,"szabad");
    }

    // megoldas
}