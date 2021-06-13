/*

Contest Link : https://atcoder.jp/contests/abc205
Problem Link : https://atcoder.jp/contests/abc205/tasks/abc205_b


*/

// Solution

import java.util.*;
public class Main{

  public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in); 
        int n = input.nextInt(); // input " N "

        int i, j, k=0,  temp=0, count=0;

        int array[];            // taking no.of inputs of " N "
        array = new int[n]; 

        for(i=0; i<n; i++){
            array[i] = input.nextInt();
        }

        for(i=0; i < n; i++){               //sorting the array - Bubble Sort
            for(j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                    //swap elements  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }        
            }  
        }

        // for(i=0; i<n; i++){     // printing the array in ascending order
        //     System.out.println(array[i]);
        // }

        
        for(i=0; i<n; i++){
            k = i+1;
            if(array[i] == k){
                count++;
            }
        }

        if(count == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    } // main function
}


