public class Felvonulas {

    public static int szavazas(String[] szavazatok) {
        int ossz = 0;
        for (int i = 0; i < szavazatok.length; i++) {
            if ("lovasszeker".equals(szavazatok[i])) {
                ossz++;
            }
        }
        return ossz;
    }

}
