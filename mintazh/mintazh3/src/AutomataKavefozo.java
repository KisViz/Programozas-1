public class AutomataKavefozo extends Kavefozo{
    private int fokozat;

    protected AutomataKavefozo(int kapacitas, int fokozat) {
        super(Math.max(100,kapacitas));
        if (fokozat < 1) {
            this.fokozat = 1;
        } else if (fokozat > 3) {
            this.fokozat = 3;
        } else {
            this.fokozat = fokozat;
        }
    }

    @Override
    public boolean kavefozes() {
        return ido() < 3;
    }

    @Override
    public double ido() {
        if (this.fokozat == 1) {
            return (double) (adag(50) * 30) / 60;
        }
        if (this.fokozat == 2) {
            return (adag(50) * 30 * 0.5) / 60;
        }
        else {
            return (adag(50) * 30 * 0.25) / 60;
        }
    }

    public int getFokozat() {
        return fokozat;
    }

    public void setFokozat(int fokozat) {
        if (fokozat < 1) {
            this.fokozat = 1;
        } else if (fokozat > 3) {
            this.fokozat = 3;
        } else {
            this.fokozat = fokozat;
        }
    }
}
