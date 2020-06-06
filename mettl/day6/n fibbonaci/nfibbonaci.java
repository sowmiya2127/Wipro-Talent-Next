int a=0;
		int b=1,fib=0;
		for(int i=3;i<=input1;i++)
		{
			fib=a+b;
			a=b;
			b=fib;
		}
		if(input1==1)
		{
			return 0;
		}
	   else if(input1==2)
	   {
		   return 1;
	   }
	   else
	   {
		   return fib;
	   }
	}

}
