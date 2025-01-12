public class Zaszlo {
    public static boolean torpezaszlo(String szinek) {
        if (szinek == null) {
            return false;
        }
        return szinek.length() == 10 ? true : false;
    }
}