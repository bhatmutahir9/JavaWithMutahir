 import java.util.Scanner;
 public class ArrayPractice{
//   public static void main(String[] args) {
//     Scanner Sc = new Scanner(System.in);
//     int[] marks = new int[7];
//     int sum = 0;
//     for(int i = 0; i < marks.length;i++){
//       System.out.print("Enter the marks of subject " + i + " : ");
//       marks[i] = Sc.nextInt();
//       sum = sum + marks[i];
//     }
//     System.out.print("Total Marks : " + sum);
//     Sc.close();
//   }

public static void main(String[] args) {
  int[] numbers = {55,98,101,97};
  int max = numbers[0];
 for( int number : numbers){
  if(number > max){
    max = number;
  }
 }
 System.out.println(max+" : is the largest number");
   }
}