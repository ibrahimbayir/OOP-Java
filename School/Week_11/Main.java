package Week_11;

public class Main {
    public static void main(String[] args) {
        //  Animal obj = new Animal(); // you can not instantiate with using abstract classes
        Animal obj = new Cat();
        obj.animalSound();
        obj.sleep();
    }
}
