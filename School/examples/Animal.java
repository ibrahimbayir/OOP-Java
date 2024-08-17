package examples;

public class Animal {
    private int kanatSayisi  = 2;
    public String tür = "Memeli";

    public Animal(int kanatSayisi, String tür){
        this.kanatSayisi = kanatSayisi;
        this.tür = tür;
    }

    public Animal(){
        System.out.println("You are in the baseclass");
    }

    public int getKanatSayisi() {
        return kanatSayisi;
    }
}
