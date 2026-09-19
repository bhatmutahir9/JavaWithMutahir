public class ArithmeticOperations {
    public static void main(String[] args) {
        int income  = 55000;
        int expenses = 6050;
        int balance = income - expenses;
        System.out.println("Remaining Balance is : "+balance);

        int a = 15;
        int b = 2;
        int c = a % b; // modulus ( % )is used to get the remainder of a number
        System.out.println("Reminader is : "+c);

        int d = 10;
        double v = d + 15.7; // This is a literal(Direct Value)
        System.out.println(v);

        // Expressions   >> Operator Precedence
        int exp = 4+5*3; // * ist then +
        int a2 = 10;
        int b2 = 5;
        int result = a2 / b2 *3; // left to right precedence / then *
        System.out.println(result);
        System.out.println(exp);

        // prefix and post fix
        int postfix = 10;
        int res = postfix++ + postfix; // 10 + 11 = 21
        System.out.println(res);
        int prefix = 10;
        int reS = ++prefix + prefix; // 11 + 11 = 22
        System.out.println(reS);
    }

}
