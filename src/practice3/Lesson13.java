package practice3;

import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        System.out.println("The total to look for: " + total);
    }
}
