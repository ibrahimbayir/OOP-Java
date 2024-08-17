package Examprep;

public abstract class Animal {
    int age;
    String name;

    public abstract void make();

    public void makeNoise(){
        System.out.println("THE METHOD");
    }
}
