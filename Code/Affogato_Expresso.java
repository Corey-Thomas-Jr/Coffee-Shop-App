package hw.hw4;

public class Affogato_Expresso extends Expresso {

    public Affogato_Expresso(String name, String price, String description, String calories, String milkShots, String milkType, String additionalIngredients) {

        super(name, price, description, calories, milkShots, milkType, additionalIngredients);
    }

    @Override
    public String toString() {
        String out = this.getName() + ", " + this.getPrice() + ", " + this.getDescription() + ", " + this.getCalories() + ", " + this.getMilkShots() + ", " + this.getMilkType() + ", " + this.getadditionalIngredients();
        return out;
    }

}

// description: a simple yet indulgent Italian dessert that combines espresso with ice cream. It typically consists of a shot of hot espresso poured over a scoop of vanilla ice cream, though variations may use other ice cream flavors or add toppings like chocolate shavings, nuts, or liqueurs. The contrast of the hot, bold espresso and the cold, creamy ice cream creates a delightful combination of flavors and textures.

// price range: $4.00 to $7.00

// calories: Affogato (1 scoop vanilla ice cream + 1 shot espresso): 150-200
// calories.
// Affogato with extra toppings or a larger scoop of ice cream: It can range
// from 200-350 calories, depending on the additions.