public class KotyogosKavefozo extends Kavefozo{

    private int gazFokozat;

    protected KotyogosKavefozo(int kapacitas, int gazFokozat) {
        super(Math.min(500,Math.max(0, kapacitas)));
        if (gazFokozat < 1) {
            this.gazFokozat = 1;
        } else if (gazFokozat > 5) {
            this.gazFokozat = 5;
        } else {
            this.gazFokozat = gazFokozat;
        }
    }

    @Override
    public boolean kavefozes() {
        return ido() < 4;
    }

    @Override
    public double ido() {
        if (this.gazFokozat == 1) {
            return (double) (adag(40) * 80) / 60;
        }
        if (this.gazFokozat == 2) {
            return (adag(40) * 80 * 0.8) / 60;
        }
        if (this.gazFokozat == 3) {
            return (adag(40) * 80 * 0.6) / 60;
        }
        if (this.gazFokozat == 4) {
            return (adag(40) * 80 * 0.4) / 60;
        }
        else {
            return (adag(40) * 80 * 0.2) / 60;

        }
    }

    public int getGazFokozat() {
        return gazFokozat;
    }

    public void setGazFokozat(int gazFokozat) {
        if (gazFokozat < 1) {
            this.gazFokozat = 1;
        } else if (gazFokozat > 5) {
            this.gazFokozat = 5;
        } else {
            this.gazFokozat = gazFokozat;
        }
    }
}
