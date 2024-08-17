package Encapsulation;

public class Main
{
    public static void main(String[] args) {

            Person person = new Person();//obje oluşturduk
            person.firstName = "İbrahim";
            person.lastName = "Bayır";
            person.age = 25;
          //  person.email ="ibrahim54gfb@outlook.com"; //private tanımladığım için hata veriyor...

            //System.out.println(person.firstName + " " + person.lastName + " " + person.age);
            person.setEmail("ibrahim54gfb@ghmail.com");
            System.out.println(person.getEmail());

            person.setEmail("erensaylik.gma,l.com");
            System.out.println(person.getEmail());
    }

}
