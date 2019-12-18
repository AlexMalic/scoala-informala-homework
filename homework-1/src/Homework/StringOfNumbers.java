package Homework;

/**
 * 5. Input 2 values:  start  and  finish, then display the numbers from start to finish.
 *
 * @author Alexandru Malic
 */

import java.util.Scanner;

public class StringOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduceti numarul de start: ");
        int start = scan.nextInt();

        System.out.println("Introduceti numarul de finish: ");
        int end = scan.nextInt();
        if (start < end)
            for (int i = start; i <= end; i++)
                System.out.print(i + " ");

        else if (start > end)
            for (int i = start; i >= end; i--)
                System.out.print(i + " ");
    }
}
