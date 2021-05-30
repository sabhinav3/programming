// Solution

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a==b){
			System.out.println(c);
		}
		else if (c==a) {
			System.out.println(b);
		}
		else if (b==c) {
			System.out.println(a);
		}

		else{
			System.out.println("0");
		}
	}
}

