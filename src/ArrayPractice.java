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

// Finding largest using for loop 

// public class maxnum{
//   public static void main(String[] args){
//     int[] nums = {44,78,101,0124,454,8787,546};
//     int max = nums[0];
//     for( int idx = 0 ; num < nums.length; num++){
//       if(nums[idx] > max){
//         max = nums[idx];
//       }
//     }
//     System.out.print(max+" : is the largest number");
//   }
// }

// find the min number 

// public class minnum{
//   public static void main(String[] args){
//     int[] nums = {32,98,56,457,45,101};
//     int min = nums[0];
//     for(int num : nums){
//       if(num < min){
//         min = num;
//       }
//     }
//     System.out.print(min);
//   }
// }

// Even Odd 
// public class evenOdd{
//   public static void main(String[] args){
//     int[] nums = {32,98,56,457,45,101,22};
//     int even = 0;
//     int odd = 0;
//     for(int num : nums){
//       if(num % 2 == 0){
//         even++;
//       }
//         else {
//         odd ++; 
//         }
//     }
//     System.out.println ("Even Nums : "+even);
//     System.out.print("Odd Nums : "+odd);
//   }
// }

// linear search 
// public class linearSearch{
//   public static void main(String[] args){
//     int[] nums = {32,98,56,457,45,101,913,22};
//     int target = 913;
//     boolean found = false; // taking it false until found
//     for(int num : nums){
//       if (num == target){
//        found = true;
//        break;
//       }
//     }
//     System.out.println (found);
//   }
// }
 
// find the avg of array elements 
// public static void main(String[] args) {
//       int[] nums = {10,25,30};
//       int sum = 0;
//       for(int num : nums){
//         sum += num; // 0 + 10 , 10 + 25, 35 + 30 , sum becomes 65
//       }
//       double average = sum/nums.length;
//       System.out.println("Avg of array : " + average);
//     }

// program for checking duplicate values 
// public static void main(String[] args) {
//    int[] numbers = {10, 50, 30, 40,10};
//    for(int i=0; i<numbers.length;i++){
//     for(int j = 0;j<numbers.length;j++){
//       if(i != j && numbers[i] == numbers[j]) { //  i != j means indices are not same         
//      System.out.println("Duplicat numbers found which is  : " + numbers[i] + " at indices " + i + " and "+ j );;
//       }
//     }
//    }
//   }