
    public static int maxXor(int lo, int hi, int k) {
    // Write your code here
  int x=0,gr=0;
     for(int i=lo;i<hi;i++)
     {
         for(int j=hi;j>lo;j--)
         {
             x=i^j;
             if(gr<x && x<=k)
                gr=x;
            }
         }
     
     return gr;
    }

}
