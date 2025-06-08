package hw.hw4;

import javax.swing.JTextField;

public abstract class Customer {

    // Abstract Customer variables for Constructor
    private String Customer_First_Name;
    private String Customer_Last_Name;
    private String Customer_email;
    private String Customer_Phone_Number;
    private String Customer_adress;

    // Customer Constructor
    public Customer(String Customer_First_Name, String Customer_Last_Name, String Customer_email, String Customer_Phone_Number, String Customer_adress) {
        this.Customer_First_Name = Customer_First_Name;
        this.Customer_Last_Name = Customer_Last_Name;
        this.Customer_email = Customer_email;
        this.Customer_Phone_Number = Customer_Phone_Number;
        this.Customer_adress = Customer_adress;
    }


    // Setters and Getters
    public String getCustomer_First_Name() {
        return Customer_First_Name;
    }

    public void setCustomer_First_Name(String customer_First_Name) {
        Customer_First_Name = customer_First_Name;
    }

    public String getCustomer_Last_Name() {
        return Customer_Last_Name;
    }

    public void setCustomer_Last_Name(String customer_Last_Name) {
        Customer_Last_Name = customer_Last_Name;
    }

    public String getCustomer_email() {
        return Customer_email;
    }

    public void setCustomer_email(String customer_email) {
        Customer_email = customer_email;
    }

    public String getCustomer_Phone_Number() {
        return Customer_Phone_Number;
    }

    public void setCustomer_Phone_Number(String customer_Phone_Number) {
        Customer_Phone_Number = customer_Phone_Number;
    }

    public String getCustomer_adress() {
        return Customer_adress;
    }

    public void setCustomer_adress(String customer_adress) {
        Customer_adress = customer_adress;
    }

    // Abstract method pay Coffee
        public abstract String payCoffee();

}
