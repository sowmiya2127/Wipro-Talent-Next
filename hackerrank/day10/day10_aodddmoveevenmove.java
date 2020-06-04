int oddmove = 0;
            int evenmove = 0;
        
        for(int i = 0; i < arr.size() ; i++){
            int left = (i > 0)? arr.get(i-1): Integer.MAX_VALUE;
            int right = (i < arr.size() -1)? arr.get(i+1): Integer.MAX_VALUE;
            
            if(i % 2 == 0){
                if(arr.get(i) < Math.min(left, right))
                    continue; 
                else if(arr.get(i) >= Math.min(left, right))
                    evenmove += arr.get(i) - (Math.min(left, right) -1);
                else if (arr.get(i) >= Math.max(left, right))
                    evenmove += arr.get(i) - (Math.max(left, right) -1);   
                
                return evenmove;
            }
        
            if(i % 2 == 1){
                if(arr.get(i) < Math.min(left, right))
                    continue; 
                else if(arr.get(i) >= Math.min(left, right))
                    oddmove += arr.get(i) - (Math.min(left, right) -1);
                else if (arr.get(i) >= Math.max(left, right))
                    oddmove += arr.get(i) - (Math.max(left, right) -1);
