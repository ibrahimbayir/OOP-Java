package examples;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.Fly();
        // Bird bird = new Bird("Muhabbet kusu",3,"memeli");
        System.out.println(bird.getKanatSayisi());
    }
}
