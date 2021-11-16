package com.company.challenges;

public class SmallestMultiple {



    public static int Calculate(){
        int max = 2147483647;
        for (double x = 2520; x < max; x++){
            int counter = 0;
            for (double y = 1; y <= 20; y++){
                double z = x/y;
                if (z == Math.floor(z)){
                    counter++;
                    if (counter == 20){
                        return (int)x;
                    }
                }
                else{
                    break;
                }
            }
        }
        return 0;
    }
}
