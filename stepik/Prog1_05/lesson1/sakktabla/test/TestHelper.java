import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TestHelper {

    private Stream<Object> flatten(Object[] array) {
        return Arrays.stream(array).flatMap(o -> o instanceof Object[] ? flatten((Object[])o): Stream.of(o));
    }

    protected boolean doOneDimensionTest(int size) {
        Object[] res = Sakktabla.sakktabla(1, size);

        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0 && (int) res[i] != 0) {
                return false;
            } else if (i % 2 == 1 && (int) res[i] != 1) {
                return false;
            }
        }

        return true;
    }

    protected boolean doHigherDimensionTest(int dimension, int size) {
        Object[] arr = Sakktabla.sakktabla(dimension, size);
        Object[] array = flatten(arr).toArray();

        int resdim = 2;
        while (arr[0] instanceof Object[]) {
            arr = (Object[]) arr[0];
            resdim++;
        }

        if (resdim != dimension) {
            fail("a visszaadott tomb dimenzioszama nem megfelelo");
        }

        if (((int[]) array[0])[0] != 0) {
            return false;
        }

        if (((int[]) array[0]).length != size) {
            return false;
        }

        int visszanezes = 1;
        int hatvany = 1;
        for (int i = 0; i < array.length; i++) {
            int[] res = (int[]) array[i];

            for (int j = 1; j < res.length; j++) {
                if (!(res[j-1] == 0 ? res[j] == 1 : res[j] == 0)) {
                    return false;
                }
            }

            if (i == 0) {
                continue;
            }

            if (i == Math.pow(size, hatvany)) {
                visszanezes *= size;
                hatvany++;
            }

            int[] old = (int[]) array[i - visszanezes];

            for (int j = 0; j < old.length; j++) {
                if (old[j] == res[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}