package com.company.challenges;

public class MultiplesOf3And5 {
    public static int solution(int number) {
        int total = 0;
        //Every number that's divisible by 3 or 5 (number mod 3 == 0  || number mod 5 == 0, is added to the total list.)
        for (int x = number-1; x > 0; x--){
            if (x%3 == 0 || x%5 == 0){
                total+= x;
            }
        }
        return total;
    }
}
