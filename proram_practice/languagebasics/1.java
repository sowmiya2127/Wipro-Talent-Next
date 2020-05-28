1.Write a Program that accepts two Strings as command line arguments and generate the output
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println(args[0]+" Technologies "+args[1]);
		
	}
}
o/p:
Wipro Technologies Bangalore
2.
 import java.io.*;
import java.util.*;
 public class Main
{
	public static void main(String[] args) {
		System.out.println(" Welcome "+args[0]);
		
	}
}
o/p:
Welcome John
import java.io.*;
import java.util.*;

class Main
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=Integer.parseInt(args[0]);
System.out.println(a);
b=Integer.parseInt(args[1]);
System.out.println(b);
c=a+b;
System.out.println("The sum of "+a+" and "+b+" is "+c);
}
}
o/p:
10
20
The sum of 10 and 20 is 30





