/*
-- KATTIS Online Judge
Website Link : https://open.kattis.com

Question Link : https://open.kattis.com/problems/cold
Probelm ID : cold

*/

// Solution 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[];
        int count=0;
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
            if(arr[i] < 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
