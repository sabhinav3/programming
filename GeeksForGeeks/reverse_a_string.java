/*

Geeks for Geeks
Problem Name : Reverse a String 
Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-string/1#
               https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String[] args)throws IOException
    {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      int t = Interger.parseInt(read.readLine());
      
      while(t-->0)
      {
        string str = read.readLine();
        System.out.println(new Reverse().reverseWord(str));
      }
    }
}


class Reverse
{
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
          StringBuilder sb=new StringBuilder(str);  
          sb.reverse();  
          return sb.toString(); 
    }
}
