package practice3;

import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Count: ");
        int number = sc.nextInt();
        while (number <= 0) {
            System.out.println("Count fail");
            System.out.print("Count: ");
            number = sc.nextInt();
        }
        int[] theNumbers = new int[number];
        System.out.println("The numbers: ");
        for (int i = 0; i < number; i++) {
            theNumbers[i] = sc.nextInt();
        }

        int max = theNumbers[0];
        int min = theNumbers[0];
        for (int num : theNumbers) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}

