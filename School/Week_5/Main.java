package Week_5;

public class Main
{
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Integer y = new Integer();

        //Car myCar2;//two ways of creating an object the first way
        //myCar2 = new Car();//The second way
        //myCar2 = new Car("I am the second one ...");

        Car myCar2 = new Car("I am an object number : ", 1);
        Car myCar3 = new Car("I am an object number : ", 2);
        Car myCar4 = new Car("I am an object number : ", 3);

        System.out.println(myCar1);//sadece memorydeki adresi veriyor...



    }

}
