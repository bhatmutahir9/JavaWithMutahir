public class Constructor {
    String name;
    int age ;
    Constructor(){
        System.out.println("This is a constructor");
    }
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public static void main(String[] args) {
        Constructor s1 = new Constructor();
        s1.name = "Mutahir";
        s1.age = 22;
        s1.info();
    }

}
