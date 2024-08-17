package Week_7;

public class Main {
    public static void main(String[] args) {
       B obj_b = new B();
      /*  obj_b.method_B();
        obj_b.method_1();
        obj_b.method_2();
*/
        C objC = new C();
        objC.method_B();
        objC.method_1();
        objC.method_2();
        System.out.println("");

        D objD = new D();
        objD.method_D();
        objD.methodC();
        objD.method_1();

    }
}
