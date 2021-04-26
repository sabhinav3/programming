/*
HackerRank

Smart Interview Questions : https://www.hackerrank.com/contests/smart-interviews/challenges

Problem Name : Print Right Angled Triangle Pattern

Problem  Link : https://www.hackerrank.com/contests/smart-interviews/challenges/si-print-right-angled-triangle-pattern

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; // no.of test cases
        n = input.nextInt();
        int array[];
        array = new int[n];

        for(int k=0; k<n; k++){
            array[k] = input.nextInt();
        }

        for(int k=0; k<n; k++){
            int p = k+1;
            System.out.println("Case #" +p+":" );
            for(int i=1;i<=array[k];i++)
            {
                    for(int j=0;j<array[k]-i;j++)
                    {
                        System.out.print(" ");
                    }

                    for(int j=0;j<i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
            }
        }
    }
}
