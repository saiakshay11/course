import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// User function Template for Java
class Solution {
    // Function to generate the next permutation of the array
    void nextPermutation(int[] arr) {
        int n = arr.length;
        
        // Step 1: Find the largest index i such that arr[i] < arr[i + 1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            // Step 2: Find the largest index j such that arr[i] < arr[j]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            
            // Step 3: Swap arr[i] and arr[j]
            swap(arr, i, j);
        }
        
        // Step 4: Reverse the sequence from arr[i + 1] to arr[n - 1]
        reverse(arr, i + 1, n - 1);
    }

    // Helper function to swap two elements
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to reverse the elements in the array from index i to j
    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output
            System.out.println("~");
        }
    }
}
