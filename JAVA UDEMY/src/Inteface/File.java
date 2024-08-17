package Inteface;

public class File implements Logger{
    @Override
    public void log() {
        System.out.println("Logged to the file");
    }
}
