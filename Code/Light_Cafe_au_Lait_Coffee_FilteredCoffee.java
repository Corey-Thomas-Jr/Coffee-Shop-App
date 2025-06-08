package hw.hw4;

public class Light_Cafe_au_Lait_Coffee_FilteredCoffee extends FilteredCoffee {

    public Light_Cafe_au_Lait_Coffee_FilteredCoffee(String name, String price, String description, String calories, String brewType) {
        super(name, price, description, calories, brewType);
    }

    @Override
    public String toString() {
        String out = this.getName() + ", " + this.getPrice() + ", " + this.getDescription() + ", " + this.getCalories() + ", " + this.getBrewType();
        return out;
    }
}

// Price: $3.00 - $4.50

// Description: Café au Lait is made with equal parts brewed light roast coffee and steamed milk. This coffee is smooth and creamy, with the light roast offering a gentle and slightly fruity flavor.

// Calories: 80-120 calories (with whole milk)