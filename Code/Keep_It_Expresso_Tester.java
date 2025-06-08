package hw.hw4;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Keep_It_Expresso_Tester {
    public static void main(String[] args) {

        // Starting Window Frame 
            JFrame frame = new JFrame("Coffee Shop");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(641, 347);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));
        
        // JLabels
            JLabel element4 = new JLabel("Welcome to Keep It Expresso Coffee Shop.");
            element4.setBounds(167, 8, 336, 23);
            element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            element4.setForeground(Color.decode("#D9D9D9"));
            panel.add(element4);

            JLabel element5 = new JLabel("What kind of Coffee would you like?");
            element5.setBounds(184, 30, 243, 57);
            element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            element5.setForeground(Color.decode("#D9D9D9"));
            panel.add(element5);

        // Jbuttons
            JButton Filtered_Buttton = new JButton("Filtered Coffee Section");
            Filtered_Buttton.setBounds(38, 107, 239, 104);
            Filtered_Buttton.setBackground(Color.decode("#2e2e2e"));
            Filtered_Buttton.setForeground(Color.decode("#D9D9D9"));
            Filtered_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Filtered_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Filtered_Buttton.setFocusPainted(false);
            panel.add(Filtered_Buttton);

            JButton Expresso_Buttton = new JButton("Expresso Coffee Section");
            Expresso_Buttton.setBounds(359, 110, 238, 103);
            Expresso_Buttton.setBackground(Color.decode("#2e2e2e"));
            Expresso_Buttton.setForeground(Color.decode("#D9D9D9"));
            Expresso_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Expresso_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Expresso_Buttton.setFocusPainted(false);
            panel.add(Expresso_Buttton);

            JButton Exit_Buttton = new JButton("Leaving Store :(");
            Exit_Buttton.setBounds(210, 255, 200, 50);
            Exit_Buttton.setBackground(Color.decode("#2e2e2e"));
            Exit_Buttton.setForeground(Color.decode("#D9D9D9"));
            Exit_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Exit_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Exit_Buttton.setFocusPainted(false);
            panel.add(Exit_Buttton);

        frame.add(panel);
        frame.setVisible(true);

        // button window options

            // Button exit Program
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
                                        // File del = new File(directory);
                                        // delets the temp file
                                       if (temp.exists()){
                                               temp.delete();
                                       }
                                       System.exit(0);
                                }
                        });


            // Filtered option trigger
                Filtered_Buttton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Filtered_Buttton) {
                            Filtered_Gui_Window F_Window = new Filtered_Gui_Window();
                        }
                    }
                });

            // Expresso option trigger
                Expresso_Buttton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Expresso_Buttton) {
                            Expresso_Gui_Window E_Window = new Expresso_Gui_Window();
                        }
                    }
                });
    }
}