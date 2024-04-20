package factory;

public class Restaurant {
    public static void main(String[] args) {
        Cooking friedRice = RestaurantFactory.createInstance("king prawn rice");
        System.out.println(friedRice);
    }
}
