public class VideoMagno {
    public static void lejatszas(BesorolassalRendelkezo lejatszando, int maxEletkor){
        if (lejatszando.getKorhatarBesorolas() > maxEletkor) {
            System.out.println("Sajnalom, de a korhatar miatt ezt nem jatszhatom le.");
        } else if (lejatszando instanceof Sorozat && lejatszando.getKorhatarBesorolas() <= maxEletkor) {
            System.out.println("Lejatszasra kerult a(z) " + ((Sorozat) lejatszando).nev + " cimu sorozat.");
        } else if (lejatszando instanceof Zeneszam &&lejatszando.getKorhatarBesorolas() <= maxEletkor) {
            System.out.println("Meghallgattuk a kovetkezo szamot: " + ((Zeneszam) lejatszando).getEloado() + " - " + ((Zeneszam) lejatszando).getSzamCim());
        }
    }
}
