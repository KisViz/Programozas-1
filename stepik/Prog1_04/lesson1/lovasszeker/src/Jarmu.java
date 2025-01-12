public class Jarmu {
    private int pozicio = 0;

    public void halad(int mennyiseg) {
        pozicio += mennyiseg;
    }

    public int getPozicio() {
        return pozicio;
    }
}