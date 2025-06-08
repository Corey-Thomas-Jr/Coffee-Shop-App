package hw.hw4;

public class Premium_Customer extends Customer{

    public Premium_Customer(String Customer_First_Name, String Customer_Last_Name, String Customer_email, String Customer_Phone_Number, String Customer_adress) {
        super(Customer_First_Name, Customer_Last_Name, Customer_email, Customer_Phone_Number, Customer_adress);
    }
    
    @Override
    public String toString() {
        String out = this.getCustomer_First_Name() + " " + this.getCustomer_Last_Name() + " " + this.getCustomer_email() + " " + this.getCustomer_Phone_Number() + " " + this.getCustomer_adress() ;           
        return out;
    }
    
    @Override
    public String payCoffee() {
        String out = ("Premium customer Thank you for paying in bitcoin a 10% discount will be applied to the price.");
        return out;
    }

}
