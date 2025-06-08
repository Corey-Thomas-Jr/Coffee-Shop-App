package hw.hw4;

public class FilteredCoffee extends Coffee {
    private String brewType;

    public FilteredCoffee(String name, String price, String description, String calories, String brewType) {
        super(name, price, description, calories);
        this.brewType = brewType;
    }

    public String getBrewType() {
        return brewType;
    }

    public void setBrewType(String brewType) {
        this.brewType = brewType;
    }

}