package triangle;

public class Triangle {
    public static double a;
    public static double b;
    public static double c;

    public void perimeter() {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle is right!");
            System.out.println("Perimeter of triangle: " + (a + b + c));
        }
        else {
            System.out.println("The triangle is fail. Please rerun the Java!");
        }
    }

}
