package Homework;

/**
 * 1. Calculate the sum of the first 100 numbers higher than 0.
 *
 * @author Alexandru Malic
 */

public class SumOfFirstNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Totalul este: " + sum);
    }
}
