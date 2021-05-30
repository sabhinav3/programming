
/*
Date : 30/05/2021
Contest : AtCoder Beginner Contest 203（Sponsored by Panasonic)
Problem Name : B - AtCoder Condominium
Problem Link : https://atcoder.jp/contests/abc203/tasks/abc203_b
*/
// Solution

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j, sum=0, last=0;
		int ans[] = new int[50];
		int n = input.nextInt();
		int k = input.nextInt();
		for(i=1; i<=n; i++){
			for(j=1; j<=k; j++){
				sum = sum + (100*i) + j;
			}
			ans[i] = sum;
			sum=0;
		}
		
		for(i=1; i<=n; i++){
			last = last + ans[i]; 
		}
		System.out.println(last);
	}
}

