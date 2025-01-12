package hu.sed.kutyapark;

//2. feladat
/* Saját kivételosztály esetén mivel a feladat RuntimeExceptiont kért, így abból fogunk öröklödni.
*  A megvalósított konstruktorunk paraméterben vár egy Stringet,majd a super segítségével állítja be az üzenetet. */
public class NemLehetNulla extends RuntimeException{
    public NemLehetNulla(String msg){
        super(msg);
    }
}
