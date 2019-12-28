package Homework;

/**
 * 3. Input the dimensions of a rectangle(Length, Width) and display area and perimeter.
 * Produce an error message if the length or width are negative.
 *
 * @author Alexandru Malic
 */

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea:");
        int x = sc.nextInt();
        System.out.println("Introduceti latimea:");
        int y = sc.nextInt();
        int aria = x * y;
        int perimetru = 2 * (x + y);

        if (x > 0 && y > 0) {
            System.out.println("Aria triunghiului este:" + aria);
            System.out.println("Perimetrul este: " + perimetru);
        } else {
            System.out.println("Laturile trebuie sa fie mai mari decat zero!");
        }
    }
}