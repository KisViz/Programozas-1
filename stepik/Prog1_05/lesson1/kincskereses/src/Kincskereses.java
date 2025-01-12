public class Kincskereses {
    public int keres(Targy[] tomb) {
        int szal = 0;
        for (Targy t : tomb) {
            if (t instanceof Ekszer) {
                szal++;
            }
        }
        return szal;
    }
}