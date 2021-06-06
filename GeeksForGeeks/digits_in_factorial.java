/*

Platform : Geeks for Geeks
DSA Self Paced Course
Track-2 : Mathematics
Problem Name :  Digits In Factorial
Problem Link : https://practice.geeksforgeeks.org/problems/digits-in-factorial/1/?track=DSASP-Mathematics&batchId=154
General Problem Link : https://www.geeksforgeeks.org/count-digits-factorial-set-1/
Date : 06/06/2021

*/





//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public int digitsInFactorial(int N){
        // // code here
        // factorial exists only for n>=0
        int n = N; 
        if (n < 0)
            return 0;
  
        // base case
        if (n <= 1)
            return 1;
  
        // else iterate through n and calculate the
        // value
        double digits = 0;
        for (int i=2; i<=n; i++)
            digits += Math.log10(i);
  
        return (int)(Math.floor(digits)) + 1;
    
        
        
    }
}
