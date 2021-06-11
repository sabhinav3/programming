/*

Probelm Link : https://www.hackerrank.com/challenges/java-loops/problem

*/

// Solution

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int c = a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        } 
    }
}
