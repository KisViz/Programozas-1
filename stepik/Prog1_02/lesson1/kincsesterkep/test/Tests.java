import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void teszt_01() {
        int[][][] tomb1 = {
                {{4, 2, 5}, {7, 5, 4}, {3, 2, 1}, {8, 8, 5}},
                {{1, 3, 6}, {8, 6, 5}, {2, 0, 4}, {9, 7, 4}}
        };

        assertEquals("hibas visszateresi ertek", 1, Kincsesterkep.terkep(tomb1));
    }

    @Test
    public void teszt_02() {
        int[][][] tomb2 = {
                {{2, 4}, {7, 4}, {3, 3}, {0, 0}, {7, 5}, {3, 2}, {8, 5}, {3, 2}, {2, 1}},
                {{6, 4}, {2, 1}, {8, 7}, {9, 4}, {7, 6}, {6, 6}, {6, 3}, {7, 9}, {3, 2}},
                {{8, 6}, {4, 4}, {3, 3}, {8, 6}, {7, 5}, {3, 0}, {8, 3}, {3, 4}, {5, 2}},
                {{7, 5}, {6, 3}, {4, 4}, {9, 8}, {6, 7}, {5, 4}, {8, 3}, {6, 2}, {7, 4}},
                {{9, 2}, {7, 2}, {3, 4}, {2, 0}, {5, 8}, {4, 5}, {8, 6}, {4, 7}, {4, 6}},
                {{9, 2}, {0, 4}, {3, 4}, {1, 3}, {7, 9}, {3, 2}, {8, 4}, {4, 4}, {8, 7}}
        };

        assertEquals("hibas visszateresi ertek", 3, Kincsesterkep.terkep(tomb2));
    }

    @Test
    public void teszt_03() {
        int[][][] tomb3 = {
                {{3, 5, 4, 9, 5, 7, 0, 0, 2, 7, 1}, {0, 1, 1, 5, 5, 6, 0, 3, 9, 3, 4}},
                {{2, 4, 6, 9, 4, 6, 2, 1, 5, 4, 0}, {1, 1, 1, 3, 5, 7, 0, 6, 7, 4, 2}},
                {{2, 3, 0, 9, 2, 8, 9, 4, 6, 7, 6}, {1, 1, 1, 4, 7, 6, 0, 3, 5, 5, 0}},
                {{3, 2, 8, 6, 2, 9, 9, 4, 8, 8, 6}, {1, 1, 1, 2, 6, 7, 0, 4, 2, 2, 4}}
        };

        assertEquals("hibas visszateresi ertek", 4, Kincsesterkep.terkep(tomb3));
    }
}