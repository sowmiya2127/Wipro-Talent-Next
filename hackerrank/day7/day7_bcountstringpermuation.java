public static int countPerms(int n) {
    // Write your code here
         if (n == 1) return 5;

        long mod = 1000000007L;

        //aeiou corresponds to 01234
        long[] previous = new long[5];
        long[] current = new long[5];

        long sumPrevious = 4;
        for (int j = 0; j < 5; j++) previous[j] = 1;

        for (int i = 2; i <= n; i++)
        {
            //a
            current[0] = previous[1];
            //e
            current[1] = (previous[0] + previous[2]) % mod;
            //i
            current[2] = sumPrevious;
            //o
            current[3] = (previous[2] + previous[4]) % mod;
            //u
            current[4] = previous[0];

            sumPrevious = 0;
            for (int j = 0; j < 5; j++)
            {
                previous[j] = current[j];
                if (j != 2) sumPrevious += previous[j];
            }
            sumPrevious %= mod;
        }

        long result = (current[0] + current[1] + current[2] + current[3] + current[4]) % mod;

        return (int)result;
    }


    }
