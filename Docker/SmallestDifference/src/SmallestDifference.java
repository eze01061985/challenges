import java.util.Arrays;

public class SmallestDifference {
    // Function to find the smallest difference between two arrays of integers.
    public static int smallestDifference(int[] a, int[] b) {
        // First, sort both arrays so that the values are in ascending order.
        Arrays.sort(a);
        Arrays.sort(b);
        
        int minDifference = Integer.MAX_VALUE; // Initialize the minimum difference with a large value.
        
        int i = 0; // Index to traverse the 'a' array.
        int j = 0; // Index to traverse the 'b' array.
        
        // Traverse both arrays to find the minimum difference.
        while (i < a.length && j < b.length) {
            int difference = Math.abs(a[i] - b[j]); // Calculate the difference between the current elements.
            if (difference == 0) {
                return 0; // If the difference is 0, they are the closest possible values.
            }
            
            // Update the minimum difference if it's smaller than the previous one.
            if (difference < minDifference) {
                minDifference = difference;
            }
            
            // Move forward in the array that currently has the smaller current value.
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        return minDifference; // Return the minimum difference found.
    }
    
    public static void main(String[] args) {
        final int[] a = {1, 3, 15,11,2};
        final int[] b = {23, 127, 235,19,8};
        int result = smallestDifference(a, b);
        System.out.println("The smallest difference between the two given arrays is: " + result);
    }
}
