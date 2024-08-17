package Week_10_2;

public class Shape {
    public void area(){
        System.out.println("Find area...");
    }
    public void area(int r){//THis is the method overloading
        System.out.println("Circle area :" + Math.PI*r*r);
    }
    public void area(double b, double h){
        System.out.println("Find the triangle area : " + (b*h)/2);
    }
    public void area(int i, int w){
        System.out.println("Find the rectangle area : " + i*w);
    }

}
