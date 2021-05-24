/*
Contest : Practice(Beginner)
Problem Name : Pair Me
Problem Code : SUMPOS
Problem Link : https://www.codechef.com/problems/SUMPOS
*/

// Solution

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in); 
    	int i;
    	int n = input.nextInt(); // no.of test cases

    	int a_array[];			// taking input of the first digit in each test case
    	a_array = new int[n];

    	int b_array[];			// taking input of the second digit in each test case
    	b_array = new int[n];

    	int c_array[];			// taking input of the third digit in each test case
    	c_array = new int[n];

    	String ans_array[];			// printing output of the answer for each test case
    	ans_array = new String[n];

    	for(i=0; i<n; i++){
    		a_array[i] = input.nextInt();
    		b_array[i] = input.nextInt();
    		c_array[i] = input.nextInt();
    	}

    	for(i=0; i<n; i++){
    		if((a_array[i] + b_array[i] == c_array[i])||(a_array[i] + c_array[i] == b_array[i])||(b_array[i] + c_array[i] == a_array[i])){
    			ans_array[i] = "YES";
    		}

    		else{
    			ans_array[i] = "NO";
    		}
    	}

    	for(i=0; i<n; i++){
    		System.out.println(ans_array[i]);
    	}
	}
}
