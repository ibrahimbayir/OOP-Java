package Week_9;

public class Person{
    private String name;
    private String adress;

    public Person(String name , String adress){
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }


    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public String toString() {
        return super.toString();
    }
}
