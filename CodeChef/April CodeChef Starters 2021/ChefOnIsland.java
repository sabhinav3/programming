/*
Problem : Chef on Island
Problem Code : CCISLAND
Problem Link : https://www.codechef.com/START3C/problems/CCISLAND


Solution:

*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
        int d, n;
		int i=0;
		int x, y, a, b, c, dd;
		n = input.nextInt(); // taking the input of " n " test cases.
		int x_array[];
		x_array = new int[n];
		int y_array[];
		y_array = new int[n];
		int xr_array[];
		xr_array = new int[n];
		int yr_array[];
		yr_array = new int[n];
		int d_array[];
		d_array = new int[n];

		for(i=0; i<n; i++){
			x_array[i] = input.nextInt();
			y_array[i] = input.nextInt();
			xr_array[i] = input.nextInt();
			yr_array[i] = input.nextInt();
			d_array[i] = input.nextInt();
		}
		for(i=0; i<n; i++){
			x = (x_array[i])/(xr_array[i]);
			y = (y_array[i])/(yr_array[i]);

			if(x>=0 && y>=0){
				if(x>=d_array[i] && y>=d_array[i]){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		}
	}
}
