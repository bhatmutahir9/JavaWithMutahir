public class Nestedif {

    public static void main(String[] args) {
        int marks = 87;
        double attendence = 75.6;
        int project_marks = 65;
        if(marks>=60 && attendence>=75 && project_marks>=50){
            System.out.println("Eligible for Placements ");
        }else {
            System.out.println("Not Eligible ");
        }
    }
}
