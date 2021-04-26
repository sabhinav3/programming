/*
HackerRank
Smart Interview Questions : https://www.hackerrank.com/contests/smart-interviews/challenges
Problem Name : Sum of array elements
Problem  Link : https://www.hackerrank.com/contests/smart-interviews/challenges/si-sum-of-array-elements
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            long a[]=new long[n];
            long sum=0;
            for(int j=0;j<n;j++)
            {
                a[j]=s.nextLong();
                sum+=a[j];
            }
            
            
            
            System.out.println(sum);
        }
    }
}
