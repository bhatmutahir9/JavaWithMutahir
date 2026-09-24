public class LearningStrings {
  public static void main(String[] args) {
    String name = new String("Mutahir");
    String name2 = "     MUTAHIR     "; // Normal way to declare String 
    System.out.println(name.length()); // find the length of a String
    System.out.println(name.charAt(5)); // find and specific character from  a string 
    System.out.println(name.substring(1,5)); // find substring of a string
    System.out.println(name.equals(name2)); // compares 2 strings
    System.out.println(name.equalsIgnoreCase(name2)); // this will ignore the cases 
    System.out.println(name.toUpperCase()); // changes to uppercase
    System.out.println(name2.toLowerCase()); // to lowercase 
    System.out.println(name.contains("hir"));
    System.out.println(name.indexOf("i")); // prints the index of a character 
    System.out.println(name2.trim()); // trims extra spaces 
    System.out.println(name2.replace(name2, name));
   }
}
