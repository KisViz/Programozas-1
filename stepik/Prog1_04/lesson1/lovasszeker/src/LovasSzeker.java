public class LovasSzeker extends Jarmu {

    @Override
    public void halad(int mennyiseg) {
        if (mennyiseg < 5){
            super.halad(mennyiseg);
        } else {
            super.halad(-1);
        }
    }
}
