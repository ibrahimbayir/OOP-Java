package Inheritance_5;

public class Dog extends Mammal{

    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Wooof");
    }

    public void greets(Dog another){
        System.out.println("Wooofff");
    }

    @Override
    public String toString() {
        return "Dog[Mammal[Animal[name = " + getName() + "]]]";
    }
}
