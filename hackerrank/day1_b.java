import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        Boolean[][] array=new Boolean[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                array[i][j]=sc.nextBoolean();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(array[i][j]==true){
                    System.out.print("t ");
                }
                else{
                    System.out.print("f ");
                }
                }
                System.out.println("");
            }
    }
}