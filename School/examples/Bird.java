package examples;

public class Bird extends Animal{
    public String name;

    public Bird(){

    }

    public Bird(String name, int kanatSayisi, String tür){
         super(kanatSayisi,tür);
        this.name = name;
    }

    public void Fly(){
        System.out.println("The bird flyss always");
    }
}
