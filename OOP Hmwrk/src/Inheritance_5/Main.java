package Inheritance_5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("ali");
        System.out.println(animal);

        Mammal mammal = new Mammal("veli");
        System.out.println(mammal);

        Cat cat = new Cat("faik");
        System.out.println(cat);

        Dog dog = new Dog("sait");
        dog.greets();
        dog.greets(dog);
        System.out.println(dog);
    }
}
