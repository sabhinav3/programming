



import java.util.*;
import java .io.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // taking no.of inputs
        int great = 0;
        int arr[] = new int[n]; // array of inputs
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        great = arr[n-1];
        System.out.println(great);
    }
}
