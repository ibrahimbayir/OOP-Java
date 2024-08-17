package overloading;

public class Calculator {
	public int sayi1,sayi2;
	public int sayi3,sayi4;

	public void add(int sayi1, int sayi2){//aynı metotlar ssadece parametreleri farklı compile edildiginde kod bunu anlayacak
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam : " + toplam);
    }

    public void add(int sayi1,int sayi2,int sayi3){ // ilk yol paramtre adet farkıyla ortaya çıkar
        int toplam1= sayi1 + sayi2 + sayi3;
        System.out.println("Yeni toplam : "+toplam1);
    }

    public double add(double sayi1,double sayi2,double sayi3){ // İkinci yol paramtre türleri farkıyla ortaya çıkar
        double toplam1= sayi1 + sayi2 + sayi3;
        System.out.println("Yeni toplam : ");
        return toplam1;
    }
    public double add(double sayi1, double sayi2){
        double toplam2 = sayi1 + sayi2;
        System.out.println("Yeni toplam : ");
        return toplam2;
    }
}
