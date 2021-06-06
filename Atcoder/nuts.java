
/*

Date : 06/06/2021
Contest : AtCoder Beginner Contest 204
Problem Name : B - Nuts
Problem Link : https://atcoder.jp/contests/ABC204/tasks/abc204_b

*/

// SOLUTION

import java.util.*;
public class Main{

  public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in); 
        int n = input.nextInt(); // no.of test cases

        int t_array[] = new int[n];

        int i, sum=0;

        for(i=0; i<n; i++){
        	t_array[i] = input.nextInt();
        	if(t_array[i] > 10){
        		sum = sum + (t_array[i]-10);
        	}
        }

        System.out.println(sum);

    } // main function
}

