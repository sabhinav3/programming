/*

Problem Link : https://www.hackerrank.com/challenges/java-int-to-string/problem


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        String s = Integer.toString(i);
        if((i>=-100)||(i<=100)){
            System.out.println("Good job");
        }
        
        else{
            System.out.println("Wrong answer");
        }
    }
}
