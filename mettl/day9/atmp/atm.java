{
int u1=input1%10;
	    int u2=input2%10;
		int u3=input3%10;
		int umin;
		if(u1<=u2 && u1<=u3)
		{
			umin=u1;
		}
		else if(u2<u3)
		{
			umin=u2;
		}
		else
		umin=u3;
		
		int t1=(input1/10)%10;
	    int t2=(input2/10)%10;
		int t3=(input3/10)%10;
		int tmin;
		if(t1<=t2 && t1<=t3)
		{
			tmin=t1;
		}
		else if(t2<t3)
		{
			tmin=t2;
		}
		else
		tmin=t3;

	    int h1=(input1/100)%10;
	    int h2=(input2/100)%10;
		int h3=(input3/100)%10;
		int hmin;
		if(h1<=h2 && h1<=h3)
		{
			hmin=h1;
		}
		else if(h2<h3)
		{
			hmin=h2;
		}
		else
		hmin=h3;

		int max1=0,temp1=0;
		while(input1!=0)
		{
			temp1=input1%10;
			if(temp1>max1)
			max1=temp1;

			input1/=10;
		}

		int max2=0,temp2=0;
		while(input2!=0)
		{
			temp2=input2%10;
			if(temp2>max2)
			max2=temp2;

			input2/=10;
		}

		int max3=0,temp3=0;
		while(input3!=0)
		{
			temp3=input3%10;
			if(temp3>max3)
			max3=temp3;

			input3/=10;
		}

		int max;
		if(max1>=max2 && max1>=max3)
		{
			max=max1;
		}
		else if(max2<=max3)
		{
			max=max3;
		}
		else
		max=max2;

		return max*1000 + hmin*100 + tmin*10 + umin;
	}
}
