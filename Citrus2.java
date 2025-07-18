public class Citrus2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 5;
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("There are two real roots.");
        } else if (discriminant < 0) {
            System.out.println("There are zero real roots.");
        } else {
            System.out.println("There is one real root.");
        }
    }
}