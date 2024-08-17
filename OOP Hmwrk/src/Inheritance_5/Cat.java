package Inheritance_5;

public class Cat extends Mammal{

    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meooow");
    }

    public String toString() {
        return "Cat[Mammal[Animal[name = " + getName() + "]]]";
    }
}
