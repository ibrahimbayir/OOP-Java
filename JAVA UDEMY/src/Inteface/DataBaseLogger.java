package Inteface;

public class DataBaseLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Logged to the database");
    }
}
