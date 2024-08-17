package Examples;


public class Main {
    public static void main(String[] args) {
        Hi object_1 = new Hi();

       // System.out.println(object_1.getCaption());
       // object_1.setCaption("ARTIK SELAM SABAH YOK KİMSEYE");
        System.out.println(object_1.getCaption());//private alandan veriyi bu sekilde bu metotlarla içeri çekmiş oluyoruz..

        Hi object_2 = new Hi("İbrahim"," Bayır");
        System.out.println(object_2.isim + object_2.soyIsim);

        Hi object_3 = new Hi("Eren"," Saylık ",45.45);
        System.out.println(object_3.isim + object_3.soyIsim + object_3.y);


    }
}
