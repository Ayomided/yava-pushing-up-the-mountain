package builder;

public class Sandwich {
    private final String bread;
    private final int cheese;
    private final int avocado;
    private final boolean mayonnaise;
    private final int meat;
    private final boolean vegetarian;

    public String getBread() {
        return this.bread;
    }

    public int getCheese() {
        return this.cheese;
    }

    public int getAvocado() {
        return this.avocado;
    }

    public boolean isMayonnaise() {
        return this.mayonnaise;
    }

    public int getMeat() {
        return this.meat;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    private Sandwich(SandwichBuilder builder) {
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.avocado = builder.avocado;
        this.mayonnaise = builder.mayonnaise;
        this.meat = builder.meat;
        this.vegetarian = builder.vegetarian;
    }

    public static class SandwichBuilder {
        private final String bread;
        private final int cheese;
        public int avocado = 0;
        public boolean mayonnaise = false;
        private int meat = 0;
        private boolean vegetarian = false;

        public SandwichBuilder(String bread, int cheese) {
            this.bread = bread;
            this.cheese = cheese;
        }

        public SandwichBuilder setAvocado(int avocado) {
            this.avocado = avocado;
            return this;
        }
        public SandwichBuilder setMayonnaise(boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }
        public  SandwichBuilder setMeat(int meat) {
            if(!vegetarian){
                this.meat = meat;
            }
            return this;
        }
        public SandwichBuilder setVegetarian(boolean vegetarian) {
            this.vegetarian = vegetarian;
            return this;
        }
        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
