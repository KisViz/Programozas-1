import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import static org.junit.Assert.*;

public class Tests extends BaseTest {
    @Test
    public void teszt() {
        try {
            Beolvasas.beolvas("macska.txt", 10);
            fail("A metodus mukodesen ne valtoztass!");
        } catch (FileNotFoundException ignored) {}

        writeFile("eger.txt", Collections.singletonList("5 7 3"));

        try {
            assertEquals(12, Beolvasas.beolvas("eger.txt", 2));
            assertEquals(15, Beolvasas.beolvas("eger.txt", 3));
        } catch (FileNotFoundException e) {
            fail("A metodus mokudesen ne valtoztass!");
        }
    }
}