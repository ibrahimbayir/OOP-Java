package pack2;
public class main
{
    static void myStaticMethod(){
        System.out.println("my static method.");
    }
    public void myPublicMethod(){
        System.out.println("my public method");
    }

    public static void main(String[] args) {
        //initialize , instantiete
       // myPublicMethod();//but if you wanna work with public you have to create object..
        myStaticMethod();//static methods can be called witxhout creating any error so you dont have to create an object
        main obj = new main();
        obj.myPublicMethod();//object halinde...
        obj.myStaticMethod();
    }
}
