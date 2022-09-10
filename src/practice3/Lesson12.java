package practice3;

public class Lesson12 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0) {
                total += i;
            }
        }
        System.out.println("The total to look for:" + total);

    }
}
