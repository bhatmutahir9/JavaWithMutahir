public class Basics {
    public static void main(String[] args){
        System.out.println("Hi Mutahir Showket");
       /* Integral Numbers
       >> Byte,short,int,long  !! Need to write l With the long numbers  Ex 965345752467l
       >> Decimal Values = float,double !! REQUIRED TO WRITE f WITH FLOAT VALUE Ex 1009.996253f .This will roundoff it upto float range.
       >> Characters = Char
       >> Booleans = boolean
     */
        byte age = 21;
        short age0 = 23;
        int age1  = 22;
        long age2 = 24;
        System.out.println("Byte Max : "+Byte.MAX_VALUE); // Used to see the max and min value byte can store -128 to 127
        System.out.println("Byte Min : "+Byte.MIN_VALUE);
        System.out.println("Short Max : "+Short.MAX_VALUE); // Short min and max value -32768 to 32767
        System.out.println("Short Min : "+Short.MIN_VALUE);
        System.out.println("Int Max : "+Integer.MAX_VALUE); //Integer min and max value -2147483648 to 2147483647
        System.out.println("Int Min : "+Integer.MIN_VALUE);
        System.out.println("Long MIN : "+Long.MIN_VALUE); //Long min and max value -92233...to922337206....
        System.out.println("Long MAX : "+Long.MAX_VALUE);

        float salary =  9589.545754741f;
        double salary2 = 6895458.114554477554;
        System.out.println( "First Salary is : "+salary);
        System.out.println("Second Salary  is : "+salary2);
        System.out.println("Float MAX Value : "+Float.MAX_VALUE);
        System.out.println("Float Min Value : "+Float.MIN_VALUE);
        System.out.println("Double Min Value : "+Double.MIN_VALUE);
        System.out.println("Double Max Value : "+Double.MAX_VALUE);

        // Char
        char name = 'i';
        char heart = '\u2764'; //unicode representation
        char heart2 = (char) 10084;
        System.out.println(heart);
        System.out.println(heart2); // This approach will print any emoji or direct number if it's in range of char
        System.out.println(name);
        System.out.println((int)name); // TypeCastings
        // We need to typecast it to see the MIN & MAX Value of char
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        // Booleans
        boolean isEligible = true;
        System.out.println(isEligible);

       // Widening(Implicit) and Narrowing of datatypes

       byte byteValue =10; // 1 byte
       short shortValue = byteValue; //byte to short // 2 bytes
       int intValue = shortValue; // short to int // 4 bytes
       long longValue  = intValue; //int to long // 8 bytes
       float floatValue = longValue; // widening long to float // 4 bytes
        double doubleValue = floatValue; // float to double // 8 bytes
        System.out.println(byteValue); //10
        System.out.println(shortValue); //10
        System.out.println(intValue); // 10
        System.out.println(longValue); //10
        System.out.println(floatValue); // Prints 10.0 its widened
        System.out.println(doubleValue); // 10.0

        //int can be auto converted to float but float needs typecasting to convert
        // There will be data loss while narrowing because of limits in bytes
        double dblVlue = 123.78;
        float fltVlue = (float) dblVlue;
        int intVlue= (int) fltVlue; // Narrowing float to int
        System.out.println(dblVlue);
        System.out.println(fltVlue);
        System.out.println(intVlue); // Prints 9 it's narrowed

        // WIDENING OF CHAR INT FLOAT
        char charValue = 'A';
        int intValueChar = charValue;
        float FloatValueChar = intValueChar;
        System.out.println("Char is : "+ charValue);
        System.out.println("Int of Char 'A' is : "+ intValueChar);
        System.out.println("Float of Char 'A' is : "+ FloatValueChar);


        // Printing ASCII Values 0 to 127
        //for(int i = 1;i<127;i++){
          //  System.out.println((char)i); } // we need to use char otherwise it will print 1 to 127 numbers
    }
}
