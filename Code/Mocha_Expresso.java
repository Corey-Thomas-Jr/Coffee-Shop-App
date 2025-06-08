package hw.hw4;

public class Mocha_Expresso extends Expresso {

    public Mocha_Expresso(String name, String price, String description, String calories, String milkShots, String milkType, String additionalIngredients) {

        super(name, price, description, calories, milkShots, milkType, additionalIngredients);
    }

    @Override
    public String toString() {
        String out = this.getName() + ", " + this.getPrice() + ", " + this.getDescription() + ", " + this.getCalories() + ", " + this.getMilkShots() + ", " + this.getMilkType() + ", " + this.getadditionalIngredients();
        return out;
    }
}

// Description: A Mocha is a rich, sweet espresso-based drink made with espresso, steamed milk, and chocolate syrup or cocoa powder, often topped with whipped cream. It’s essentially a chocolate-flavored latte, combining the richness of coffee and the sweetness of chocolate. It’s a popular choice for those who enjoy a sweeter, dessert-like coffee.

// price: $3.50 to $5.50

// calories:12 oz (small): 250-350 calories.
// 16 oz (medium): 350-450 calories.
// 20 oz (large): 450-550 calories

// whole milk , skim milk, almond milk, oat milk, or soy milk.
// shots: 1-2 shots of expresso