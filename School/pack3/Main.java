package pack3;

public class Main
{
   public void fullThrottle(){
       System.out.println("FullThrottle");
   }
   public void mySpeedMethod(){
       System.out.println("Speed");
   }
    public static void main(String[] args) {

       Main car = new Main();
       car.fullThrottle();
       car.mySpeedMethod();
    }
}
