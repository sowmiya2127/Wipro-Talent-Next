int r,sum=0;    
  int n=input1;
  int temp=n;
 while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   return 2;
  else    
   return 1;    
}  
}  
