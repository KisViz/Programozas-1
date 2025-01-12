public class Pilota {
    String nev;
    int eletkor;
    double tapasztalat;









    boolean vezet(int mennyiseg) {
        return tapasztalat > mennyiseg / 2.0;
    }

    void fejlodik() {
        tapasztalat = tapasztalat * 1.1;
    }

    void oregszik() {
        eletkor++;
    }
}