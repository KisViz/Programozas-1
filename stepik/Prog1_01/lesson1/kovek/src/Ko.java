public class Ko {
    public static int kovek(int[] osszegyujtottKovek, int jelenlegiKovek) {
        int ossz= 0;
        for (int i = 0; i < osszegyujtottKovek.length; i++) {
            ossz += osszegyujtottKovek[i];
        }
        return ossz - jelenlegiKovek;
    }
}