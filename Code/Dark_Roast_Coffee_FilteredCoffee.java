package hw.hw4;

public class Dark_Roast_Coffee_FilteredCoffee extends FilteredCoffee {

    public Dark_Roast_Coffee_FilteredCoffee(String name, String price, String description, String calories, String brewType) {
        super(name, price, description, calories, brewType);
    }

    @Override
    public String toString() {
        String out = this.getName() + ", " + this.getPrice() + ", " + this.getDescription() + ", " + this.getCalories() + ", " + this.getBrewType();
        return out;
    }

}

// Price: $1.50 - $3.00

// Description: Dark roast coffee is made from beans roasted longer, resulting in a deeper, richer flavor with smoky, bold, and sometimes slightly bitter notes. It's less acidic than lighter roasts and has a full-bodied, robust flavor.

// Calories: 2-5 calories (black, no sugar or cream)