public class Hello {

    public static double trapazoid(double a, double b, double height) {

        double area;

        double s1 = a + b;
        double s2 = s1/2;
        area = s2*height;

        return area;

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(trapazoid(10,20,30));
    }

}

