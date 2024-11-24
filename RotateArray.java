import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());  // Number of test cases
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> array = new ArrayList<>();
            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }
            int d = Integer.parseInt(in.readLine().trim()); // rotation count (key)
            int n = array.size();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = array.get(i);
            new Solution().rotateArr(arr, d); // rotating the array
            StringBuilder sb = new StringBuilder();
            // printing the elements of the array
            for (int value : arr) sb.append(value).append(" ");
            out.println(sb.toString().trim());
            out.println("~");
        }
        out.flush();
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        // Handle case where d is greater than n, as rotating more than n times results in the same array
        d = d % n;
        
        // If d is 0, no rotation is needed
        if (d == 0) return;
        
        // Create a temporary array to store the rotated array
        int[] temp = new int[n];
        
        // Fill the temporary array with elements from the original array
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }
        
        // Copy the temporary array back into the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
