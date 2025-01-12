public class Main {
    public static void main(String[] args) {
       /* Fogkefe f = new Fogkefe("Zold",500);
        f.allapot = 50;
        System.out.println(f.toString());

        f.fogmosas(1);
        System.out.println(f.toString());*/





        /*Suto uj = new Suto(100,"uj");
        Suto2 regi = new Suto2(100, "regi");

        System.out.println(uj.elomelegitesiIdo(500));
        System.out.println(regi.elomelegitesiIdo(500));*/

        /*ElektromosSuto2 uj = new ElektromosSuto2("asd", "asd");
        ElektromosSuto regi = new ElektromosSuto("asd", "asd");

        System.out.println(uj.elomelegitesiIdo(100));
        System.out.println(regi.elomelegitesiIdo(100));*/

        Trolibusz t = new Trolibusz("Solaris", 5, 200, true);
        Vezetofulke v = new Vezetofulke("kaga", 200);
        t.vezetofulkeHozzadasa(v);
        System.out.println(t.toString() + t.getVezetofulke().getFelszereltseg());
    }
}