import java.util.*;

public class SzigetHasonlitas {
    /**
     * A metódus felelős a kincses szigetek sorba rendezésért.
     * @param szigetek a rendezni kívánt szigetek listája
     * @return a rendezett kincses szigetek sorozata
     */
/*    public static Collection<KincsesSziget> rendez(List<KincsesSziget> szigetek) { //ha listben kapod
        Collections.sort(szigetek);
        return szigetek;
    }*/

    public static Collection<KincsesSziget> rendez(KincsesSziget[] szigetek) { //ha tömbben kapod listává kell alakítanod
        List<KincsesSziget> sz = new ArrayList<>();

        /*for (int i = 0; i < szigetek.length; i++) {
            sz.add(szigetek[i]);
        }*/

        sz.addAll(Arrays.asList(szigetek));

        Collections.sort(sz);
        return sz;
    }


    /**
     * A metódus felelős, az összes olyan kincses sziget törlésért,
     * ami nem éri el ezen kincsHatar-t.
     * @param szigetek a kincses szigetek listája
     * @param kincsHatar a kincs összeg legalsó határa
     */
    public static void szigetekTorlese(List<KincsesSziget> szigetek, int kincsHatar) {
        szigetek.removeIf(sziget -> sziget.getKincsOsszeg() < kincsHatar);
    }
    //hajráá <3


}