import java.util.Objects;

public class CserelhetoFejuCsavarhuzo2 extends Csavarhuzo2{
    private boolean egyhornyuFej = true;
    private boolean phillipsFej = true;
    private boolean imbuszFej = true;
    private final int fejMeret;


    public CserelhetoFejuCsavarhuzo2(int meret, int fejMeret, Csavarfej2 csavarfej) {
        super(meret, csavarfej);
        this.fejMeret = fejMeret;
    }

    public void fejElhagy(String melyik) {
        /*if (Objects.equals(melyik, csavarfej.name())) {
            this.egyhornyuFej = false;
        }*/

        if (melyik.equalsIgnoreCase("EGYHORNYU")) {
            this.egyhornyuFej = false;
        } else if (melyik.equalsIgnoreCase( "PHILLIPS")) {
            this.phillipsFej = false;
        } else if (melyik.equalsIgnoreCase( "IMBUSZ")) {
            this.imbuszFej = false;
        }
    }


}
