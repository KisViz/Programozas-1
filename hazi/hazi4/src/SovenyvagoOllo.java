public class SovenyvagoOllo {
    private double elesseg;

    public SovenyvagoOllo() {
        this.elesseg = 100.0;
    }

    public double getElesseg() {
        return elesseg;
    }

    public void elez () {
        this.elesseg += 15;

        if (this.elesseg > 100) {
            this.elesseg = 100;
        }
    }

    public boolean vag (double suruseg) {
        if (suruseg > this.elesseg) {
            return false;
        }

        this.elesseg -= suruseg;

        return true;
    }
}
