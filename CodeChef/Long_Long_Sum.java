/*

Problem Name : Long Long Sum 
Problem Code : BC106
Problem Link : https://www.codechef.com/problems/BC106

*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long sum = 0;
		long array[];
		array = new long[n];
		for(int i=0; i<n; i++){
			array[i] = input.nextInt();
		}
		for(int i=0; i<n; i++){
			sum = sum + array[i];
		}
		System.out.println(sum);

	}
}
