package practice3;

import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        System.out.println("ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions! ");
            }
           else {
                System.out.println("The equation has no solution!");
            }
        }
        else {
            System.out.println("x = " + (-b / a));
        }
    }
}
