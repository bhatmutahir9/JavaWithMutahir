interface Animal2 {
    void run();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal implements Animal2 {

    void bark() {
        System.out.println("Dog is barking");
    }

    public void run() {
        System.out.println("Dog is running");
    }
}

class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.eat();
        dog1.bark();
        dog1.run();
    }
}