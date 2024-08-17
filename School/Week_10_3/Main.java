package Week_10_3;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal h = new Herbivores();// upcasting
        Animal o = new Omnivores();
        Animal c = new Carnivores();

        a.eat();
        h.eat();
        o.eat();
        c.eat(); 
    }


}
