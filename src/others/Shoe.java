package others;

public class Shoe {
    public static void main(String[] args) {
        Brand brand;
        brand = () -> "Nike";
        System.out.println("The others.Brand is " + brand.getBrand());
    }
}
