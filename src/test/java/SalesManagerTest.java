import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesManagerTest {

    SalesManager salesManager = new SalesManager(new long[]{5, 5, 77, 77, 31, 22});
    @Test
    void max() {
        long expect = 77;
        long result = salesManager.max();
        Assertions.assertEquals(expect, result);
    }

    @Test
    void min() {
        long expect = 5;
        long result = salesManager.min();
        Assertions.assertEquals(expect, result);
    }

    @Test
    void croppAverage() {
        long expect = 33;
        long result = salesManager.croppAverage();
        Assertions.assertEquals(expect, result);
    }
}