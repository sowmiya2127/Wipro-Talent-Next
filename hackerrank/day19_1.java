public static String lastLetters(String word) {
    // Write your code here
      String s;
      char last,prelast;
      int n;
      char[] list=word.toCharArray();
      n=list.length;
      last=list[n-1];
      prelast=list[n-2];
      s = last+" "+prelast;
     Arrays.toString(s.toCharArray());
     return s;
    }
    }
