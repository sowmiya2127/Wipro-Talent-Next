Collections.sort(ratings);  
     int sum=0;
    int n=ratings.size();
    for(int i=1;i<n;i+=2)
    {
        sum+= ratings.get(i)-ratings.get(i-1);
        
    }
    return sum;
    }
   
}
