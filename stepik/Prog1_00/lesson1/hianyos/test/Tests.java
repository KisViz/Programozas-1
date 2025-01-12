import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt1() {
        Hianyos.main(new String[] {"a", "b"});
    }

    @Test
    public void teszt2() {
      int a = Integer.parseInt(doArgumentTest(Hianyos.class, "a", "b", "1"));
      int b = Integer.parseInt(doArgumentTest(Hianyos.class, "bb", "ss"));
      int c = Integer.parseInt(doArgumentTest(Hianyos.class, "bb", "ss", "55"));

      assertEquals(a, 3);
      assertEquals(b, 2);
      assertEquals(c, 3);
    }
}