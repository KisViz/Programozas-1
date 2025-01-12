import java.util.Set;

public class Legnagyobb {

    public int legnagyobb(Set<Integer> szamok) {

        int szam = Integer.MIN_VALUE;

        for (Integer i : szamok) {
            if (i > szam) {
                szam = i;
            }
        }

        return szam;
    }

}