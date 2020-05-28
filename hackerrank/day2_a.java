import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in=new Scanner(System.in);
        String s;
        s=in.nextLine();
       // System.out.println(s.length());
       // System.out.println(s.charAt(2));
        s=s.toLowerCase();
        int A=0,E=0,I=0,O=0,U=0;
        int i;
        for( i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
         if (ch=='a')
         {
             A=1;
         }
         else if(ch=='e')
         {
             E=1;
         }
         else if(ch=='i')
         {
             I=1;
         }
         else if(ch=='o')
         {
             O=1;
         }
         else if(ch=='u')
         {
             U=1;
         }
        }
        if(A==1)
        System.out.print('a');
        if(E==1)
        System.out.print('e');
        if(I==1)
        System.out.print('i');
        if(O==1)
        System.out.print('o');
        if(U==1)
        System.out.println('u');
        if(A!=1 && E!=1 && I!=1 && O!=1 && U!=1)
        System.out.print("Thank You");
    }
}