package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side 1: ");
        Triangle.a = sc.nextDouble();
        System.out.print("Side 2: ");
        Triangle.b = sc.nextDouble();
        System.out.print("Side 3: ");
        Triangle.c = sc.nextDouble();
        Triangle triangle = new Triangle();
        triangle.perimeter();
    }
}
