import java.util.*;
public class ParameterizedConstructor {
    String name;
    int marks;
    ParameterizedConstructor(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.marks);
    }

public static void main(String[] args) {
    ParameterizedConstructor ob1 = new ParameterizedConstructor("Mutahir", 98);
    ob1.display();
 }
}