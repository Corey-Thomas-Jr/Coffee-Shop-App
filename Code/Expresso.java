package hw.hw4;

public class Expresso extends Coffee {
    private String milkShots;
    private String milkType;
    private String additionalIngredients;

    public Expresso(String name, String price, String description, String calories, String milkShots, String milkType, String additionalIngredients) {
        super(name, price, description, calories);
        this.milkShots = milkShots;
        this.milkType = milkType;
        this.additionalIngredients = additionalIngredients;
    }

    public String getMilkShots() {
        return milkShots;
    }

    public void setMilkShots(String milkShots) {
        this.milkShots = milkShots;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getadditionalIngredients() {
        return additionalIngredients;
    }

    public void setadditionalIngredients(String additionalIngredients) {
        this.additionalIngredients = additionalIngredients;
    }

}
