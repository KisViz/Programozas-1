public abstract class Kavefozo {
    private final int kapacitas;

    protected Kavefozo(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public int adag(int cseszeMeret) {
        return (int) this.kapacitas / cseszeMeret;
    }

    public abstract boolean kavefozes();
    public abstract double ido();
}
