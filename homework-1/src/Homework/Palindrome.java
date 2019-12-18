package Homework;

/**
 * 2. Check if a number is palindrome (e.g. 1221, 34143).
 *
 * @author Alexandru Malic
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int n = in.nextInt();
        int sum = 0, r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("Numarul introdus este palindrom");
        else
            System.out.println("Numarul introdus nu este palindrom");
    }
}
