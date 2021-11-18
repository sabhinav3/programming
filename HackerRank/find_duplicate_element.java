/*

Problem Link : https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-find-duplicate-element-in-array/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // taking input of 'n'
        int arr[] = new int[n] ; // taking the input of 'n' elements 
        
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    
    }
    
    static void find(){
        
    }
}
