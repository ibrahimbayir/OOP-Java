package Polymorphism_2;

public class Main {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        myanimal.eat();

        Animal dog = new Dog();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
    }
}
