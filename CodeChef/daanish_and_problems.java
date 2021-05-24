/*
Contest : Practice(Beginner)
Date : 23-05-2021
Problem Name : Daanish and Problems
Problem Code : DIV03
Problem Link : https://www.codechef.com/problems/DIV03
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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++){
		    int a[]=new int[10];
		    for(int i=0;i<10;i++){
		        a[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    for(int i=9;i>=0;i--){
		        k=k-a[i];
		        if(k<0){
		            System.out.println(i+1);
		            break;
		        }
		    }
		    
		}
	}
}
