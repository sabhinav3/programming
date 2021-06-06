/*

Date : 06/06/2021
Contest : AtCoder Beginner Contest 204
Problem Name : A - Rock-paper-scissors
Problem Link : https://atcoder.jp/contests/ABC204/tasks/abc204_a

*/

// Solution

import java.util.*;
public class Main {

  public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in); 
        int x = input.nextInt(); 
        int y = input.nextInt();

        if(x!=y){
            for(int i=0; i<3; i++){
                if(x!=i && y!=i){
                    System.out.println(i);
                    break;
                }
            }
        }

        else if(x == y){
            System.out.println(x);
        }



    } // main function
}






