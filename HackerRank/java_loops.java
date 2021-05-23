/*
Question Link : https://www.hackerrank.com/challenges/java-loops-i/problem?h_r=profile
*/

// Solution

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }

        scanner.close();
    }
}
