package UDEMY_METHODS;

public class asalMi
{
    public static boolean asalMi(int sayi){
        for(int i = 2; i < sayi; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
// 1'den 1000 e kadar asal sayıları gösteren program
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++){
            if (asalMi(i)){
                System.out.println(i);
            }
        }
    }
}
