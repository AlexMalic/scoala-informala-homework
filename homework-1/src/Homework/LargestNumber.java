package Homework;

/**
 * 4. Input 3 numbers, and display the biggest.
 *
 * @author Alexandru Malic
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Introduceti trei numere distincte:");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
            System.out.println("Primul numar introdus este cel mai mare");
        else if (y > x && y > z)
            System.out.println("Al doilea numar introdus este cel mai mare");
        else if (z > x && z > y)
            System.out.println("Al treilea numar introdus este cel mai mare");
        else
            System.out.println("Numerele introduse nu sunt distincte!");
    }
}
