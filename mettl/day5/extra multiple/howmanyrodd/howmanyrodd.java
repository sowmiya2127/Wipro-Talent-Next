int a,b,c,d,e,count=0;
    a=input1;
    b=input2;
    c=input3;
    d=input4;
    e=input5;
    if(input1<0)
    input1*= -1;
    if(input2<0)
    input1*= -1;
    if(input3<0)
    input1*= -1;
    if(input4<0)
    input1*= -1;
    if(input5<0)
    input1*= -1;

     
      if(a%2!=0)
      count++;
      if(b%2!=0)
      count++;
      if(c%2!=0)
      count++;
        if(d%2!=0)
      count++;
        if(e%2!=0)
      count++;
      return count;
    }

	}
