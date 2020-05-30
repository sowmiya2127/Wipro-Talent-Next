  public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
    // Write your code here
int n = wallPositions.size();
        int m = wallHeights.size();
        int max = 0;

        for (int i=0; i<n-1; i++) {
            if (wallPositions.get(i)<wallPositions.get(i+1)-1) {
                // We have a gap
                int heightDiff =  Math.abs(wallHeights.get(i+1) - wallHeights.get(i));
                int gapLen = wallPositions.get(i+1) - wallPositions.get(i) - 1;
                int localMax = 0;
                if (gapLen > heightDiff) {
                    int low = Math.max(wallHeights.get(i+1), wallHeights.get(i))+ 1;
                    int remainingGap = gapLen - heightDiff - 1;
                    localMax = low + remainingGap/2;

                } else {
                    localMax = Math.min(wallHeights.get(i+1), wallHeights.get(i)) + gapLen;
                }

                max = Math.max(max, localMax);
            }
        }

        return max;

    
    }

}
