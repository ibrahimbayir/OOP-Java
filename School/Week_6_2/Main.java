package Week_6_2;

public class Main {
    public static void main(String[] args) {
        Circle obj_1 = new Circle();

        Circle obj_2 = new Circle(5.0);

        Circle obj_3 = new Circle(6,"Red");

        obj_2.setColor("blue");
        // System.out.println(obj_2);

        obj_2.setRadius(10);
        //System.out.println(obj_2);

        System.out.println(obj_1);
        System.out.println(obj_1.getArea());
        System.out.println("Circumference is obj_1 = "+ 2 * Math.PI * obj_1.getRadius());

        System.out.println(obj_2);
        System.out.println(obj_2.getArea());
        System.out.println("Circumference is obj_2 = "+ 2 * Math.PI * obj_2.getRadius());

        System.out.println(obj_3);
        System.out.println("The area is " + obj_3.getArea());
        System.out.println("Circumference is obj_3 = "+ 2 * Math.PI * obj_3.getRadius());
    }


}
