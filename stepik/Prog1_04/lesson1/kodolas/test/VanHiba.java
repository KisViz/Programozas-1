import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class VanHiba {
    @Test
    public void teszt_01() {
        Random random = new Random();
        String eredeti = "1100";
        String kodolt = Titok.kodolas(eredeti);

        int pozicio = random.nextInt(kodolt.length());
        kodolt = kodolt.substring(0, pozicio) + (kodolt.charAt(pozicio) == '1' ? '0' : '1') + kodolt.substring(pozicio + 1);

        String dekodolt = Titok.dekodolas(kodolt);
        assertEquals("Hibas eredmeny", eredeti, dekodolt);
    }

    @Test
    public void teszt_02() {
        Random random = new Random();

        String eredeti = "111100010101";
        String kodolt = Titok.kodolas(eredeti);

        int pozicio = random.nextInt(kodolt.length());
        kodolt = kodolt.substring(0, pozicio) + (kodolt.charAt(pozicio) == '1' ? '0' : '1') + kodolt.substring(pozicio + 1);

        String dekodolt = Titok.dekodolas(kodolt);
        assertEquals("Hibas eredmeny", eredeti, dekodolt);
    }

    @Test
    public void teszt_03() {
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();

            StringBuilder eredeti = new StringBuilder();
            int hossz = random.nextInt(250) + 1;
            for (int j = 0; j < hossz; j++) {
                eredeti.append((random.nextBoolean()) ? '1' : '0');
            }

            String kodolt = Titok.kodolas(eredeti.toString());

            int pozicio = random.nextInt(kodolt.length());
            kodolt = kodolt.substring(0, pozicio) + (kodolt.charAt(pozicio) == '1' ? '0' : '1') + kodolt.substring(pozicio + 1);

            String dekodolt = Titok.dekodolas(kodolt);
            assertEquals("Hibas eredmeny", eredeti.toString(), dekodolt);
        }
    }
}