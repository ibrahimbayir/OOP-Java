package Examples;

public class Hi {
    public int x = 5;
    public String isim;
    public String soyIsim;
    public double y;
    private String caption = "Selamlar ";

    public Hi(){
        System.out.println("Here is the first Constructor");
        this.x = x;
    }

    public Hi(String isim, String soyIsim){
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public Hi(String isim, String soyIsim, double y){
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.y = y;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }
}
