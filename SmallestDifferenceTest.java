import org.junit.Test;
import static org.junit.Assert.*;

public class SmallestDifferenceTest {

    @Test
    public void testSmallestDifference() {
        // Test case 1: Minimum difference is 3
        int[] a1 = {1, 3, 15, 11, 2};
        int[] b1 = {23, 127, 235, 19, 8};
        int result1 = SmallestDifference.smallestDifference(a1, b1);
        assertEquals(3, result1);

        // Test case 2: Minimum difference is 10
        int[] a2 = {10, 5, 40};
        int[] b2 = {50, 90, 80};
        int result2 = SmallestDifference.smallestDifference(a2, b2);
        assertEquals(10, result2);

        // Test case 3: Minimum difference is 0 (identical elements)
        int[] a3 = {5, 5, 5, 5};
        int[] b3 = {5, 5, 5, 5};
        int result3 = SmallestDifference.smallestDifference(a3, b3);
        assertEquals(0, result3);

        // Test case 4: Minimum difference is 0 (empty arrays)
        int[] a4 = {};
        int[] b4 = {};
        int result4 = SmallestDifference.smallestDifference(a4, b4);
        assertEquals(0, result4);

        // Test case 5: Minimum difference is 1 (small arrays)
        int[] a5 = {1};
        int[] b5 = {2};
        int result5 = SmallestDifference.smallestDifference(a5, b5);
        assertEquals(1, result5);
    }
}
