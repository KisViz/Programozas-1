import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void testSolution() {
        assertEquals("hibas eredmeny", 7, Integer.parseInt(doArgumentTest(Kepkeret.class, "3", "5", "8", "1")));
        assertEquals("hibas eredmeny", 0, Integer.parseInt(doArgumentTest(Kepkeret.class, "2")));
        assertEquals("hibas eredmeny", 0, Integer.parseInt(doArgumentTest(Kepkeret.class, "7", "7", "7", "7", "7", "7", "7")));
        assertEquals("hibas eredmeny", 99, Integer.parseInt(doArgumentTest(Kepkeret.class, "3", "7", "2", "8", "101")));
        assertEquals("hibas eredmeny", 1244141117, Integer.parseInt(doArgumentTest(Kepkeret.class, "10", "100000", "313131231", "5", "1244141122")));
        assertEquals("hibas eredmeny", 5, Integer.parseInt(doArgumentTest(Kepkeret.class, "2147483647", "2147483642", "2147483645", "2147483647")));
    }
}