package com.company.challenges;

public class SmallestMultiple {
    public static int Calculate(){
        //Divisible by amount of numbers: 1 - ....
        int amount = 20;

        // In the challenge it was listed that 2520 is the lowest number that can be
        // Divisible by 1-10. So because of this, we start here at that number for this challenge.
        // If the amount gets edited, also consider editing this number.
        for (double x = 2520; x < Integer.MAX_VALUE; x++){
            int counter = 0;
            for (double y = 1; y <= amount; y++){
                double z = x/y;
                //Math.floor rounds the number down from 1.11 to 1 for example.
                if (z == Math.floor(z)){
                    counter++;
                    if (counter == amount){
                        return (int)x;
                    }
                }
                //We can break this loop if Math.floor != z because the number will never be divisible by all 20 numbers anymore.
                // Its a small optimization.
                else{
                    break;
                }
            }
        }
        return 0;
    }
}
