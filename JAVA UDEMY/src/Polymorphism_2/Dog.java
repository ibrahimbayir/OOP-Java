package Polymorphism_2;

public class Dog extends Animal{
    private int breed;

    @Override
    public void eat() {
        System.out.println("Munch munch");
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
