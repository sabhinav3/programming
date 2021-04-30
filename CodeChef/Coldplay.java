/*
Problem Name : Coldplay
Problem Code : SLOOP
Problem Link : https://www.codechef.com/LTIME95C/problems/SLOOP
*/

// Solution :

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
        int t=input.nextInt();
        int m_array[];
		m_array = new int[t];
		int s_array[];
		s_array = new int[t];
		int ans_array[];
		ans_array = new int[t];
		int i,a;

		for(i=0; i<t; i++){
			m_array[i] = input.nextInt();
			s_array[i] = input.nextInt();
		}

		for(i=0; i<t; i++){
			ans_array[i] = m_array[i]/s_array[i];
		}

		for(i=0; i<t; i++){
			System.out.println(ans_array[i]);
		}      
	}
}
