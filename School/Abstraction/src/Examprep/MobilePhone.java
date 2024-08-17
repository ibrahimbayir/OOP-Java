package Examprep;

public class MobilePhone {
    private int id;
    public String brand;

    public MobilePhone(){}
    public MobilePhone(int id, String brand){
        this.id = id;
        this.brand = brand;
    }

    public void Time(){
        System.out.println("This function warns about how much you use your phone");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }
}
