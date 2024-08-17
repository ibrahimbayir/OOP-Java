package example;

public class main {
    public static void main(String[] args) {
        Pc pc = new Pc();

            pc.setModelYear(2022);
            pc.setName("Macbook Air M2");
            pc.setPrice(24500);

        System.out.println(pc.getName());
        System.out.println(pc.getPrice());
        System.out.println(pc.getModelYear());
    }
}
