package program;


public class Dog extends Animal {
    // This will give a compile-time error because you can't override a final method.
    public void Eat() {
        System.out.println("Dog is eating.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: Animal is eating.
    }
}