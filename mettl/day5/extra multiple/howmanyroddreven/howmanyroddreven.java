int even=0,odd=0;
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

    if(input1%2==0)
    even+=1;
    else
    odd+=1;
    if(input2%2==0)
    even+=1;
    else
    odd+=1;
    if(input3%2==0)
    even+=1;
    else
    odd+=1;
    if(input4%2==0)
    even+=1;
    else
    odd+=1;
    if(input5%2==0)
    even+=1;
    else
    odd+=1;
    
    String s1 ="odd"; String s2="even";
	if(s1.equals(input6))
	return odd;
	else
	return even;
