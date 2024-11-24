import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());  // Number of test cases
        while (tc-- > 0) {
            // Read the input array as space-separated integers
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Create the Solution object
            Solution obj = new Solution();
            // Reverse the array using the reverseArray method
            obj.reverseArray(arr);
            // Print the reversed array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();  // Print a new line after the array
            System.out.println("~");  // Print the '~' as per the problem statement
        }
    }
}
// } Driver Code Ends

// Solution class with the reverseArray method
class Solution {
    // Method to reverse the array
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        // Perform in-place swapping until the two pointers cross
        while (left < right) {
            // Swap elements at arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move the pointers towards each other
            left++;
            right--;
        }
    }
}
