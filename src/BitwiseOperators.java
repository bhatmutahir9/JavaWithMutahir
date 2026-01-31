public class BitwiseOperators {
    public static void main(String[] args) {
        // Computers stores data in 0's & 1's form called Binary Numbers
        // Bitwise operations can be implemented only on integral nums ex. byte short int long Not on Decimal values
        /*list of bitwise Operators >>
        AND = & -When both values are 1 it will return 1
        OR = || -When atleast one bit should be 1 it will return 1
        NOT = ~ -It Converts 1 to 0 and 0 to 1
        XOR = ^ -If Two bits are different it will return 1 if same then 0
        LEFT SHIFT << ,
        RIGHT SHIGT >> , UNSIGNED RIGHTSHIFT = >>>.
        */

        int ANDex = 5 & 4;
        System.out.println("Value of AND operation : "+ANDex);
        /* this will print 4 Explaination 5 and 4 will be converted
        // to binary numbers then multiplied it will give 4 like binary of 4 is 100 and 5 is 101
        multiplied value = 100 i,e 4 */

        int NOTex = 5;
        int C  = ~NOTex;
        System.out.println("Value of NOTex is : "+C);
        System.out.println(Integer.toBinaryString(C)); // in it's output you can see the 0's are converted to 1's

        int ORex = 5 | 7;
        System.out.println("Value of OR Operation : "+ORex);

        int LeftShift = 4; // This is used to shift the bits eg 4 has 100 Binary value it is shifted by 1 means its 1000 i,e = 8
        System.out.println("Initial Value befor LeftShift : "+LeftShift);
        int leftshifted = LeftShift << 1;
        System.out.println("Value after Left Shift : "+leftshifted);

        int RightShift = 5;
        System.out.println("Value before right shift : "+ RightShift);
        int rightshifted = RightShift >> 1;
        System.out.println("Value after RightShift by 1 is : "+rightshifted);


        //BELOW IS CONVERSION EXAMPLE
        System.out.println("Binary of 5 is : "+Integer.toBinaryString(5));
        System.out.println("Binary of 4 is : "+Integer.toBinaryString(4));
        // below is just normal example
        int a =10;
        System.out.println(Integer.toBinaryString(a)); // Output = 1010
    }
}
