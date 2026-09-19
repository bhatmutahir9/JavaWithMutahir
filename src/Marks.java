import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the marks of 5 subjects");
        for(int i = 0 ; i<marks.length ; i++){
            System.out.println("Enter the marks of subject " + (i+1));
            marks[i] = sc.nextInt();
        }
    }
}
