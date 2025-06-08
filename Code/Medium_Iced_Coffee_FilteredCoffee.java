package hw.hw4;

public class Medium_Iced_Coffee_FilteredCoffee extends FilteredCoffee {

    public Medium_Iced_Coffee_FilteredCoffee(String name, String price, String description, String calories, String brewType) {
        super(name, price, description, calories, brewType);
    }

    @Override
    public String toString() {
        String out = this.getName() + ", " + this.getPrice() + ", " + this.getDescription() + ", " + this.getCalories() + ", " + this.getBrewType();
        return out;
    }
}

// Price: $2.50 - $4.00

// Description: Iced coffee brewed with medium-roast beans has a smooth, balanced flavor with moderate acidity and light sweetness. It’s typically served chilled and is a great choice for those who enjoy a cold, refreshing coffee.

// Calories: 2-5 calories (black, no milk or sweetener)