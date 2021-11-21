import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int arr[] = new int[100];
		int sum[] = new int[100];
		int temp = 0;
		for(int i=0; i<100; i++){
			arr[i] = input.nextInt();
			if(arr[i] != 0){
				for(int j=1; j<=arr[i]; j++){
					temp = temp + j*j; 
				}
				sum[i] = temp;
				System.out.println(temp);
				temp = 0;
			}
			else{
				System.exit(0);
			}
		}
	}
} 
