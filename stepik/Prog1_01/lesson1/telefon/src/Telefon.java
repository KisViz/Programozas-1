public class Telefon {

    static int eladas (int hard, int soft, int elad) {
        int nyereseg = elad - hard;

        if (nyereseg <= 0) {
            return -1;
        }

        return (soft / nyereseg) + 1;
    }

}