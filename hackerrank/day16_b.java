int n=lengths.size();
    ArrayList<Integer> li=new ArrayList<Integer>();
  
   
     lengths.removeAll(Collections.singleton(0));
     Collections.sort(lengths); 
        while(lengths.size()>0)
        {
            int smallest = lengths.get(0); 
            for(int i =0 ;i < lengths.size();i++)
            {

                lengths.set(i, lengths.get(i) - smallest);
            }
            li.add(lengths.size());
            lengths.removeAll(Collections.singleton(0)); 
        }
        return li;
    }
}
