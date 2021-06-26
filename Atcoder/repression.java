import java.util.*;
public class Main{

  public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in); 
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int ans = ((a+b)>(b+c))?(((a+b)>(a+c))?(a+b):(a+c)):(((b+c)>(a+c))?(b+c):(a+c));
        System.out.println(ans);


       
    } // main function
}
