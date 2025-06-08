package hw.hw4;

public class Regular_Customer extends Customer {

    public Regular_Customer(String Customer_First_Name, String Customer_Last_Name, String Customer_email, String Customer_Phone_Number, String Customer_adress) {
        super(Customer_First_Name, Customer_Last_Name, Customer_email, Customer_Phone_Number, Customer_adress);
    }
    
    @Override
    public String toString() {
        String out = this.getCustomer_First_Name() + " " + this.getCustomer_Last_Name() + " " + this.getCustomer_email() + " " + this.getCustomer_Phone_Number() + " " + this.getCustomer_adress() ;           
        return out;
    }

    @Override
    public String payCoffee() {
        String out =  ("Regular Customer Thank you for paying in cash.");
        return out;
    }

}
