package com.company.challenges;


public final class Sum_square_difference {
    // This method calculates the difference between the (sum)square and sum square of all the numbers.
    public static int SumSquare(int n) {
        int sum = 0;
        int square = 0;
        for(int x = 0; x <= n; x++){
            sum+=x;
            square += x * x;
        }
        return  sum * sum - square;

    }
}
