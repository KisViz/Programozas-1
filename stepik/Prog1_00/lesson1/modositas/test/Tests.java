import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
  @Test
  public void test1() {
    Feladat.main(new String[] {"a", "b", "c"});
  }

  @Test
  public void test2() {
    String s1 = doArgumentTest(Feladat.class, "a", "b", "c");
    String s2 = doArgumentTest(Feladat.class, "a", "b", "c", "d");

    assertEquals(Integer.parseInt(s1), 3);
    assertEquals(Integer.parseInt(s2), 4);
  }

}