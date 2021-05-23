/*

Question Link : https://www.hackerrank.com/challenges/plus-minus/problem

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

import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class temp_java {

  private static DecimalFormat df2 = new DecimalFormat("#.######");

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // no.of elements in an array
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int array[];
        int i;
        array = new int[n];

        for(i=0; i<n; i++){
          array[i] = input.nextInt();
        }

        for(i=0; i<n; i++){
          if(array[i] == 0){
            count1++;
          }
          if(array[i] > 0){
            count2++;
          }
          if(array[i] < 0 ){
            count3++;
          }
        }

        double a = (double)count2/n;
        double b = (double)count3/n;
        double c = (double)count1/n;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
      }
}

