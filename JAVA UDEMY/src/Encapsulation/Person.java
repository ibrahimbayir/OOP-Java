package Encapsulation;

public class Person {
    //Attributes
    public String firstName;
    public String lastName;
    public int age;
    private String email;

    public String getEmail() {// değerini return ediyor
        return email;
    }

    public void setEmail(String email) {//değerini atamasını yapıyor...
       // this.email = email;
        if(email.contains("@")){
            this.email = email;
        }
        else{
            this.email = "Invalid e-mail...";
        }
    }


}
