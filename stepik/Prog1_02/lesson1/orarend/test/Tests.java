import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        String s = Orarend.oracsere("Marika Peter Gabor Andras Mark Peter Peter Jozsi Marika Marika Jozsi Jozsi", "Bence");
        assertEquals("Hibas eredmeny", "Marika Peter Gabor Andras Mark Peter Peter Bence Marika Marika Bence Bence", s);
    }

    @Test
    public void teszt_02() {
        String s = Orarend.oracsere("Marika Peter Gabor Andras Mark Peter Peter Bence Marika Marika", "Otto");
        assertEquals("Hibas eredmeny", "Marika Peter Gabor Andras Mark Peter Peter Bence Marika Marika", s);
    }

    @Test
    public void teszt_03() {
        String s = Orarend.oracsere("Jozsi Jozsi Jozsi Jozsi Jozsi", "Eszter");
        assertEquals("Hibas eredmeny", "Eszter Eszter Eszter Eszter Eszter", s);
    }

    @Test
    public void teszt_04() {
        String s = Orarend.oracsere("Peter Gabor Andras Otto Otto Mate Mate Otto Jozsi Otto", "Judit");
        assertEquals("Hibas eredmeny", "Peter Gabor Andras Otto Otto Mate Mate Otto Judit Otto", s);
    }

    @Test
    public void teszt_05() {
        String s = Orarend.oracsere("Jozsi", "Mark");
        assertEquals("Hibas eredmeny", "Mark", s);
    }
}