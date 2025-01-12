import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        Kor kor1 = new Kor(5);
        assertEquals("konstruktorban helyes ertek megadva - hibas eredmeny", 5, kor1.getAtmero());
        kor1.setAtmero(8);
        assertEquals("setterben helyes ertek megadva - hibas eredmeny", 8, kor1.getAtmero());
    }

    @Test
    public void teszt_02() {
        Kor kor2 = new Kor(-2);
        assertEquals("konstruktorban helyes ertek megadva - hibas eredmeny", 1, kor2.getAtmero());
        kor2.setAtmero(7);
        kor2.setAtmero(-5);
        assertEquals("setterben helyes ertek megadva - hibas eredmeny", 1, kor2.getAtmero());
    }

    @Test
    public void teszt_03() {
        Kor kor3 = new Kor(0);
        assertEquals("konstruktorban helyes ertek megadva - hibas eredmeny", 1, kor3.getAtmero());
        kor3.setAtmero(8);
        kor3.setAtmero(0);
        assertEquals("setterben helyes ertek megadva - hibas eredmeny", 1, kor3.getAtmero());
    }
}