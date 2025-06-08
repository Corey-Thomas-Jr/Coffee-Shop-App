package hw.hw4;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Filtered_Gui_Window {
        static int[] coffeeCount = {0};

        Filtered_Gui_Window() {
                // Window Frame
                        JFrame frame = new JFrame("Coffee Shop: Filtered List");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(1155, 900);
                        JPanel panel = new JPanel();
                        panel.setLayout(null);
                        panel.setBackground(Color.decode("#1e1e1e"));

                // Options
                        JLabel Filtered_Coffee_options = new JLabel("Filtered Coffee options:");
                        Filtered_Coffee_options.setBounds(200, -1, 234, 44);
                        Filtered_Coffee_options.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
                        Filtered_Coffee_options.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Filtered_Coffee_options);

                // Filtered Coffee Buttons
                        JButton Light_Cafe_au_Lait_Button = new JButton("Light Cafe au Lait");
                        Light_Cafe_au_Lait_Button.setBounds(1, 38, 214, 62);
                        Light_Cafe_au_Lait_Button.setBackground(Color.decode("#2e2e2e"));
                        Light_Cafe_au_Lait_Button.setForeground(Color.decode("#D9D9D9"));
                        Light_Cafe_au_Lait_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Light_Cafe_au_Lait_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                        Light_Cafe_au_Lait_Button.setFocusPainted(false);
                        panel.add(Light_Cafe_au_Lait_Button);

                        JButton Dark_Roast_Coffee_Button = new JButton("Dark Roast Coffee");
                        Dark_Roast_Coffee_Button.setBounds(0, 136, 210, 61);
                        Dark_Roast_Coffee_Button.setBackground(Color.decode("#2e2e2e"));
                        Dark_Roast_Coffee_Button.setForeground(Color.decode("#D9D9D9"));
                        Dark_Roast_Coffee_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Dark_Roast_Coffee_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                        Dark_Roast_Coffee_Button.setFocusPainted(false);
                        panel.add(Dark_Roast_Coffee_Button);

                        JButton Medium_Iced_Coffee_Button = new JButton("Medium Iced Coffee");
                        Medium_Iced_Coffee_Button.setBounds(2, 231, 211, 70);
                        Medium_Iced_Coffee_Button.setBackground(Color.decode("#2e2e2e"));
                        Medium_Iced_Coffee_Button.setForeground(Color.decode("#D9D9D9"));
                        Medium_Iced_Coffee_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Medium_Iced_Coffee_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                        Medium_Iced_Coffee_Button.setFocusPainted(false);
                        panel.add(Medium_Iced_Coffee_Button);

                // Filtered Labels
                        JLabel Medium_Iced_Coffee_info = new JLabel(
                                "Description: Medium Iced coffee brewed with medium-roast beans has a smooth, balanced flavor with moderate acidity and light sweetness. It’s typically served chilled and is a great choice."); 
                                //for those who enjoy a cold, refreshing coffee.");
                        Medium_Iced_Coffee_info.setBounds(221, 237, 1000, 60);
                        Medium_Iced_Coffee_info.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 10));
                        Medium_Iced_Coffee_info.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Medium_Iced_Coffee_info);

                        JLabel Dark_Roast_Coffee_info = new JLabel(
                                "Description: Dark roast coffee is made from beans roasted longer, resulting in a deeper, richer flavor with smoky, bold, and sometimes slightly bitter notes."); 
                                //It's less acidic than lighter roasts and has a full-bodied, robust flavor.");
                        Dark_Roast_Coffee_info.setBounds(218, 138, 1000, 49);
                        Dark_Roast_Coffee_info.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 10));
                        Dark_Roast_Coffee_info.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Dark_Roast_Coffee_info);

                        JLabel Light_Cafe_au_Lait_info = new JLabel(
                                "Description: Café au Lait is made with equal parts brewed light roast coffee and steamed milk. This coffee is smooth and creamy, with the light roast offering a gentle and slightly fruity flavor.");
                        Light_Cafe_au_Lait_info.setBounds(219, 50, 1000, 62);
                        Light_Cafe_au_Lait_info.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 10));
                        Light_Cafe_au_Lait_info.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Light_Cafe_au_Lait_info);

                // Prices
                        JLabel Light_Cafe_au_Lait_Label = new JLabel("$3.00");
                        Light_Cafe_au_Lait_Label.setBounds(81, 21, 106, 17);
                        Light_Cafe_au_Lait_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Light_Cafe_au_Lait_Label.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Light_Cafe_au_Lait_Label);

                        JLabel Medium_Iced_Coffee_Label = new JLabel("$1.50");
                        Medium_Iced_Coffee_Label.setBounds(85, 119, 106, 17);
                        Medium_Iced_Coffee_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Medium_Iced_Coffee_Label.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Medium_Iced_Coffee_Label);

                        JLabel Dark_Roast_Coffee_Label = new JLabel("$2.50");
                        Dark_Roast_Coffee_Label.setBounds(84, 211, 106, 17);
                        Dark_Roast_Coffee_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Dark_Roast_Coffee_Label.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Dark_Roast_Coffee_Label);

                // Checkout button
                        JButton checkout_Button = new JButton("Checkout");
                        checkout_Button.setBounds(50, 370, 211, 70);
                        checkout_Button.setBackground(Color.decode("#2e2e2e"));
                        checkout_Button.setForeground(Color.decode("#D9D9D9"));
                        checkout_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        checkout_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                        checkout_Button.setFocusPainted(false);
                        panel.add(checkout_Button);

                // Checkout label
                        JLabel checkout_label = new JLabel("When you are done shoppping please checkout ^_^ ");
                        checkout_label.setBounds(10, 350, 400, 17);
                        checkout_label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        checkout_label.setForeground(Color.decode("#D9D9D9"));
                        panel.add(checkout_label);

                // Switch to Filtered list button
                        JButton Switch_Button = new JButton("Switch to Expresso Coffee");
                        Switch_Button.setBounds(500, 370, 211, 70);
                        Switch_Button.setBackground(Color.decode("#2e2e2e"));
                        Switch_Button.setForeground(Color.decode("#D9D9D9"));
                        Switch_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Switch_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                        Switch_Button.setFocusPainted(false);
                        panel.add(Switch_Button);

                // Switch to Filtered label
                        JLabel Switch_label = new JLabel("If you want to go to Filtered Coffees click me ^_^ ");
                        Switch_label.setBounds(460, 350, 400, 17);
                        Switch_label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Switch_label.setForeground(Color.decode("#D9D9D9"));
                        panel.add(Switch_label);
                        JLabel selectedCoffeeLabel = new JLabel("Selected: None");
                       
                // Your cart
                         selectedCoffeeLabel.setBounds(900, 10, 170, 20);
                        selectedCoffeeLabel.setForeground(Color.decode("#D9D9D9"));

                        JLabel coffeeCountLabel = new JLabel("Total:" + coffeeCount[0]);
                        coffeeCountLabel.setBounds(900, 30, 170, 20);
                        coffeeCountLabel.setForeground(Color.decode("#D9D9D9"));

                //orderstatus label
                        JLabel orderStatus_label = new JLabel("Order Status: ");
                        orderStatus_label.setBounds(900, 50, 300, 17);
                        orderStatus_label.setForeground(Color.decode("#D9D9D9"));
                        panel.add(orderStatus_label);

                //Prepare button
                        // Prepare button
                                JButton prepare_Button = new JButton("Prepare your order >:D");
                                prepare_Button.setBounds(380, 20, 160, 40);
                                prepare_Button.setBackground(Color.decode("#2e2e2e"));
                                prepare_Button.setForeground(Color.decode("#D9D9D9"));
                                prepare_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                                prepare_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                                prepare_Button.setFocusPainted(false);
                                panel.add(prepare_Button);
                       
                        //Prepare Label
                                JLabel prepareGuide_Label = new JLabel("Please click prepare after choosing an option");
                                prepareGuide_Label.setBounds(550, 10, 600, 58);
                                prepareGuide_Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
                                prepareGuide_Label.setForeground(Color.decode("#D9D9D9"));
                                panel.add( prepareGuide_Label);

                // View Orders
                        //Buttons
                                JButton View_Orders_Button = new JButton("View Orders");
                                View_Orders_Button.setBounds(850, 310, 211, 70);
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
                panel.add(selectedCoffeeLabel);
                panel.add(coffeeCountLabel);
                panel.add(View_Orders_Label);
                panel.add(View_Orders_Label_Affoagto);
                panel.add(View_Orders_Label_Americano);
                panel.add(View_Orders_Label_Mocha);
                panel.add(View_Orders_Label_Light_Cafe_au_Lait);
                panel.add(View_Orders_Label_Dark_Roast_Coffee);
                panel.add(View_Orders_Label_Medium_Ice_Coffee);

                // Exit Program
                        JButton Exit_Buttton = new JButton("Leaving Store :(");
                        Exit_Buttton.setBounds(850, 410, 200, 50);
                        Exit_Buttton.setBackground(Color.decode("#2e2e2e"));
                        Exit_Buttton.setForeground(Color.decode("#D9D9D9"));
                        Exit_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                        Exit_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                        Exit_Buttton.setFocusPainted(false);
                        panel.add(Exit_Buttton);

                // General way for all computers to run
                                String userHome = System.getProperty("user.home");
                                File directory = new File(userHome, "Order_History");
                                if (!directory.exists()){
                                        directory.mkdir();
                                }
                                File temp = new File(directory, "temporary.txt");

                // Button exit Program
                        Exit_Buttton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                        // deletes the temp file
                                       if (temp.exists()){
                                               temp.delete();
                                       }
                                       System.exit(0);
                                }
                        });

        // This way only works for Windows
                // // Folder path
                //         String folderpath = "C:/Order_History/";                                  
                // // generates order ID number
                //         // int orderID = (int) (Math.random() *  101);
                // // writing into text file info
                //         // String File_Name = "receipt_" + orderID + ".txt";
                //         String File_Name = "temporary.txt";
                // // making them into variables
                //         Path folder = Paths.get(folderpath);                
                //         Path file = folder.resolve(File_Name);
                // // creates new line to sort the coffees
                        // String newline = "\n";
                // // Creates folder and writes txt files in it
                //         try {
                //                 if (!Files.exists(folder)) {
                //                 Files.createDirectories(folder);
                //                 }

                String newline = "\n";

                                // Write some text to the file

                                        // Light Cafe au Lait
                                                Light_Cafe_au_Lait_Button.addActionListener(new ActionListener() {
                                                                public void actionPerformed(ActionEvent e) {
                                                                        coffeeCount[0]++;
                                                                        selectedCoffeeLabel.setText("Selected: Light Cafe au Lait");
                                                                        coffeeCountLabel.setText("Total: " + coffeeCount[0]);

                                                                        Light_Cafe_au_Lait_Coffee_FilteredCoffee Light_Cafe_au_Lait_object = new Light_Cafe_au_Lait_Coffee_FilteredCoffee("Light Cafe au Lait", "3.00", "Café au Lait is made with equal parts brewed light roast coffee and steamed milk. This coffee is smooth and creamy with the light roast offering a gentle and slightly fruity flavor.", "120", "Light" );
                                                                        String a = Light_Cafe_au_Lait_object.toString();
                                                                        

                                                        // new for cross-platfrom
                                                                try(FileWriter writer = new FileWriter(temp,true)){
                                                                        writer.write(newline);
                                                                        writer.write(a.toString());
                                                                        writer.write(newline);

                                                                        } catch (IOException e1) {
                                                                                e1.printStackTrace();
                                                                        }
                                                                }
                                                });

                                        // Dark Roast Coffee
                                                Dark_Roast_Coffee_Button.addActionListener(new ActionListener() {

                                                        public void actionPerformed(ActionEvent e) {
                                                                coffeeCount[0]++;
                                                                selectedCoffeeLabel.setText("Selected: Dark Roast Coffee");
                                                                coffeeCountLabel.setText("Total: " + coffeeCount[0]);

                                                                Dark_Roast_Coffee_FilteredCoffee Dark_Roast_Coffee_object = new Dark_Roast_Coffee_FilteredCoffee("Dark Roast Coffee", "1.50", "Dark roast coffee is made from beans roasted longer resulting in a deeper richer flavor with smoky bold and sometimes slightly bitter notes. It's less acidic than lighter roasts and has a full-bodied robust flavor.","200", "Dark" );
                                                                String a = Dark_Roast_Coffee_object.toString();
                                                              
                                                         // new for cross-platfrom
                                                                try(FileWriter writer = new FileWriter(temp,true)){
                                                                        writer.write(newline);
                                                                        writer.write(a.toString());
                                                                        writer.write(newline);

                                                                } catch (IOException e1) {
                                                                        e1.printStackTrace();
                                                                }
                                                        }
                                                });

                                        // Medium Iced Coffee
                                                Medium_Iced_Coffee_Button.addActionListener(new ActionListener() {

                                                        public void actionPerformed(ActionEvent e) {
                                                                coffeeCount[0]++;
                                                                selectedCoffeeLabel.setText("Selected: Medium Iced Coffee");
                                                                coffeeCountLabel.setText("Total: " + coffeeCount[0]);

                                                                Medium_Iced_Coffee_FilteredCoffee Medium_Iced_Coffee_object = new Medium_Iced_Coffee_FilteredCoffee("Medium Iced Coffee", "2.50", "Iced coffee brewed with medium-roast beans has a smooth balanced flavor with moderate acidity and light sweetness. It’s typically served chilled and is a great choice for those who enjoy a cold refreshing coffee.", "100", "Medium");
                                                                String a =  Medium_Iced_Coffee_object.toString();
                                                               

                                                        // new for cross-platfrom
                                                                try(FileWriter writer = new FileWriter(temp,true)){
                                                                        writer.write(newline);
                                                                        writer.write(a.toString());
                                                                        writer.write(newline);

                                                                } catch (IOException e1) {
                                                                        e1.printStackTrace();
                                                                }
                                                        }
                                                });

                // Checkout button trigger checkout window
                        checkout_Button.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                        frame.dispose();
                                        if (e.getSource() == checkout_Button) {
                                                Customer_Checkout_Gui E_Window = new Customer_Checkout_Gui();
                                        }
                                }
                        });

                // Switch button trigger to Expresso list
                        Switch_Button.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                        frame.dispose();
                                        if (e.getSource() == Switch_Button) {
                                                Expresso_Gui_Window E_Window = new Expresso_Gui_Window();
                                        }
                                        }
                                });

                //prepare button functionality
                                prepare_Button.addActionListener(new ActionListener() {

                                public void actionPerformed(ActionEvent e) {

                                        String filePath = temp.getPath();

                                        String lastLine = "";

                                        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                                        String line;
                                        while ((line = br.readLine()) != null) {
                                        lastLine = line;


                                        }

                                        String[] arr = lastLine.split(",");

                                        orderStatus_label.setText("Order Status: "+ arr[0] + "-" + "Active");
                                        } catch (IOException c) {

                                        c.printStackTrace();
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

                        // Resets count to zero if temp file doesn't exist
                                String userHome1 = System.getProperty("user.home");
                                File directory1 = new File(userHome1, "Order_History");
                                if (!directory1.exists()){
                                directory1.mkdir();
                                }
                                
                                File temp_file = new File(directory, "temporary.txt");
                                
                                if (!temp_file.exists()) {
                                coffeeCountLabel.setText("Total: 0");
                                }
                                

        frame.add(panel);
        frame.setVisible(true);
        
    }
}
