import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelper {
    public Macska createMacska(String a, int b) {
        Macska m = new Macska();
        m.szin = a;
        m.etelIgeny = b;
        return m;
    }
}