package hw.hw4;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer_Checkout_Gui {

    Customer_Checkout_Gui(){
        // Frame
            JFrame frame = new JFrame("Coffee Shop: Customer and Checkout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 907);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // JLabels
            JLabel Customer_Checkout_Label = new JLabel("Customer Checkout");
            Customer_Checkout_Label.setBounds(321, 11, 352, 41);
            Customer_Checkout_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            Customer_Checkout_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Customer_Checkout_Label);

            JLabel Customer_Info_Label = new JLabel("Enter Customer Information Here:");
            Customer_Info_Label.setBounds(33, 81, 267, 26);
            Customer_Info_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Customer_Info_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Customer_Info_Label);

            JLabel First_Name_Label = new JLabel("First Name:");
            First_Name_Label.setBounds(5, 141, 106, 17);
            First_Name_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            First_Name_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(First_Name_Label);
    
            JLabel Email_Label = new JLabel("Email:");
            Email_Label.setBounds(5, 253, 106, 17);
            Email_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Email_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Email_Label);
    
            JLabel Phone_Number_Label = new JLabel("Phone Number:");
            Phone_Number_Label.setBounds(5, 304, 106, 17);
            Phone_Number_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Phone_Number_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Phone_Number_Label);
    
            JLabel Adress_Label = new JLabel("Address:");
            Adress_Label.setBounds(5, 365, 106, 17);
            Adress_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Adress_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Adress_Label);

            JLabel Last_Name_Label = new JLabel("Last Name:");
            Last_Name_Label.setBounds(5, 204, 106, 17);
            Last_Name_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Last_Name_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Last_Name_Label);

            JLabel Customer_Status_Label = new JLabel("Indicate Customer Status Below: ");
            Customer_Status_Label.setBounds(642, 73, 296, 25);
            Customer_Status_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
            Customer_Status_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Customer_Status_Label);

            JLabel Instructions_Label = new JLabel("Please enter customer information before indicating customer status.");
            Instructions_Label.setBounds(245, 221, 600, 58);
            Instructions_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
            Instructions_Label.setForeground(Color.decode("#D9D9D9"));
            panel.add(Instructions_Label);
    

        // Text Fields/Input
            JTextField First_Name_inputText = new JTextField("");
            First_Name_inputText.setBounds(112, 138, 119, 21);
            First_Name_inputText.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            First_Name_inputText.setBackground(Color.decode("#B2B2B2"));
            First_Name_inputText.setForeground(Color.decode("#656565"));
            First_Name_inputText.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
            panel.add(First_Name_inputText);

            JTextField Last_Name_InputText = new JTextField("");
            Last_Name_InputText.setBounds(112, 205, 119, 21);
            Last_Name_InputText.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Last_Name_InputText.setBackground(Color.decode("#B2B2B2"));
            Last_Name_InputText.setForeground(Color.decode("#656565"));
            Last_Name_InputText.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
            panel.add(Last_Name_InputText);

            JTextField Email_InputText = new JTextField("");
            Email_InputText.setBounds(115, 250, 119, 21);
            Email_InputText.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Email_InputText.setBackground(Color.decode("#B2B2B2"));
            Email_InputText.setForeground(Color.decode("#656565"));
            Email_InputText.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
            panel.add(Email_InputText);

            JTextField Phone_Number_InputText = new JTextField("");
            Phone_Number_InputText.setBounds(115, 302, 119, 21);
            Phone_Number_InputText.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Phone_Number_InputText.setBackground(Color.decode("#B2B2B2"));
            Phone_Number_InputText.setForeground(Color.decode("#656565"));
            Phone_Number_InputText.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
            panel.add(Phone_Number_InputText);

            JTextField Adress_Input_Text = new JTextField("");
            Adress_Input_Text.setBounds(115, 368, 119, 21);
            Adress_Input_Text.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Adress_Input_Text.setBackground(Color.decode("#B2B2B2"));
            Adress_Input_Text.setForeground(Color.decode("#656565"));
            Adress_Input_Text.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
            panel.add(Adress_Input_Text);

        // Buttons
            JButton Regular_Customer_Button = new JButton("Regular Customer");
            Regular_Customer_Button.setBounds(637, 120, 267, 106);
            Regular_Customer_Button.setBackground(Color.decode("#2e2e2e"));
            Regular_Customer_Button.setForeground(Color.decode("#D9D9D9"));
            Regular_Customer_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
            Regular_Customer_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Regular_Customer_Button.setFocusPainted(false);
            panel.add(Regular_Customer_Button);

            JButton Premium_Customer_Button = new JButton("Premium Customer");
            Premium_Customer_Button.setBounds(635, 284, 272, 95);
            Premium_Customer_Button.setBackground(Color.decode("#2e2e2e"));
            Premium_Customer_Button.setForeground(Color.decode("#D9D9D9"));
            Premium_Customer_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
            Premium_Customer_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Premium_Customer_Button.setFocusPainted(false);
            panel.add(Premium_Customer_Button);


            // Go back Shopping button
                JButton Go_back_Button = new JButton("Go back Shopping ^_^");
                Go_back_Button.setBounds(135, 410, 200, 50);
                Go_back_Button.setBackground(Color.decode("#2e2e2e"));
                Go_back_Button.setForeground(Color.decode("#D9D9D9"));
                Go_back_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
                Go_back_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Go_back_Button.setFocusPainted(false);
                panel.add(Go_back_Button);

            // Exit Program
                JButton Exit_Buttton = new JButton("Leaving Store :(");
                Exit_Buttton.setBounds(700, 410, 200, 50);
                Exit_Buttton.setBackground(Color.decode("#2e2e2e"));
                Exit_Buttton.setForeground(Color.decode("#D9D9D9"));
                Exit_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Exit_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Exit_Buttton.setFocusPainted(false);
                panel.add(Exit_Buttton);

            // View Orders
                JButton View_Orders_Button = new JButton("View Orders");
                View_Orders_Button.setBounds(400, 410, 211,50);
                View_Orders_Button.setBackground(Color.decode("#2e2e2e"));
                View_Orders_Button.setForeground(Color.decode("#D9D9D9"));
                View_Orders_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                View_Orders_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                View_Orders_Button.setFocusPainted(false);
                panel.add(View_Orders_Button);

            // Textfield for the info to show
                // Just for showing
                        JLabel View_Orders_Label = new JLabel("View Orders Here ^_^");
                        View_Orders_Label.setBounds(50, 50, 900, 900);
                        View_Orders_Label.setForeground(Color.decode("#D9D9D9"));
                    // to show the information
                            // Affogato
                                    JLabel View_Orders_Label_Affoagto = new JLabel("");
                                    View_Orders_Label_Affoagto.setBounds(50, 70, 900, 900);
                                    View_Orders_Label_Affoagto.setForeground(Color.decode("#D9D9D9"));
                            // Americano
                                    JLabel View_Orders_Label_Americano = new JLabel("");
                                    View_Orders_Label_Americano.setBounds(50, 90, 900, 900);
                                    View_Orders_Label_Americano.setForeground(Color.decode("#D9D9D9"));

                            // Mocha
                                    JLabel View_Orders_Label_Mocha = new JLabel("");
                                    View_Orders_Label_Mocha.setBounds(50, 110, 900, 900);
                                    View_Orders_Label_Mocha.setForeground(Color.decode("#D9D9D9"));

                            // Light Cafe au Lait
                                    JLabel View_Orders_Label_Light_Cafe_au_Lait = new JLabel("");
                                    View_Orders_Label_Light_Cafe_au_Lait.setBounds(50, 130, 900, 900);
                                    View_Orders_Label_Light_Cafe_au_Lait.setForeground(Color.decode("#D9D9D9"));

                            // Dark Roast Coffee
                                    JLabel View_Orders_Label_Dark_Roast_Coffee = new JLabel("");
                                    View_Orders_Label_Dark_Roast_Coffee.setBounds(50, 150, 900, 900);
                                    View_Orders_Label_Dark_Roast_Coffee.setForeground(Color.decode("#D9D9D9"));

                            // Medium Iced Coffee
                                    JLabel View_Orders_Label_Medium_Ice_Coffee = new JLabel("");
                                    View_Orders_Label_Medium_Ice_Coffee .setBounds(50, 170, 900, 900);
                                    View_Orders_Label_Medium_Ice_Coffee .setForeground(Color.decode("#D9D9D9"));

        // To show on Gui
                panel.add(View_Orders_Label);
                panel.add(View_Orders_Label_Affoagto);
                panel.add(View_Orders_Label_Americano);
                panel.add(View_Orders_Label_Mocha);
                panel.add(View_Orders_Label_Light_Cafe_au_Lait);
                panel.add(View_Orders_Label_Dark_Roast_Coffee);
                panel.add(View_Orders_Label_Medium_Ice_Coffee);

            // Total Showing
                JLabel orderTotal = new JLabel("Total Cost: ");
                orderTotal.setBounds(800, 10, 170, 20);
                orderTotal.setForeground(Color.decode("#D9D9D9"));
                panel.add(orderTotal);

                        
                // Button exit Program
                        Exit_Buttton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                        // General way for all computers to run
                                            String userHome = System.getProperty("user.home");
                                            File directory = new File(userHome, "Order_History");
                                            if (!directory.exists()){
                                                    directory.mkdir();
                                            }

                                    // Creates Temporary File
                                    File temp = new File(directory, "temporary.txt");
                                       if (temp.exists()){
                                               temp.delete();
                                       }
                                    System.exit(0);
                                }
                        });


        // Regular Customer Button
            Regular_Customer_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int Affogato_count = 0;
                    int Americano_count = 0;
                    int Mocha_count = 0;
                    int Light_Cafe_au_Lait_count = 0;
                    int Dark_Roast_Coffee_count = 0;
                    int Medium_Iced_Coffee_count = 0;
                    Double Total = 0.0;


                    // General way for all computers to run
                        String userHome = System.getProperty("user.home");
                        File directory = new File(userHome, "Order_History");
                        if (!directory.exists()){
                                directory.mkdir();
                        }

                    // Finds Temporary File
                        File temp = new File(directory, "temporary.txt");

                    // Creates Reciept
                        // generates order ID number
                                int orderID = (int) (Math.random() *  101);
                            // writing into text file info
                                String File_Name = "receipt_" + orderID + ".txt";

                        File Customer_Receipt = new File(directory, File_Name );


                    // Coffee Variables
                        // Expresso Coffee
                            // Affogato
                                ArrayList<Affogato_Expresso> Affogato_List = new ArrayList<>();
                                String Affagto_price = null;
                            

                            // Americano
                                ArrayList<Americano_Expresso> Americanoo_List = new ArrayList<>();
                                String Amercano_price = null;


                            // Mocha
                                ArrayList<Mocha_Expresso> Mocha_List = new ArrayList<>();
                                String Mocha_price = null;


                    // Filtered Coffee
                        // Light Cafe au Lait
                            ArrayList<Light_Cafe_au_Lait_Coffee_FilteredCoffee> Light_Cafe_au_Lait_List = new ArrayList<>();
                            String Light_Cafe_au_Lait_price = null;
                            

                        // Dark Roast Coffee
                            ArrayList<Dark_Roast_Coffee_FilteredCoffee>  Dark_Roast_Coffee_List = new ArrayList<>();
                            String Dark_Roast_Coffee_price = null;

                        // Medium Iced Coffee
                            ArrayList<Medium_Iced_Coffee_FilteredCoffee>  Medium_Iced_Coffee_List = new ArrayList<>();
                            String Medium_Iced_Coffee_price = null;
                      

    // Reading the Temp File


        try(Scanner in = new Scanner(temp)){

            while (in.hasNextLine()){

                String s = in.nextLine();

                String[] arr = s.split(",");

            // Expresso Coffee
                // Affagto
                    if (arr[0].equals("Affogato")){

                        Affogato_Expresso Affagto = new Affogato_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                        Affogato_List.add(Affagto);
                        Affagto_price = Affagto.getPrice();
                    }
                    
                 // Americano
                    if (arr[0].equals("Americano")){

                        Americano_Expresso Amercano = new Americano_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                        Americanoo_List.add(Amercano);
                        Amercano_price = Amercano.getPrice();
                    }

                // Mocha
                    if (arr[0].equals("Mocha")){

                        Mocha_Expresso Mocha = new Mocha_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                        Mocha_List.add(Mocha);
                        Mocha_price = Mocha.getPrice();
                    }

            // Filtered Coffee
                    // Light Cafe au Lait Coffee
                        if (arr[0].equals("Light Cafe au Lait")){

                            Light_Cafe_au_Lait_Coffee_FilteredCoffee Light_Cafe_au_Lait = new Light_Cafe_au_Lait_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                            Light_Cafe_au_Lait_List.add(Light_Cafe_au_Lait);
                            Light_Cafe_au_Lait_price = Light_Cafe_au_Lait.getPrice();

                        }

                        // Dark Roast Coffee
                            if (arr[0].equals("Dark Roast Coffee")){

                                Dark_Roast_Coffee_FilteredCoffee Dark_Roast_Coffee = new Dark_Roast_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                Dark_Roast_Coffee_List.add(Dark_Roast_Coffee);
                                Dark_Roast_Coffee_price = Dark_Roast_Coffee.getPrice();
                            }

                        // Medum Iced Coffee
                            if (arr[0].equals("Medium Iced Coffee")){

                                Medium_Iced_Coffee_FilteredCoffee Medium_Iced_Coffee = new Medium_Iced_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                Medium_Iced_Coffee_List.add(Medium_Iced_Coffee);
                                Medium_Iced_Coffee_price = Medium_Iced_Coffee.getPrice();
                            }
            }

        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }


                    // input
                        String First_Name =  First_Name_inputText.getText();
                        String Last_Name = Last_Name_InputText.getText();
                        String Email = Email_InputText.getText();
                        String Phone_Number = Phone_Number_InputText.getText();
                        String Adress = Adress_Input_Text.getText();

                    Regular_Customer Reg_Customer = new Regular_Customer(First_Name, Last_Name, Email, Phone_Number, Adress);

                    // Affogato count
                        for (int i = Affogato_count; i < Affogato_List.size(); i ++){
                            Affogato_count++;
                        }

                    // Americano count
                        for (int i = Americano_count; i < Americanoo_List.size(); i ++){
                            Americano_count++;
                        }

                    // Mocha count
                        for (int i = Mocha_count; i < Mocha_List.size(); i ++){
                            Mocha_count++;
                            // System.out.println(Mocha_List.get(i));
                        }

                    // Light Cafe au Lait count
                        for (int i  = Light_Cafe_au_Lait_count ; i < Light_Cafe_au_Lait_List.size(); i ++){
                            Light_Cafe_au_Lait_count++;
                        }

                    // Dark Roast Coffee count
                         for (int i  = Dark_Roast_Coffee_count ; i < Dark_Roast_Coffee_List.size(); i ++){
                            Dark_Roast_Coffee_count++;
                        }

                    // Medium Iced Coffee
                         for (int i  = Medium_Iced_Coffee_count ; i < Medium_Iced_Coffee_List.size(); i ++){
                            Medium_Iced_Coffee_count++;
                        }


                    // Writes into new txt file for Customer Receipt
                        try(FileWriter writer = new FileWriter(Customer_Receipt,true)){
                            writer.write("Regular Customer Info: " + Reg_Customer.toString() + "\n");
                            writer.write("\nOrder ID: " + String.valueOf(orderID) + "\n");
                            writer.write("\nThe information for Expresso Coffees are categorize by the following: Name, Price, Description, Calories, Milkshots, and additional Ingredients \n ");
                            writer.write("\nThe information for Filtered Coffees are categorize by the following: Name, Price, Description, Calories, Brewtype\n");
                            writer.write("\nSorry for the inconvenience ^_^\n");


                            // Affogato
                                 if (Affogato_count != 0 && !Affogato_List.isEmpty() ){
                                    writer.write("\nExpresso:");
                                    writer.write("\nYou Purchased: " + Affogato_count + "\n");
                                    writer.write(String.valueOf(Affogato_List.get(0)));

                                    writer.write("\n");
                                        
                                    if (Affogato_count == 0 && Affogato_List.isEmpty()){
                                            writer.write("\n");
                                        }
                               }

                            // Americano
                               if (Americano_count != 0 && !Americanoo_List.isEmpty() ){
                                    writer.write("\nExpresso:");
                                    writer.write("\nYou Purchased: " + Americano_count + "\n");
                                    writer.write(String.valueOf(Americanoo_List.get(0)));
                                

                                    writer.write("\n");
                                        
                                    if (Americano_count == 0 && Americanoo_List.isEmpty()){
                                            writer.write("\n");
                                        }
                                       
                               }
                           
                             // Mocha
                                if (Mocha_count != 0 && !Mocha_List.isEmpty() ){
                                    writer.write("\nExpresso:");
                                    writer.write("\nYou Purchased: " + Mocha_count + "\n");
                                    writer.write(String.valueOf(Mocha_List.get(0)));

                                    writer.write("\n");
                                        
                                    if (Mocha_count == 0 && Mocha_List.isEmpty()){
                                            writer.write("\n");
                                        }
                                    
                                }

                            // Light Cafe au Lait
                                if (Light_Cafe_au_Lait_count != 0 && !Light_Cafe_au_Lait_List.isEmpty() ){
                                    writer.write("\nFiltered Coffee:");
                                    writer.write("\nYou Purchased: " + Light_Cafe_au_Lait_count + "\n");
                                    writer.write(String.valueOf(Light_Cafe_au_Lait_List.get(0)));

                                    writer.write("\n");
                                        
                                    if (Light_Cafe_au_Lait_count == 0 && Light_Cafe_au_Lait_List.isEmpty()){
                                            writer.write("\n");
                                        }
                                    
                                }

                             // Dark Roast Coffee
                                if (Dark_Roast_Coffee_count != 0 && !Dark_Roast_Coffee_List.isEmpty() ){
                                    writer.write("\nFiltered Coffee:");
                                    writer.write("\nYou Purchased: " + Dark_Roast_Coffee_count + "\n");
                                    writer.write(String.valueOf(Dark_Roast_Coffee_List.get(0)));

                                    writer.write("\n");
                                        
                                    if (Dark_Roast_Coffee_count == 0 && Dark_Roast_Coffee_List.isEmpty()){
                                            writer.write("\n");
                                        }
                                    
                                }

                             // Medium Iced Coffee
                                if (Medium_Iced_Coffee_count != 0 && !Medium_Iced_Coffee_List.isEmpty() ){
                                    writer.write("\nFiltered Coffee:");
                                    writer.write("\nYou Purchased: " + Medium_Iced_Coffee_count + "\n");
                                    writer.write(String.valueOf(Medium_Iced_Coffee_List.get(0)));

                                    writer.write("\n");
                                        
                                    if (Medium_Iced_Coffee_count == 0 && Medium_Iced_Coffee_List.isEmpty()){
                                            writer.write("\n");
                                        }
                                    
                                }

                                // Total
                                    // PlaceHolders
                                        // Expresso prices
                                            double Aff_temp = 4.0 * Affogato_count;
                                            double  Am_temp = 2.50 * Americano_count;
                                            double M_temp = 3.50 * Mocha_count;
                                        // Filtered prices
                                            double Light_Cafe_au_Lait_temp = 3.00 * Light_Cafe_au_Lait_count;
                                            double Dark_Roast_Coffee_temp = 1.50 * Dark_Roast_Coffee_count;
                                            double Medium_Iced_Coffee_temp = 2.50 * Medium_Iced_Coffee_count;

                            // Gets total of Coffee in the temp file
                                Total = Aff_temp + Am_temp + M_temp + Light_Cafe_au_Lait_temp + Dark_Roast_Coffee_temp + Medium_Iced_Coffee_temp;

                                orderTotal.setText("Total Cost: $" + String.valueOf(String.format("%.2f", Total)));

                            System.out.println("Order ID you created: " + orderID);
                            System.out.println("Total cost: " + Total);

                            writer.write("\nYour Total for today will be: $" + String.valueOf(String.format("%.2f", Total)));

                                writer.write("\n");

                                writer.write("\n" +  Reg_Customer.payCoffee());

                                writer.write("\n");

                            // Order is now Passive
                            writer.write("\nYour order is Passive");

                            writer.write("\n");

                            // Thank you message
                            writer.write("\nThanks for shopping with us. Hope you be back soon ^_^");

                        } catch (IOException e1) {
                                e1.printStackTrace();
                        }
                    
                        // deletes the temp file
                            
                        if (temp.exists()){
                                temp.delete();
                            }
                }
            });


         // Premium Customer Button
                Premium_Customer_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // Making varibales counts and total
                        int Affogato_count = 0;
                        int Americano_count = 0;
                        int Mocha_count = 0;
                        int Light_Cafe_au_Lait_count = 0;
                        int Dark_Roast_Coffee_count = 0;
                        int Medium_Iced_Coffee_count = 0;
                        Double Total = 0.0;


                        // General way for all computers to run
                            String userHome = System.getProperty("user.home");
                            File directory = new File(userHome, "Order_History");
                            if (!directory.exists()){
                                    directory.mkdir();
                            }

                        // Creates Temporary File
                            File temp = new File(directory, "temporary.txt");

                        // Creates Reciept
                            // generates order ID number
                                    int orderID = (int) (Math.random() *  101);
                                // writing into text file info
                                    String File_Name = "receipt_" + orderID + ".txt";

                            File Customer_Receipt = new File(directory, File_Name );


                        // Coffee Variables
                            // Expresso Coffee
                                // Affogato
                                        ArrayList<Affogato_Expresso> Affogato_List = new ArrayList<>();
                                        String Affagto_price = null;
                                

                                // Americano
                                        ArrayList<Americano_Expresso> Americanoo_List = new ArrayList<>();
                                        String Amercano_price = null;


                                // Mocha
                                        ArrayList<Mocha_Expresso> Mocha_List = new ArrayList<>();
                                        String Mocha_price = null;


                        // Filtered Coffee
                            // Light Cafe au Lait
                                ArrayList<Light_Cafe_au_Lait_Coffee_FilteredCoffee> Light_Cafe_au_Lait_List = new ArrayList<>();
                                String Light_Cafe_au_Lait_price = null;
                                

                            // Dark Roast Coffee
                                ArrayList<Dark_Roast_Coffee_FilteredCoffee>  Dark_Roast_Coffee_List = new ArrayList<>();
                                String Dark_Roast_Coffee_price = null;

                            // Medium Iced Coffee
                                ArrayList<Medium_Iced_Coffee_FilteredCoffee>  Medium_Iced_Coffee_List = new ArrayList<>();
                                String Medium_Iced_Coffee_price = null;


                // Reading the Temp File

                    try(Scanner in = new Scanner(temp)){

                        while (in.hasNextLine()){

                            String s = in.nextLine();

                            String[] arr = s.split(",");

                        // Expresso Coffee
                            // Affagto
                                if (arr[0].equals("Affogato")){

                                    Affogato_Expresso Affagto = new Affogato_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                                    Affogato_List.add(Affagto);
                                    Affagto_price = Affagto.getPrice();
                                }
                                
                            // Americano
                                if (arr[0].equals("Americano")){

                                    Americano_Expresso Amercano = new Americano_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                                    Americanoo_List.add(Amercano);
                                    Amercano_price = Amercano.getPrice();
                                }

                            // Mocha
                                if (arr[0].equals("Mocha")){

                                    Mocha_Expresso Mocha = new Mocha_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                                    Mocha_List.add(Mocha);
                                    Mocha_price = Mocha.getPrice();
                                }

                        // Filtered Coffee
                                // Light Cafe au Lait Coffee
                                    if (arr[0].equals("Light Cafe au Lait")){

                                        Light_Cafe_au_Lait_Coffee_FilteredCoffee Light_Cafe_au_Lait = new Light_Cafe_au_Lait_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                        Light_Cafe_au_Lait_List.add(Light_Cafe_au_Lait);
                                        Light_Cafe_au_Lait_price = Light_Cafe_au_Lait.getPrice();

                                    }

                                    // Dark Roast Coffee
                                        if (arr[0].equals("Dark Roast Coffee")){

                                            Dark_Roast_Coffee_FilteredCoffee Dark_Roast_Coffee = new Dark_Roast_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                            Dark_Roast_Coffee_List.add(Dark_Roast_Coffee);
                                            Dark_Roast_Coffee_price = Dark_Roast_Coffee.getPrice();
                                        }

                                        // Medum Iced Coffee
                                            if (arr[0].equals("Medium Iced Coffee")){

                                                Medium_Iced_Coffee_FilteredCoffee Medium_Iced_Coffee = new Medium_Iced_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                                Medium_Iced_Coffee_List.add(Medium_Iced_Coffee);
                                                Medium_Iced_Coffee_price = Medium_Iced_Coffee.getPrice();
                                            }

                        }

                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                    }


                                // input
                                    String First_Name =  First_Name_inputText.getText();
                                    String Last_Name = Last_Name_InputText.getText();
                                    String Email = Email_InputText.getText();
                                    String Phone_Number = Phone_Number_InputText.getText();
                                    String Adress = Adress_Input_Text.getText();

                                Premium_Customer Pre_Customer = new Premium_Customer(First_Name, Last_Name, Email, Phone_Number, Adress);

                                // Affogato count
                                    for (int i = Affogato_count; i < Affogato_List.size(); i ++){
                                        Affogato_count++;
                                    }

                                // Americano count
                                    for (int i = Americano_count; i < Americanoo_List.size(); i ++){
                                        Americano_count++;
                                    }

                                // Affogato count
                                    for (int i = Mocha_count; i < Mocha_List.size(); i ++){
                                        Mocha_count++;
                                    }

                                // Light Cafe au Lait count
                                    for (int i  = Light_Cafe_au_Lait_count ; i < Light_Cafe_au_Lait_List.size(); i ++){
                                        Light_Cafe_au_Lait_count++;
                                    }

                                // Dark Roast Coffee count
                                    for (int i  = Dark_Roast_Coffee_count ; i < Dark_Roast_Coffee_List.size(); i ++){
                                        Dark_Roast_Coffee_count++;
                                    }

                                // Medium Iced Coffee
                                    for (int i  = Medium_Iced_Coffee_count ; i < Medium_Iced_Coffee_List.size(); i ++){
                                        Medium_Iced_Coffee_count++;
                                    }


                                // Writes into new txt file for Customer Receipt
                                    try(FileWriter writer = new FileWriter(Customer_Receipt,true)){
                                        writer.write("Premium Customer Info: " + Pre_Customer.toString() + "\n");
                                        writer.write("\nOrder ID: " + String.valueOf(orderID) + "\n");
                                        writer.write("\nThe information for Expresso Coffees are categorize by the following: Name, Price, Description, Calories, Milkshots, and additional Ingredients \n ");
                                        writer.write("\nThe information for Filtered Coffees are categorize by the following: Name, Price, Description, Calories, Brewtype\n");
                                        
                                        writer.write("\nSorry for the inconvenience ^_^\n");
                                        
                                        // Affogato
                                            if (Affogato_count != 0 && !Affogato_List.isEmpty() ){
                                                writer.write("\nExpresso:");
                                                writer.write("\nYou Purchased: " + Affogato_count + "\n");
                                                writer.write(String.valueOf(Affogato_List.get(0)));

                                                writer.write("\n");
                                                    
                                                if (Americano_count == 0 && Americanoo_List.isEmpty()){
                                                        writer.write("\n");
                                                    }
                                        }

                                        // Americano
                                            if (Americano_count != 0 && !Americanoo_List.isEmpty() ){
                                                    writer.write("\nExpresso:");
                                                    writer.write("\nYou Purchased: " + Americano_count + "\n");
                                                    writer.write(String.valueOf(Americanoo_List.get(0)));

                                                    writer.write("\n");
                                                        
                                                    if (Americano_count == 0 && Americanoo_List.isEmpty()){
                                                            writer.write("\n");
                                                        }
                                                    
                                            }
                                    
                                        // Mocha
                                            if (Mocha_count != 0 && !Mocha_List.isEmpty() ){
                                                writer.write("\nExpresso:");
                                                writer.write("\nYou Purchased: " + Mocha_count + "\n");
                                                writer.write(String.valueOf(Mocha_List.get(0)));

                                                writer.write("\n");
                                                    
                                                if (Mocha_count == 0 && Mocha_List.isEmpty()){
                                                        writer.write("\n");
                                                    }
                                                
                                            }

                                        // Light Cafe au Lait
                                            if (Light_Cafe_au_Lait_count != 0 && !Light_Cafe_au_Lait_List.isEmpty() ){
                                                writer.write("\nFiltered Coffee:");
                                                writer.write("\nYou Purchased: " + Light_Cafe_au_Lait_count + "\n");
                                                writer.write(String.valueOf(Light_Cafe_au_Lait_List.get(0)));

                                                writer.write("\n");
                                                    
                                                if (Light_Cafe_au_Lait_count == 0 && Light_Cafe_au_Lait_List.isEmpty()){
                                                        writer.write("\n");
                                                    }
                                                
                                            }

                                        // Dark Roast Coffee
                                            if (Dark_Roast_Coffee_count != 0 && !Dark_Roast_Coffee_List.isEmpty() ){
                                                writer.write("\nFiltered Coffee:");
                                                writer.write("\nYou Purchased: " + Dark_Roast_Coffee_count + "\n");
                                                writer.write(String.valueOf(Dark_Roast_Coffee_List.get(0)));

                                                writer.write("\n");
                                                    
                                                if (Dark_Roast_Coffee_count == 0 && Dark_Roast_Coffee_List.isEmpty()){
                                                        writer.write("\n");
                                                    }
                                                
                                            }

                                        // Medium Iced Coffe
                                            if (Medium_Iced_Coffee_count != 0 && !Medium_Iced_Coffee_List.isEmpty() ){
                                                writer.write("\nFiltered Coffee:");
                                                writer.write("\nYou Purchased: " + Medium_Iced_Coffee_count + "\n");
                                                writer.write(String.valueOf(Medium_Iced_Coffee_List.get(0)));

                                                writer.write("\n");
                                                    
                                                if (Medium_Iced_Coffee_count == 0 && Medium_Iced_Coffee_List.isEmpty()){
                                                        writer.write("\n");
                                                    }
                                                
                                            }

                                            // Total
                                                // PlaceHolders
                                                    // Expresso prices
                                                        double Aff_temp = 4.0 * Affogato_count;
                                                        double  Am_temp = 2.50 * Americano_count;
                                                        double M_temp = 3.50 * Mocha_count;
                                                    // Filtered prices
                                                        double Light_Cafe_au_Lait_temp = 3.00 * Light_Cafe_au_Lait_count;
                                                        double Dark_Roast_Coffee_temp = 1.50 * Dark_Roast_Coffee_count;
                                                        double Medium_Iced_Coffee_temp = 2.50 * Medium_Iced_Coffee_count;


                                        // Gets total of Coffee in the temp file
                                            Total = Aff_temp + Am_temp + M_temp + Light_Cafe_au_Lait_temp + Dark_Roast_Coffee_temp + Medium_Iced_Coffee_temp;

                                            double discount = Total * 0.10;
                                            double discount_Total = Total - discount;
                                            
                                            orderTotal.setText("Total Cost: $" + String.valueOf(String.format("%.2f", discount_Total)));

                                        System.out.println("Order ID you created: " + orderID);
                                        System.out.println("The total: " + String.format("%.2f", discount_Total));

                                        writer.write("\n");
                                        writer.write("Your Total for today will be: $" + String.valueOf(String.format("%.2f", discount)) + " also 10% discount was rewarded\n");

                                            writer.write("\n");

                                            writer.write(Pre_Customer.payCoffee());

                                            writer.write("\n");

                                             // Order is now Passive
                                            writer.write("\nYour order is Passive");

                                            writer.write("\n");

                                        // Thank you message
                                             writer.write("\nThanks for shopping with us. Hope you be back soon ^_^");

                                    } catch (IOException e1) {
                                            e1.printStackTrace();
                                    }
                                
                                    // deletes the temp file
                                        
                                    if (temp.exists()){
                                            temp.delete();
                                        }
                            }
                        });

                    // back to shopping window
                        Go_back_Button.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    frame.dispose();
                                    if (e.getSource() == Go_back_Button) {
                                        Keep_Running F_Window = new Keep_Running();
                                    }
                                }
                            });

                            // View Button to see orders
                            View_Orders_Button.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                        int Affogato_count = 0;
                                        int Americano_count = 0;
                                        int Mocha_count = 0;
                                        int Light_Cafe_au_Lait_count = 0;
                                        int Dark_Roast_Coffee_count = 0;
                                        int Medium_Iced_Coffee_count = 0;

                                        // checking for temp file
                                        String userHome = System.getProperty("user.home");
                                        File directory = new File(userHome, "Order_History");
                                        if (!directory.exists()){
                                                directory.mkdir();
                                        }

                                        File temp_file = new File(directory, "temporary.txt");

                                        
                                        // Coffee Variables
                                                // Expresso Coffee
                                                        // Affogato
                                                                ArrayList<Affogato_Expresso> Affogato_List = new ArrayList<>();
                                                                String Affagto_price = null;
                                                        

                                                        // Americano
                                                                ArrayList<Americano_Expresso> Americanoo_List = new ArrayList<>();
                                                                String Amercano_price = null;


                                                        // Mocha
                                                                ArrayList<Mocha_Expresso> Mocha_List = new ArrayList<>();
                                                                String Mocha_price = null;


                                        // Filtered Coffee
                                                // Light Cafe au Lait
                                                        ArrayList<Light_Cafe_au_Lait_Coffee_FilteredCoffee> Light_Cafe_au_Lait_List = new ArrayList<>();
                                                        String Light_Cafe_au_Lait_price = null;
                                                

                                                // Dark Roast Coffee
                                                        ArrayList<Dark_Roast_Coffee_FilteredCoffee>  Dark_Roast_Coffee_List = new ArrayList<>();
                                                        String Dark_Roast_Coffee_price = null;

                                                // Medium Iced Coffee
                                                        ArrayList<Medium_Iced_Coffee_FilteredCoffee>  Medium_Iced_Coffee_List = new ArrayList<>();
                                                        String Medium_Iced_Coffee_price = null;
                                        
                                        
                                        // Finds Temporary File
                                                try(Scanner in = new Scanner(temp_file)){

                                                while (in.hasNextLine()){

                                                        String s = in.nextLine();

                                                        String[] arr = s.split(",");

                                                // Expresso Coffee
                                                        // Affagto
                                                        if (arr[0].equals("Affogato")){

                                                                Affogato_Expresso Affagto = new Affogato_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                                                                Affogato_List.add(Affagto);
                                                                Affagto_price = Affagto.getPrice();
                                                        }
                                                        
                                                        // Americano
                                                        if (arr[0].equals("Americano")){

                                                                Americano_Expresso Amercano = new Americano_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                                                                Americanoo_List.add(Amercano);
                                                                Amercano_price = Amercano.getPrice();
                                                        }

                                                        // Mocha
                                                        if (arr[0].equals("Mocha")){

                                                                Mocha_Expresso Mocha = new Mocha_Expresso(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);

                                                                Mocha_List.add(Mocha);
                                                                Mocha_price = Mocha.getPrice();
                                                        }

                                                // Filtered Coffee
                                                        // Light Cafe au Lait Coffee
                                                                if (arr[0].equals("Light Cafe au Lait")){

                                                                Light_Cafe_au_Lait_Coffee_FilteredCoffee Light_Cafe_au_Lait = new Light_Cafe_au_Lait_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                                                Light_Cafe_au_Lait_List.add(Light_Cafe_au_Lait);
                                                                Light_Cafe_au_Lait_price = Light_Cafe_au_Lait.getPrice();

                                                                }

                                                                // Dark Roast Coffee
                                                                        if (arr[0].equals("Dark Roast Coffee")){

                                                                                Dark_Roast_Coffee_FilteredCoffee Dark_Roast_Coffee = new Dark_Roast_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                                                                Dark_Roast_Coffee_List.add(Dark_Roast_Coffee);
                                                                                Dark_Roast_Coffee_price = Dark_Roast_Coffee.getPrice();
                                                                        }

                                                                // Medum Iced Coffee
                                                                        if (arr[0].equals("Medium Iced Coffee")){

                                                                                Medium_Iced_Coffee_FilteredCoffee Medium_Iced_Coffee = new Medium_Iced_Coffee_FilteredCoffee(arr[0], arr[1], arr[2], arr[3], arr[4]);

                                                                                Medium_Iced_Coffee_List.add(Medium_Iced_Coffee);
                                                                                Medium_Iced_Coffee_price = Medium_Iced_Coffee.getPrice();
                                                                        }
                                                }

                                                } catch (FileNotFoundException e2) {
                                                e2.printStackTrace();
                                                }
                                        

                                // For the counts everytime the button was clicked in the temp file                
                                        // Affogato count
                                                for (int i = Affogato_count; i < Affogato_List.size(); i ++){
                                                        Affogato_count++;
                                                }
                        
                                        // // Americano count
                                                for (int i = Americano_count; i < Americanoo_List.size(); i ++){
                                                        Americano_count++;
                                                }
                        
                                        // // Mocha count
                                                for (int i = Mocha_count; i < Mocha_List.size(); i ++){
                                                        Mocha_count++;
                                                        // System.out.println(Mocha_List.get(i));
                                                }
                        
                                        // // Light Cafe au Lait count
                                                for (int i  = Light_Cafe_au_Lait_count ; i < Light_Cafe_au_Lait_List.size(); i ++){
                                                        Light_Cafe_au_Lait_count++;
                                                }
                        
                                        // // Dark Roast Coffee count
                                                for (int i  = Dark_Roast_Coffee_count ; i < Dark_Roast_Coffee_List.size(); i ++){
                                                        Dark_Roast_Coffee_count++;
                                                }
                        
                                        // // Medium Iced Coffee
                                                for (int i  = Medium_Iced_Coffee_count ; i < Medium_Iced_Coffee_List.size(); i ++){
                                                        Medium_Iced_Coffee_count++;
                                                }
                                        
                                        
                                       String temp_currently_Affogato = View_Orders_Label_Affoagto.getText();
                                       String temp_currently_Americano = View_Orders_Label_Americano.getText();
                                       String temp_currently_Mocha = View_Orders_Label_Mocha.getText();
                                       String temp_currently_Light_Cafe_au_Lait = View_Orders_Label_Light_Cafe_au_Lait.getText();
                                       String temp_currently_Dark_Roast_Coffee = View_Orders_Label_Dark_Roast_Coffee.getText();
                                       String temp_currently_Medium_Iced_Coffee = View_Orders_Label_Medium_Ice_Coffee.getText();

                                        
                                        // Write on the label
                                                 // Affogato
                                                        if (Affogato_count != 0 && !Affogato_List.isEmpty() ){
                                                                temp_currently_Affogato = ("Expresso: Affogato, " + "Currentlly in your cart you have: " + Affogato_count); 
                                                        }

                                                // Americano
                                                        if (Americano_count != 0 && !Americanoo_List.isEmpty() ){
                                                                temp_currently_Americano = ("Expresso: Americano, " + "Currentlly in your cart you have: " + Americano_count); 
                                                        }

                                                // Mocha
                                                        if (Mocha_count != 0 && !Mocha_List.isEmpty() ){
                                                                temp_currently_Mocha= ("Expresso: Mocha, " + "Currentlly in your cart you have: " + Mocha_count); 
                                                        }

                                                // Light Cafe au Lait
                                                         if (Light_Cafe_au_Lait_count != 0 && !Light_Cafe_au_Lait_List.isEmpty() ){
                                                                temp_currently_Light_Cafe_au_Lait= ("Filtered Coffee: Light Cafe au Lait, " + "Currentlly in your cart you have: " + Light_Cafe_au_Lait_count); 
                                                        }
                                                // Dark Roast Coffee
                                                         if (Dark_Roast_Coffee_count != 0 && !Dark_Roast_Coffee_List.isEmpty() ){
                                                                temp_currently_Dark_Roast_Coffee= ("Filtered: Dark Roast Coffee, " + "Currentlly in your cart you have:" + Dark_Roast_Coffee_count);
                                                        }
                                                // Medium Iced Coffee
                                                         if (Medium_Iced_Coffee_count != 0 && !Medium_Iced_Coffee_List.isEmpty() ){
                                                                temp_currently_Medium_Iced_Coffee= ("Filtered: Medium Iced Coffee, " + "Currentlly in your cart you have: " + Medium_Iced_Coffee_count);
                                                        }

                                                        View_Orders_Label_Affoagto.setText(temp_currently_Affogato);
                                                        View_Orders_Label_Americano.setText(temp_currently_Americano);
                                                        View_Orders_Label_Mocha.setText(temp_currently_Mocha);
                                                        View_Orders_Label_Light_Cafe_au_Lait.setText(temp_currently_Light_Cafe_au_Lait);
                                                        View_Orders_Label_Dark_Roast_Coffee.setText(temp_currently_Dark_Roast_Coffee);
                                                        View_Orders_Label_Medium_Ice_Coffee.setText(temp_currently_Medium_Iced_Coffee);
                                }
                        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
