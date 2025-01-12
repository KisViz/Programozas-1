public interface Karakter {
    boolean tamad(Karakter k);
    boolean tamad(Epulet e);
    void tamad(KornyezetiElem k);
    boolean epites(Epulet e);
    void sebzestElszenved(int t);
    void fejlodik();
    int gyogyit(Karakter kar, int szam);
    int pusztitas(Karakter[] t);
    Karakter[] ellensegek();
}