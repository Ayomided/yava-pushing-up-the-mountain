package factory;

public class RestaurantFactory {
    public static Cooking createInstance(String type){
        switch (type.toLowerCase()){
            case "fried rice" -> {
                return new EggFriedRice("Rice, eggs", "frying");
            }
            default -> throw new IllegalArgumentException("Unknown cooking type: " + type);
        }
    }
}
