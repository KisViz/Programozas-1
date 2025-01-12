import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void ososztaly() {
        int fieldCount = Medve.class.getDeclaredFields().length;
        int methodCount = Medve.class.getDeclaredMethods().length;
        int constructorCount = Medve.class.getConstructors().length;

        assertEquals("az ososztaly modositva lett", 1, fieldCount);
        assertEquals("az ososztaly modositva lett", 1, methodCount);
        assertEquals("az ososztaly modositva lett", 1, constructorCount);
    }

    @Test
    public void jegesmedve() {
        Jegesmedve k1 = new Jegesmedve();
        assertEquals("jegesmedve hibas", "feher", k1.getSzin());
    }

    @Test
    public void barnamedve() {
        Barnamedve k2 = new Barnamedve();
        assertEquals("barnamedve hibas", "barna", k2.getSzin());
    }

    @Test
    public void medve() {
        Medve k3 = new Medve("sarga");
        assertEquals("medve hibas", "sarga", k3.getSzin());
    }
}