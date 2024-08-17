package examples;

public class Falcon extends Animal{
    public int eyes ;

    public Falcon(int eyes, int kanatSayisi, String tür){
        super(kanatSayisi,tür);
        this.eyes = eyes;
    }

    public void Savage(){
        System.out.println("Falcon is a savage and omnivore...");
    }
}
