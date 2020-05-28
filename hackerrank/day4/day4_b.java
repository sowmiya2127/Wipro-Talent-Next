import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
for(int a =1;a<=n;a++)
{
    if(a%3==0&&a%5!=0)
    System.out.println("Fizz");
    else if(a%3==0&&a%5==0)
    System.out.println("FizzBuzz");
    else if(a%5==0&&a%3!=0)
    System.out.println("Buzz");
    else
    System.out.println(a);
    
}
    }

}
