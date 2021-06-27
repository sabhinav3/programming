/*

Platform : Geeks for Geeks
DSA Self Paced Course
Track-4 : Recursion
Problem Name : Sum of Digits of a Number
Problem Link : https://practice.geeksforgeeks.org/problems/sum-of-digits-of-a-number/1/?track=DSASP-Recursion&batchId=154#
Date : 27/06/2021

*/


//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().sumOfDigits(n)); // computing sum of digits of n
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        // add your code here
        if(n <= 9)
            return n;
        
        else
            return sumOfDigits(n/10) + n%10;
    }
}
