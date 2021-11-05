/*


Contest : Code Senso ( Div 3 )
Date : 05-11-2021
Problem Name : Drunk Alcoholic
Problem Code : DRUNKALK
Problem Link : https://www.codechef.com/problems/DRUNKALK

Practice 


*/

// Solution



import java.util.*;
public class drunkalk{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt(); // no.of test cases
		int n_array[] = new int[t]; // denoting total no.of steps
		int i,j, sum=0;
		int sum_array[] = new int[t];

		for(i=0; i<t; i++){
			n_array[i] = input.nextInt();
		}


		for(i=0; i<t; i++){
			for(j=1; j<=n_array[i]; j++){

				if(j==1){
					sum = sum + 3;
				}

				else if(j%2!=0){
					sum = sum+3;
				}

				else{
					sum = sum-1;
				}
			}
			
			sum_array[i] = sum;
			sum = 0;
		}

		for(i=0; i<t; i++){
			System.out.println(sum_array[i]);
			
		}
	}
}
