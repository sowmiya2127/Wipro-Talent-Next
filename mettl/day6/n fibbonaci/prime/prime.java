int n=input1;
for (i = 2; i <= n / 2; ++i) {

        // condition for non-prime
        if (n % i == 0) {
            flag = 1;
            break;
        }
    }

    if (n == 1) {
        return 2;
    }
    else {
        if (flag == 0)
            return 2;
        else
           return 1;
    }

    return 0;
}
