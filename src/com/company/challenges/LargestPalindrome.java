package com.company.challenges;

public class LargestPalindrome {
    public static int Calculate(){
        //Generating variables
        String palindrome = "0";
        int highX = 0;
        int highY = 0;
        //Lowest number is 100 because we need the largest palindrome of three digits.
        int lowestNumber = 100;
        // x can't be smaller then the lowest number because then it would never add up to the largest product.
        for(int x = 999; x > lowestNumber; x--){
            // Current x and y added up together can never be smaller then the x and y of the previous palindrome.
            // It could never add up to the largest number.
            for (int y = 999; (y + x) > (highX + highY); y--){
                String z = String.valueOf(x*y);
                if (z.equals(new StringBuilder(z).reverse().toString())){
                    highX = x;
                    highY = y;
                    lowestNumber = Math.min(x, y);
                    palindrome = z;
                }
            }
        }
        return Integer.valueOf(palindrome);
    }
}
