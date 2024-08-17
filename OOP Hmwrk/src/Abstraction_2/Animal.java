package Abstraction_2;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public  void greets(){
        System.out.println("ABSTRACT");
    }
}
