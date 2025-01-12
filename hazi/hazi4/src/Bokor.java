public class Bokor {
    private String fajta;
    private int forma;
    private double suruseg;

    public Bokor(String fajta, double suruseg) {
        this.fajta = fajta;
        if (suruseg <= 0.0) {
            this.suruseg = 0.0;
        } else if (suruseg >= 100.0) {
            this.suruseg = 100.0;
        } else {
            this.suruseg = suruseg;
        }
    }

    public String forma () {
        if (this.forma == 0) {
            return "cserje";
        } else if (this.forma == 1) {
            return "bokor";
        } else if (this.forma == 2) {
            return "formara nyirt";
        } else if(this.forma == 3){
            return "kisse elburjanzott";
        } else {
            return "teljesen elburjanzott";
        }
    }

    public void setForma(int ujForma) {
        if (ujForma >=0 && ujForma<= 4) {
            this.forma = ujForma;
        }
    }

    public void setSuruseg(double ujSuruseg) {
        if (ujSuruseg > 100.0) {
            this.suruseg = 100.0;
        } else if (ujSuruseg < 0.0) {
            this.suruseg = 0.0;
        } else {
            this.suruseg = ujSuruseg;
        }
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public double getSuruseg() {
        return suruseg;
    }

    public String getFajta() {
        return fajta;
    }

    public void nyiras (SovenyvagoOllo ollo) {
        if (ollo.vag(this.suruseg)) {
            setForma(2);
        }
    }

    public void novekedes () {
        if (this.forma < 4) {
            this.forma++;
        }
    }
}
