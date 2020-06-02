import java.io.*;
import  java.util.*;
class CountPrimesInRange{
public int CountPrimesInRange(int input1,int input2){

int k=2,d=input1,i,c=0,p=0,count=0;
		while(d<=input2)
		{
			for(i=2;i<d;i++)
			{
				if(d%i==0)
				c++;
			}
			if(c==0)
			{
				count++;
				System.out.println(d);
			}
			d++;
			c=0;
		}
		return count;

		
	}
}
