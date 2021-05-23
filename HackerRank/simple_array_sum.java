/*
Question Link : https://www.hackerrank.com/challenges/simple-array-sum/problem
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
    
    int i,n,sum=0;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    int arr[];
    arr = new int[n];
    for(i=0; i<n; i++){
        arr[i] = input.nextInt();
        sum = sum + arr[i];
    }
    System.out.println(sum);
}
}
