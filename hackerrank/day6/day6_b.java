int arr[]=new int[26];
        int start=0,end=0;
        int ans=Integer.MAX_VALUE;
        boolean newCharFound=false;
        while(end<coins.length())
        {
            newCharFound=false;
            arr[coins.charAt(end) - 'a']++;
            if(arr[coins.charAt(end) - 'a']==1)
                {
                    newCharFound=true;
                }
                
            while(arr[coins.charAt(start) - 'a']>1)
            {
                arr[coins.charAt(start) - 'a']--;
                start++;
            }
            
            if(newCharFound)
                {
                    ans=end - start +1;
                }
            else{
            ans=Math.min(ans , end - start +1);}
            end++;
        }
        return ans;
