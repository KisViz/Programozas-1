import java.util.Objects;

public class CserelhetoFejuCsavarhuzo extends Csavarhuzo{
    private final int fejMeret;
    private boolean egyhornyuFej = true;
    private boolean phillipsFej = true;
    private boolean imbuszFej = true;

    public CserelhetoFejuCsavarhuzo(int meret, int fejMeret, Csavarfej fej) {
        super(meret, fej);
        this.fejMeret = fejMeret;
    }

    @Override
    public int getMeret() {
        return super.getMeret() - this.fejMeret;
    }

    public void fejElhagy(String melyik) {
        if (melyik.equalsIgnoreCase("EGYHORNYU")) { //valami nem jo
            this.egyhornyuFej = false;
        } else if (melyik.equalsIgnoreCase( "PHILLIPS")) {
            this.phillipsFej = false;
        } else if (melyik.equalsIgnoreCase( "IMBUSZ")) {
            this.imbuszFej = false;
        }
    }

    public boolean fejCsere (String melyikre) {
        if (melyikre.equalsIgnoreCase(getCsavarfej().name())) {
            return false;
        } else if (melyikre.equalsIgnoreCase("EGYHORNYU") && !egyhornyuFej) {
            return false;
        } else if (melyikre.equalsIgnoreCase("PHILLIPS") && !phillipsFej) {
            return false;
        } else if (melyikre.equalsIgnoreCase("IMBUSZ") && !imbuszFej) {
            return false;
        } else if (melyikre.equalsIgnoreCase("EGYHORNYU") && egyhornyuFej) {
            this.csavarfej = Csavarfej.EGYHORNYU;
            return true;
        } else if (melyikre.equalsIgnoreCase("PHILLIPS") && phillipsFej) {
            this.csavarfej = Csavarfej.PHILLIPS;
            return true;
        } else {
            this.csavarfej = Csavarfej.IMBUSZ;
            return true;
        }


    }
}
