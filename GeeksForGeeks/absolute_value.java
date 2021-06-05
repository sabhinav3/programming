/*

Platform : Geeks for Geeks
DSA Self Paced Course
Track-2 : Mathematics
Problem Name : Absolute Value
Problem Link : https://practice.geeksforgeeks.org/problems/absolute-value/1/?track=DSASP-Mathematics&batchId=154
General Problem Link : https://www.geeksforgeeks.org/program-to-find-absolute-value-of-a-given-number/
Date : 05/06/2021

*/



import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int absolute(int I) {
        // code here
        int n = I;
        if(n>0){
            return n;
        }
        else{
            return n-2*n;
        }
        
    }
}
