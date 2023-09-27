import java.util.Arrays;

public class NonConstructibleChange {
    public static int nonConstructibleChange(int[] coins) {
        // Sort the array in ascending order
        Arrays.sort(coins);
        
        // Initialize minChange to 1
        int minChange = 1;
        
        // Iterate through the sorted coins array
        for (int coin : coins) {
            // If the current coin value is greater than or equal to minChange,
            // return minChange as the minimum non-constructible change
            if (coin > minChange) {
                return minChange;
            }
            
            // Otherwise, update minChange
            minChange += coin;
        }
        
        // If all coins are used, return minChange
        return minChange;
    }

    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        int result = nonConstructibleChange(coins);
        System.out.println("Minimum non-constructible change is: " + result);
    }
}
