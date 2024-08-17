package Week_9_2;

public class Shape { //this is the superclass what we inherit others
    private String color = "red";
    private boolean filled = true;

    public Shape(){

    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    @Override
    public String toString() {
        return "[color =  ," + color + " filled = " + filled + "]";
    }
}
