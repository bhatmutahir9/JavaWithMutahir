import java.util.Scanner; // Date of Exp 27July2026 Submission 3Aug2026
public class Exp01 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = Sc.nextInt();
        System.out.println("Enter first number ");
        int b = Sc.nextInt();
        System.out.println("Output After Addition of a and b " + (a + b));
        System.out.println("Output After Subtraction of a and b " + (a - b));
        System.out.println("Output After Multiplication of a and b " + (a * b));
        System.out.println("Output After Division of a and b " + (a / b));
        Sc.close();
    }
}
