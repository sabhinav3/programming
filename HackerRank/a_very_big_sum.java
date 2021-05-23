/*

Question Link : https://www.hackerrank.com/challenges/a-very-big-sum/problem?h_r=profile

*/

// Solution

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        long arr[];
        arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextLong();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

