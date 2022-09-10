package practice3;

import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int total = 0;
        if (n % 2 ==0) {
            for (int i = 2; i <= n; i += 2) {
                total += i;
            }
        }
        else {
            for (int j = 1; j <= n; j += 2) {
                total += j;
            }
        }
        System.out.println("The total to look for:" + total);
    }
}
