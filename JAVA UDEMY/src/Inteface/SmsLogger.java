package Inteface;

public class SmsLogger implements Logger{// Eğer ki log methodunu override etmese hata verir
    @Override
    public void log() {
        System.out.println("Sms has been sent");
    }
}
