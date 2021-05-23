/*
Question Link : https://atcoder.jp/contests/abc042/tasks/abc042_a
Contest : AtCoder Beginner Contest 042
*/

// Solution 

import java.util.*;
 
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
      	if(N+A+B==17&&(N==5||A==5||B==5)&&(N==7||A==7||B==7)){
  			   System.out.println("YES");
		    }
   		  else{
     		  System.out.println("NO");
		    }
  	}
}
