/*

Contest : May Cook-Off 2021 Division 3
Date : 23-05-2021

Problem Name : Marathon
Problem Code : MARARUN
Problem Link : https://www.codechef.com/COOK129C/problems/MARARUN

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

        int dd_array[];          // taking " D " input
        dd_array = new int[n];

        int d_array[];          // taking " d " input
        d_array = new int[n];

        int a_array[];          // taking " a " input
        a_array = new int[n];

        int b_array[];          // taking " b " input
        b_array = new int[n];

        int c_array[];          // taking " c " input
        c_array = new int[n];

        int mul_array[];          // taking " multiplication " input
        mul_array = new int[n];

        for(i=0; i<n; i++){
            dd_array[i] = input.nextInt();
            d_array[i] = input.nextInt();
            a_array[i] = input.nextInt();
            b_array[i] = input.nextInt();
            c_array[i] = input.nextInt();
        } // taking inputs - for loop

        for(i=0; i<n; i++){
            mul_array[i] = dd_array[i]*d_array[i] ;
        } // multiplication calculation

        for(i=0; i<n; i++){
            if(mul_array[i]<10){
                System.out.println("0");
            }
            else if(mul_array[i]>=10 && mul_array[i]<21){
                    System.out.println(a_array[i]);
            }
            else if(mul_array[i]>=21 && mul_array[i]<42){
                System.out.println(b_array[i]);
            }
            else if(mul_array[i]>=42){
                System.out.println(c_array[i]);
            }
        } // main for loop
         
	}
}
