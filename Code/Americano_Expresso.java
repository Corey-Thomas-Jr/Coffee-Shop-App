package hw.hw4;

public class Americano_Expresso extends Expresso {

    public Americano_Expresso(String name, String price, String description, String calories, String milkShots, String milkType, String additionalIngredients) {

        super(name, price, description, calories, milkShots, milkType, additionalIngredients);
    }

    @Override
    public String toString() {
        String out = this.getName() + ", " + this.getPrice() + ", " + this.getDescription() + ", " + this.getCalories() + ", " + this.getMilkShots() + ", " + this.getMilkType() + ", " + this.getadditionalIngredients();
        return out;
    }
}

// Description: An Americano is a simple yet flavorful coffee drink made by diluting a shot (or two) of espresso with hot water. This creates a coffee that is similar in strength to drip coffee but with a different taste profile. The espresso’s rich and bold flavor is preserved, but it's made less intense by the addition of hot water.

// price: $2.50 to $4.00
// typically no milk is used unless ordered special
// calories:Single Shot of Espresso: Approximately 2 calories.
// double shot: 4 calories