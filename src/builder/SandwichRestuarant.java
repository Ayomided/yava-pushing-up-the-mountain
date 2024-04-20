package builder;

public class SandwichRestuarant {
    public static void main(String[] args) {
        Sandwich vegOption = new Sandwich.SandwichBuilder("thick", 3).setMeat(3).build();
        System.out.println(vegOption.getBread());
        System.out.println(vegOption.getMeat());
        System.out.println(vegOption.getCheese());
    }
}
