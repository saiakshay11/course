// Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Read the number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" "); // Read the array elements as a string
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]); // Convert each element to integer and store in the array
            }
            new Solution().pushZerosToEnd(arr); // Call the solution method to push zeros to the end
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " "); // Print the modified array
            }
            System.out.println(); // New line after each test case output
        }
    }
}
// Driver Code Ends

// User function Template for Java
class Solution {
    // Function to push all zeros to the end of the array.
    void pushZerosToEnd(int[] arr) {
        int n = arr.length; // Get the length of the array
        int nonZeroIndex = 0; // Pointer to keep track of the position to insert the non-zero elements
        
        // Traverse the array to move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) { // If the current element is non-zero
                // Swap the non-zero element with the element at nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                
                // Increment the nonZeroIndex to point to the next position
                nonZeroIndex++;
            }
        }
    }
}
