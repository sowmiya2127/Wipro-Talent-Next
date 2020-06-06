int count=0;
		int no=1,i;
	while(count<input1)
			{
				no+=1;
				for( i=2;i<=no;i++)
				{
					if(no%i==0)
					break;
				}
				if(i==no)
				count+=1;
			}
			return no;
		
	}
}
