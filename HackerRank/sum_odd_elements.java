/*

Problem Link : https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-sum-of-odd-elements

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // taking the no.of inputs 
        int arr[] = new int[n]; // taking the inputs
        int sum = 0 ;
        
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
            if((arr[i] % 2) !=0){
                sum = sum + arr[i];
            }
        }
        
        System.out.println(sum);
    }
}
