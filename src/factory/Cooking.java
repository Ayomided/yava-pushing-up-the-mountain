package factory;

abstract class Cooking {
    public String toString(){
        return "To cook " + this.getClass().getSimpleName() + " we use, " + this.getCookingStyles() + " and these ingredients, " + this.getIngredients();
    };
    public abstract String getCookingStyles();
    public abstract String getIngredients();
}
