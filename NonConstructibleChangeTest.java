import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NonConstructibleChangeTest {
    
    @Test
    public void testMinimumChangeCase1() {
        int[] coins = {1, 2, 5};
        int expected = 4;
        int result = NonConstructibleChange.nonConstructibleChange(coins);
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumChangeCase2() {
        int[] coins = {};
        int expected = 1;
        int result = NonConstructibleChange.nonConstructibleChange(coins);
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumChangeCase3() {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        int result = NonConstructibleChange.nonConstructibleChange(coins);
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumChangeCase4() {
        int[] coins = {1, 2, 2, 5, 7};
        int expected = 18;
        int result = NonConstructibleChange.nonConstructibleChange(coins);
        assertEquals(expected, result);
    }
}
