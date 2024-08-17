package Examprep;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(23,"apple",6,3);
        apple.Time();

        Samsung samsung = new Samsung(24,"Samsung",7,"Strong");
        samsung.Time();
        System.out.println(samsung.getContrast());
        System.out.println(samsung.getId());

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setBrand("Huawei");
        System.out.println(mobilePhone.getBrand());
        mobilePhone.Time();
    }
}
