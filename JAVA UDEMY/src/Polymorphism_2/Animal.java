package Polymorphism_2;

public class Animal {
    private String name;
    private String color;

    public void eat(){
        System.out.println("munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
