import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    {
        keepSoutSerr = false;
    }

    @Test
    public void teszt() {
        doArgumentTest(Macska.class);

        Macska.main(new String[] {});
        assertEquals(sout.toString(), "MACSKA" + System.lineSeparator());
    }
}