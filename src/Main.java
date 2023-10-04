public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1 == c2) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        Complex c3 = c1;

        if (c3 == c1) {
            System.out.println("c3 == c1. Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}