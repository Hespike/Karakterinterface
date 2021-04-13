public interface Karakter{
    boolean tamad(Karakter k);
    boolean tamad(Epulet e);
    void tamad(KornyezetiElem ke);
    boolean epites(Epulet e);
    void sebzestElszenved(int m);
    void fejlodik();
    int gyogyit(Karakter k, int m);
    int pusztitas(Karakter[] k);
    Karakter[] ellensegek();
}
