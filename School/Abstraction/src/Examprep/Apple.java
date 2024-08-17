package Examprep;

public class Apple extends MobilePhone{
    private  int size = 6;
    private int numberOfCamera = 3;

    public Apple(int id, String brand, int size, int numberOfCamera){
        super(id,brand);
        this.size = size;
        this.numberOfCamera = numberOfCamera;
    }

    @Override
    public void Time() {
        System.out.println("You exceed the limit of defined time");
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfCamera() {
        return numberOfCamera;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumberOfCamera(int numberOfCamera) {
        this.numberOfCamera = numberOfCamera;
    }
}
