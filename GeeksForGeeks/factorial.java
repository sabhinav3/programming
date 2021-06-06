/*

Platform : Geeks for Geeks
DSA Self Paced Course
Track-2 : Mathematics
Problem Name :  Factorial Of Number 
Problem Link :https://practice.geeksforgeeks.org/problems/factorial-of-number/1/?track=DSASP-Mathematics&batchId=154#
General Problem Link : https://www.geeksforgeeks.org/program-for-factorial-of-a-number/
Date : 06/06/2021

*/


// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            
            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            System.out.println(obj.factorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public long factorial(int N) {
        // Your code here
        long n = N;
        long res=1;
        for(long i=n; i>0; i--){
            res = res*i;
        }
        
        return res;
    }
}
