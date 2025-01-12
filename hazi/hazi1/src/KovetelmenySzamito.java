public class KovetelmenySzamito {
    public static String teljesites(double doga1, double doga2, double doga3, double doga4, double zh, int haziDb) {

        if (haziDb < 1) { //kevesebb, mint 1 hf -> buko
            return "sikertelen";
        }

        double osszpont = doga1 + doga2 + doga3 + doga4 + zh; //pontok osszeszamolasa es kerekitese

        if (Math.round(osszpont) < 50) { //50 alatt buko
            return "sikertelen";
        } else {
            return "sikeres";
        }

    }
}