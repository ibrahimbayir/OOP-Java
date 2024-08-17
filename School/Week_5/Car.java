package Week_5;

public class Car
{
    String name = "GM";
    String model ="GM";
    int year= 2000;

    public Car()
    {
        System.out.println("I am being instantiated now....");
    }
    public Car(String a,int x) {
        System.out.println(a + " " + x);
    }
   // public Car(int x){ //constructor overloading????}
}
