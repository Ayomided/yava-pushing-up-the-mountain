package factory;

public class EggFriedRice extends Cooking{
    String ingredients;
    String cookingStyle;
    public EggFriedRice(String ingredients, String cookingStyle) {
        this.ingredients = ingredients;
        this.cookingStyle = cookingStyle;
    }

    @Override
    public String getCookingStyles() {
        return this.cookingStyle;
    }

    @Override
    public String getIngredients() {
        return this.ingredients;
    }
}
