public static int stockPairs(List<Integer> stocksProfit, long target) {
    // Write your code here
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    int z=0;
    for(int i=0;i<stocksProfit.size();i++){
        int a=stocksProfit.get(i);
        for(int j=i+1;j<stocksProfit.size();j++){
            int b=stocksProfit.get(j);
            if((a+b)==target){
                String s1=a+" "+b;
                String s2=b+" "+a;
                map.put(s1,1);
                if(a==b){
                    z++;
                }
                map.put(s2,1);
            }
        }
    }
    return map.size()/2+z;
    }
