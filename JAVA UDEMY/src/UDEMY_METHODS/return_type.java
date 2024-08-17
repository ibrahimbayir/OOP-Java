package UDEMY_METHODS;

public class return_type
{   /*
    public static int ikiilecarp(int a){
       return a = 2 * a;
    }
    public static int ikiiletopla(int a){
        return a = a + 2;
    }
    public static int dortilecarp(int a){
        return a = 4 * a;
    }

    public static void main(String[] args) {
        System.out.println("Sonuç : " +  dortilecarp( ikiiletopla(ikiilecarp(8))));
    }
    */
    public static void fibonacci(int n) {
        int previous = 0;
        int current = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(previous + " ");
            int next = previous + current;
            previous = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}
