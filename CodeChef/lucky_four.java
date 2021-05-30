/*
» Practice(Beginner)
Problem : Lucky Four
Problem Code : LUCKYFR
Problem Link : https://www.codechef.com/problems/LUCKYFR
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
    	int i, n, num;
    	int count=0;
    // 	System.out.println("Enter the no.of Integers : ");
    	n = input.nextInt();

    // 	System.out.println("Enter the elements in the Array : ");

    	int input_array[];
    	input_array = new int[n];

    	int ans_array[];
    	ans_array = new int[n];

    	int count_array[];
    	count_array = new int[n];

    	for(i=0; i<n; i++){
    		input_array[i] = input.nextInt();
    	}

    	for(i=0; i<n; i++){
    		while(input_array[i] > 0){
    			num = input_array[i]%10;
    			if(num == 4){
    				count = count + 1;
    			}
    			input_array[i] = input_array[i]/10; 
    		}
    		count_array[i] = count;
    		count =0;
    	}



    // 	System.out.println("Output : ");

    	for(i=0; i<n; i++){
    		System.out.println(count_array[i]);
    	}

	}
}
