public abstract class Kavefozo2 {
    private final int kapacitas;

    public Kavefozo2(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public int adag(int cseszeMeret) {
        return kapacitas / cseszeMeret;
    }

    public abstract boolean kavefozes();
    public abstract double ido();

    public int getKapacitas() {
        return kapacitas;
    }
}
