package Abstraction_2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("şapşo");
        dog.greets();

        Cat cat = new Cat("paşa");
        cat.greets();

        BigDog bigDog = new BigDog("kangal");
        bigDog.greets(bigDog);
        bigDog.greets();

    }
}
