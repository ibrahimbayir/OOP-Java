package Week_6;

public class Circle {
    private double radius = 1.0;// direk default tanımladığımızicin constructorla ilgili bir meselemiz olmamış oluyor..
    private String color = "Red";

    public Circle(){//default constructor
    }

    public Circle(double r){
        this.radius = r;
    }

    public String toString(){
        return "Circle [radius=" + radius + ", color=" + color + "]";// bu string metodu objeyi tam anlamıyla yazdırmamaıza yarıyor
        //eger bu metot olmadan yazsak objenin adresini gösterirdi sadece
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
         return Math.PI * radius * radius;
    }








}
