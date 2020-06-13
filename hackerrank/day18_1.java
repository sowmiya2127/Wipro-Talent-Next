int x,count=0;
     while(number>0)
     {
         x=number%10;
        if(x==0||x==4||x==6||x==9)
      {
         count=count+1;
      }
      else if(x==8)
      {
          count=count+2;
      }
      else
      {
        count=count+0;
      }
        number=number/10;
      }
      return count;
    }

}
