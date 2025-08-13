public class assignmentoperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a += b; // a = a + b
        System.out.println("Addition: " + a);
        a -= b; // a = a - b
        System.out.println("Subtraction: " + a);
        a *= b; // a = a * b
        System.out.println("Multiplication: " + a);
        a /= b; // a = a / b
        System.out.println("Division: " + a);
        a %= b; // a = a % b
        System.out.println("Modulus: " + a);
    }
}
