package com.company.challenges;

public class Fibonacci {

    public static int Calculate(int a, int b, int sum){
        //Oneliner
        return (b< 4_000_000 ? (b%2 != 0 ? Calculate(b, a + b, sum) : Calculate(b, a + b, sum + b)) : sum);

        //If its lower then 4m, just continue to dive deeper into the method and keep adding the equal numbers.
        /*if(b < 4_000_000){
            //If b mod 2 == 0, it means it's an equal number. If that's the case, just add it to the sum.
            sum = (b%2 != 0 ? Calculate(b, a + b, sum) : Calculate(b, a + b, sum + b));
        }
        System.out.println(sum);
        return sum;*/

        //For more pretty code, this can also be used:
        /*if (b % 2 != 0) {
            sum = Calculate(b, a + b, sum);
        }
        else {
            sum = Calculate(b, a + b, sum + b);

        }*/
    }
}




