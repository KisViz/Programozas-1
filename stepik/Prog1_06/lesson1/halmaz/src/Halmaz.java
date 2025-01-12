import java.util.HashSet;
import java.util.Set;

public class Halmaz {

    public static Set<Integer> feltolt(int... szamok) {
        Set<Integer> uj = new HashSet<>();
        for (int elem : szamok) {
            uj.add(elem);
        }
        return uj;
    }

    public static Set<Integer> unio(Set<Integer> a, Set<Integer> b) {
        Set<Integer> uj = new HashSet<>();
        for (int elem: a) {
            uj.add(elem);
        }
        for (Integer elem: b) {
            uj.add(elem);
        }
        return uj;
    }

    public static Set<Integer> metszet(Set<Integer> a, Set<Integer> b) {
        Set<Integer> uj = new HashSet<>();
        for (Integer elem: a) {
            if (b.contains(elem)) {
                uj.add(elem);
            }
        }
        return uj;
    }

    public static Set<Integer> kulonbseg(Set<Integer> a, Set<Integer> b) {
        Set<Integer> uj = new HashSet<>();
        for (int elem : a) {
            if (!b.contains(elem)) {
                uj.add(elem);
            }
        }
        return uj;
    }

}