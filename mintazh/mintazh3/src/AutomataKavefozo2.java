public class AutomataKavefozo2 extends Kavefozo2{
    private int fokozat;

    public AutomataKavefozo2(int kapacitas, int fokozat) {
        super(Math.max(100, kapacitas));
        if (fokozat > 3) {
            this.fokozat = 3;
        } else if (fokozat < 1) {
            this.fokozat = 1;
        } else {
            this.fokozat = fokozat;
        }
    }


    @Override
    public boolean kavefozes() {
        return false;
    }

    @Override
    public double ido() {
        return 0;
    }
}
