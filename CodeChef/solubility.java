/*
Contest :  May Challenge 2021 Division 3 (Rated)
Date : 23-05-2021
Problem Name : Solubility
Problem Code : SOLBLTY
Problem Link : https://www.codechef.com/MAY21C/problems/SOLBLTY
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
        int n = input.nextInt(); // no.of test cases

        int x_array[];  // initializing " x "
        x_array = new int[n];

        int a_array[];  // initializing " a "
        a_array = new int[n];

        int b_array[];  // initializing " b "
        b_array = new int[n];

        int ans_array[];  // initializing " ans "
        ans_array = new int[n];

        int i;
        for(i=0; i<n; i++){
           x_array[i] = input.nextInt();
            a_array[i] = input.nextInt();
            b_array[i] = input.nextInt();
        }

        for(i=0; i<n; i++){
            if((n>=1 && n<=1000)&&(x_array[i]>=31 && x_array[i] <=40)&&(a_array[i] >= 101 && a_array[i] <= 120)&&(b_array[i] >= 1 && b_array[i] <= 5)){
              for(i=0; i<n; i++){
                ans_array[i] = a_array[i] + (100 - x_array[i])*b_array[i];
              }

              for(i=0; i<n; i++){
                ans_array[i] = ans_array[i]*10;
                System.out.println(ans_array[i]);
              }
            }
        }
	}
}
