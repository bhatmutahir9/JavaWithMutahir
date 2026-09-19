import java.util.*;
public class Overloading {
    public void add(int m, int i){
        System.out.println("Sum of first method : "+(m+i));
    }
    public void add(double m, double i, double g){
        System.out.println("Sum of 2nd method :"+(m+i+g));
    }
    public static void main(String[] args) {
        Overloading ob1 = new Overloading();
        System.out.println("Results of overloading methods :");
        ob1.add(7, 13);
        ob1.add(13, 9, 7);
    }
}
