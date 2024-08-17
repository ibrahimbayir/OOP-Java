package Week_9;

public class Main {
    public static void main(String[] args) {
       Person obj = new Person("efe","pendik");


        Student p = new Student("ibrahim","kuştepe","Matematik",2002,45.00);
        System.out.println(p.getFee());
        System.out.println(p.getName() + p.getAdress() + p.getProgram());
    }



}
