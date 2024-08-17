package Examprep;

public class Samsung extends MobilePhone {
    private String Contrast = "Strong";
    private int size;

    public Samsung(int id, String brand, int size, String contrast){
        super(id,brand);
        this.size = size;
        this.Contrast = contrast;
    }

    @Override
    public void Time() {
        System.out.println("No time exceeded now, congrats");
    }

    public int getSize() {
        return size;
    }

    public String getContrast() {
        return Contrast;
    }

    public void setContrast(String contrast) {
        Contrast = contrast;
    }
}
