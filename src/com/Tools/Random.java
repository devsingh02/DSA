// Random number between [min, max]
package com.Tools;

import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static void main(String[] args) {
        int min = 10, max = 100;
        int random_1 = ThreadLocalRandom.current().nextInt(min, max+1); // == substring
        int random_2 = min + (int)(Math.random()*(max-min + 1));
        System.out.println("Method 1 :" + random_1 + "\nMethod 2 : " + random_2);
    }
}
