import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Tests {

    @Test
    public void teszt() {
        Karakter k = new Karakter();
        k.setSebzes(7);
        assertEquals("sebzes hibas", 7, k.getSebzes());

        k.setEletero(5);
        assertEquals("eletero hibas", 5, k.getEletero());

        k.setRegeneracio(342);
        assertEquals("regeneracio hibas", 342, k.getRegeneracio());

        k.setKiteres(5);
        assertEquals("kiteres hibas", 5, k.getKiteres());

        k.setLogisztika(8);
        assertEquals("logisztika hibas", 8, k.getLogisztika());

        k.setSpecTamadas(2);
        assertEquals("specTamadas hibas", 2, k.getSpecTamadas());

        k.setSpecGyogyitas(7);
        assertEquals("specGyogyitas hibas", 7, k.getSpecGyogyitas());

        k.setSpecEpites(200);
        assertEquals("specEpites hibas", 200, k.getSpecEpites());

        k.setKritikusTalalat(7.5);
        assertEquals("kritikus talalat hibas", 7.5, k.getKritikusTalalat(), 0.0001);

        k.setRegeneracioEselye(7.7);
        assertEquals("regeneracio eselye hibas", 7.7, k.getRegeneracioEselye(), 0.0001);

        k.setKiteresEselye(1.1);
        assertEquals("kiteres eselye hibas", 1.1, k.getKiteresEselye(), 0.0001);

        k.setKivedes(7);
        assertEquals("kivedes hibas", 7, k.getKivedes());

        k.setBossXp(100);
        assertEquals("bossXp hibas", 100, k.getBossXp());

        k.setKlanXp(75);
        assertEquals("klanXp hibas", 75, k.getKlanXp());

        k.setTargyTalalasiEsely(33);
        assertEquals("targytalalasiEsely hibas", 33, k.getTargyTalalasiEsely());

        k.setTamadasKozottiIdo(220.2);
        assertEquals("tamadasokKozottiIdo hibas", 220.2, k.getTamadasKozottiIdo(), 0.0001);

        k.setTamadoZseton(7);
        assertEquals("tamadoZseton hibas", 7, k.getTamadoZseton());

        k.setGyogyitoZseton(44);
        assertEquals("gyogyitoZseton hibas", 44, k.getGyogyitoZseton());

        k.setEpitoZseton(633);
        assertEquals("epitoZseton hibas", 633, k.getEpitoZseton());

        Achievement[] achs = { new Achievement(), new Achievement() };
        k.setAchievements(achs);
        assertSame("achievements hibas", achs, k.getAchievements());

        Item[] items1 = { new Item(), new Item() };
        k.setAktivTargyak(items1);
        assertSame("aktivTargyak hibas", items1, k.getAktivTargyak());

        Item[] items2 = {};
        k.setInaktivTargyak(items2);
        assertSame("inaktivTargyak hibas", items2, k.getInaktivTargyak());

        k.setLeiras("asdasd");
        assertEquals("leiras hibas", "asdasd", k.getLeiras());

        k.setNev("aaa");
        assertEquals("nev hibas", "aaa", k.getNev());

        k.setJelszo("kiscica123");
        assertEquals("jelszo hibas", "kiscica123", k.getJelszo());

        Clan klan = new Clan();
        k.setKlan(klan);
        assertEquals("klan hibas", klan, k.getKlan());

        k.setHelyezes(66662);
        assertEquals("helyezes hibas", 66662, k.getHelyezes());

        k.setSzint(3);
        assertEquals("szint hibas", 3, k.getSzint());

        k.setArany(5322);
        assertEquals("arany hibas", 5322, k.getArany());

        k.setTulajdonsagpontok(5034);
        assertEquals("tulajdonsagpontok hibas", 5034, k.getTulajdonsagpontok());

        k.setTudaspontok(8);
        assertEquals("tudaspontok hibas", 8, k.getTudaspontok());
    }
}