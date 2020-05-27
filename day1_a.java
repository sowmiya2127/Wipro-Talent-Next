import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;
public class Solution {    
    public static int inttobinary(int n) {
    int ctr = 0;
    String binaryNumber = Integer.toBinaryString(n);
    System.out.print(binaryNumber);
    System.out.println("\t");
    for (char ch : binaryNumber.toCharArray()) {
      ctr += ch == '0' ? 1 : 0;
    }
    return ctr;
  }    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.print("Input first number: ");
        int n = in.nextInt();
         //System.out.println("\n");
        System.out.println(inttobinary(n));
       // System.out.println("\n");
        }
}