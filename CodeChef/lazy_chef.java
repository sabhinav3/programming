
/*

» May CodeChef Starters 2021 Division 3 (Rated)
Problem : Lazy Chef
Problem Code : LAZYCHF
Problem Link : https://www.codechef.com/START4C/problems/LAZYCHF

*/

// Solution

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
        int i, j, k;
        int count=0;
        int n = input.nextInt(); // no. of test cases

        int x_array[];
        x_array = new int[n];

        int m_array[];
        m_array = new int[n];

        int d_array[];
        d_array = new int[n];

        int min1_array[];
        min1_array = new int[n];

        int min2_array[];
        min2_array = new int[n];

        int ans_array[];
        ans_array = new int[n];

        for(i=0; i<n; i++){
            x_array[i] = input.nextInt();
            m_array[i] = input.nextInt();
            d_array[i] = input.nextInt();
        }

        for(i=0; i<n; i++){
            min1_array[i] = x_array[i] * m_array[i];
            min2_array[i] = x_array[i] + d_array[i];
            if(min1_array[i] >= min2_array[i]){
                ans_array[i] = min2_array[i];
            }
            else{
                ans_array[i] = min1_array[i];
            }
        }

        for(i=0; i<n; i++){
            System.out.println(ans_array[i]);
        }
	}
}
