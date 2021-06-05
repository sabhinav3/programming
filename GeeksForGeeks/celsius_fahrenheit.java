/*

Platform : Geeks for Geeks
DSA Self Paced Course
Track-2 : Mathematics
Problem Name :  Convert Celsius To Fahrenheit 
Problem Link :https://practice.geeksforgeeks.org/problems/convert-celsius-to-fahrenheit/1/?track=DSASP-Mathematics&batchId=154#
General Problem Link : https://www.geeksforgeeks.org/program-celsius-fahrenheit-conversion/
Date : 05/06/2021

*/


//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input number of testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int C;
		    C=sc.nextInt();//input temperature in celscius
		    
		    System.out.println((int)(obj.cToF(C)));//print the output
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public double cToF(int C)
    {
        //Your code here
        int n = C;
        return ((n*(1.8))+32);
    }
}

