import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface OnlineAccount {
	int basePrice = 120;
	int regularMoviePrice = 45;
	int exclusiveMoviePrice = 80;
}
class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfRegularMovies and noOfExclusiveMovies.
    public Account(String s,int x,int y){
        this.ownerName=s;
        this.noOfRegularMovies=x;
        this.noOfExclusiveMovies=y;
    }


    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        //int basePrice=super.basePrice;
        //int regularMoviePrice=super.regularMoviePrice;
        //int exclusiveMoviePrice=super.exclusiveMoviePrice;
        int monthlyCost=basePrice+noOfRegularMovies*regularMoviePrice+noOfExclusiveMovies*exclusiveMoviePrice;
        return monthlyCost;
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
    public int compareTo(Account a){
        if(monthlyCost()>a.monthlyCost()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() {
        return "Owner is "+ownerName+" and monthly cost is "+monthlyCost()+" USD.";
    }
}
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();

        int t = Integer.parseInt(sub);

        ArrayList<Account> list = new ArrayList<Account>();

        for(int i=0; i<t; i++) {
        	String[] input = sc.nextLine().split(" ");
        	list.add(new Account(input[0],
        						Integer.parseInt(input[1]),
        						Integer.parseInt(input[2])));
        }
      	
        Collections.sort(list);

        System.out.println("Most valuable account details:");
        System.out.println(list.get(list.size() - 1));
    }
}
