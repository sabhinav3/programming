/*

Question Link : https://www.hackerrank.com/challenges/staircase/problem?h_r=profile

*/

//Solution

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
        int n = input.nextInt(); // no.of elements
        int i;

        int star = 1, space = n-1;
        while(n > 0){
            for(i = 0; i < space; i++){
                System.out.print(" ");
            }
            for(i = 0; i < star; i++){
                System.out.print("#");
            }
            star = star + 1;
            space = space - 1;
            --n;
            System.out.println("");
        }

    }
}
