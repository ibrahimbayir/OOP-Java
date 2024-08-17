package Inheritance_2;

public class Person {
    private String name;
    private String adress;

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ']';
    }
}
