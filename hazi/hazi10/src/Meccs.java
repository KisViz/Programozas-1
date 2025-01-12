public class Meccs {
    private Csapat elsoCsapat;
    private Csapat masodikCsapat;

    public Meccs(Csapat elsoCsapat, Csapat masodikCsapat) {
        this.elsoCsapat = elsoCsapat;
        this.masodikCsapat = masodikCsapat;
    }

    public Csapat getElsoCsapat() {
        return elsoCsapat;
    }

    public Csapat getMasodikCsapat() {
        return masodikCsapat;
    }

    public Csapat gyoztes() {
        if (masodikCsapat.atlag("magassag") > elsoCsapat.atlag("magassag")) {
            return masodikCsapat;
        }
        if (masodikCsapat.atlag("magassag") == elsoCsapat.atlag("magassag")) {
            if (masodikCsapat.atlag("suly") < elsoCsapat.atlag("suly")) {
                return masodikCsapat;
            }
        }

        return elsoCsapat;
    }
}
