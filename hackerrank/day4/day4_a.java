class Result {

    public static long pthFactor(long n, long p) {
         int array[],a=1;
         array=new int[100];
         for(int i=1;i<=n;i++)
         {
        if(n%i==0)
        {
            array[a]=i;
            a++;
        }
    }
    int size =array.length;
    int b=(int)p;
    if(size>b)
    return array[b];
    else 
    return 0;



    }

}
