class Result {
  public static int arraySum(List<Integer> numbers) {
  int n=0;
   for(int i: numbers)
    {
        n+=i;
        //array value gets assigned to the i and the loop gets iterated
    }
        return n; //Value gets returned
  }
}
