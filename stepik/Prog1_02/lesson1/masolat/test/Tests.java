import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        int[] tomb = {2, 4, 5};
        int[] eredmeny = Masolat.masol(tomb);

        assertArrayEquals(tomb, eredmeny);
        tomb[0] = 6;
        assertFalse(Arrays.equals(tomb, eredmeny));
    }

    @Test
    public void teszt_02() {
        int[] tomb = new int[] {6, 6, 4, 3, 1, 0, 6, -64, 4353};
        int[] eredmeny = Masolat.masol(tomb);

        assertArrayEquals(tomb, eredmeny);
        eredmeny[3] = 55;
        assertFalse(Arrays.equals(tomb, eredmeny));
    }
}