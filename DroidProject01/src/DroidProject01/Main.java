package DroidProject01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
  	   	
    	
//------First Frame -  the frame contains 5 panels, top, bottom, left, right, middle--------------------------------------------
    	JFrame frameFirst = new JFrame("User Registration");
    	frameFirst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frameFirst.setSize(1920, 1080);
        
        JPanel rightPanelFirst = new JPanel();
        rightPanelFirst.setBackground(Color.white);
        rightPanelFirst.setPreferredSize(new Dimension(150, 80));
        
        JPanel leftPanelFirst = new JPanel();
        leftPanelFirst.setBackground(Color.white);
        leftPanelFirst.setPreferredSize(new Dimension(150, 80));
        
        JPanel topPanelFirst = new JPanel();
        topPanelFirst.setLayout(null);
        topPanelFirst.setBackground(new Color(0,60,85));
        topPanelFirst.setPreferredSize(new Dimension(1920, 80));
        ImageIcon icon = new ImageIcon("C:\\Users\\vanca\\eclipse-workspace\\DroidProject01\\src\\Logo.png");
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBounds(0, 25, 300, 25);
        topPanelFirst.add(iconLabel);        
        
        JLabel topLabelFirst = new JLabel("Autumn-Winter Bootcamp");
        topLabelFirst.setForeground(Color.WHITE); 
        topLabelFirst.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30)); 
        topLabelFirst.setBounds(620, 25, 400, 25);
        topPanelFirst.add(topLabelFirst);
                
        JPanel bottomPanelFirst = new JPanel();
        bottomPanelFirst.setBackground(new Color(112,112,112));
        bottomPanelFirst.setPreferredSize(new Dimension(1920, 80));
        bottomPanelFirst.setLayout(null);
        
        JLabel bottomLabelFirst = new JLabel("Come to the dark side ... we have");
        bottomLabelFirst.setForeground(Color.WHITE); 
        bottomLabelFirst.setFont(new Font("Arial", Font.ROMAN_BASELINE, 24)); 
        bottomLabelFirst.setBounds(620, 25, 400, 25);
        bottomPanelFirst.add(bottomLabelFirst);        
        
        JPanel panelFirst = new JPanel();
        panelFirst.setBackground(new Color(244,245,248));
        panelFirst.setLayout(null);    
        
        ImageIcon icon2 = new ImageIcon("C:\\Users\\vanca\\eclipse-workspace\\DroidProject01\\src\\Logo2.png");
        JLabel iconLabel2 = new JLabel(icon2);
        iconLabel2.setBounds(120, 100,1140, 400);
        panelFirst.add(iconLabel2);  
        
//------Button for the first Frame-------------------------------------------------------------------------------------------------

        RoundButton roundButton = new RoundButton("Join Us");
        roundButton.setBounds(570, 530, 150, 40);
        roundButton.setLayout(new BorderLayout());   	
    	panelFirst.add(roundButton);
    	
        // Add action listener to button
    	roundButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//Code for the second frame
                JFrame frame = new JFrame("User Registration");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1920, 1080);
                
                JPanel rightPanel = new JPanel();
                rightPanel.setBackground(Color.white);
                rightPanel.setPreferredSize(new Dimension(150, 80));
                
                JPanel leftPanel = new JPanel();
                leftPanel.setBackground(Color.white);
                leftPanel.setPreferredSize(new Dimension(150, 80));
                
                JPanel topPanel = new JPanel();
                topPanel.setLayout(null);
                topPanel.setBackground(new Color(0,60,85));
                topPanel.setPreferredSize(new Dimension(1920, 80));
                ImageIcon icon = new ImageIcon("C:\\Users\\\\vanca\\\\eclipse-workspace\\\\DroidProject01\\\\src\\\\Logo.png");
                JLabel iconLabel = new JLabel(icon);
                iconLabel.setBounds(0, 25, 300, 25);
                topPanel.add(iconLabel);        
                
                JLabel topLabel = new JLabel("Autumn-Winter Bootcamp");
                topLabel.setForeground(Color.WHITE); 
                topLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30)); 
                topLabel.setBounds(620, 25, 400, 25);
                topPanel.add(topLabel);
                        
                JPanel bottomPanel = new JPanel();
                bottomPanel.setBackground(new Color(112,112,112));
                bottomPanel.setPreferredSize(new Dimension(1920, 80));
                bottomPanel.setLayout(null);
                
                JLabel bottomLabel = new JLabel("Come to the dark side ... we have");
                bottomLabel.setForeground(Color.WHITE); 
                bottomLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 24)); 
                bottomLabel.setBounds(620, 25, 400, 25);
                bottomPanel.add(bottomLabel);        
                
                JPanel panel = new JPanel();
                panel.setBackground(new Color(244,245,248));
                panel.setLayout(null);        
        		
                JLabel ApplicationFormLabel = new JLabel("Application Form");
                ApplicationFormLabel.setFont(new Font("Arial",Font.BOLD,20));
                ApplicationFormLabel.setForeground(new Color(0,60,85));
                ApplicationFormLabel.setBounds(550, 50, 300, 25);
                ApplicationFormLabel.setLayout(new BorderLayout());
                panel.add(ApplicationFormLabel);
                
                JLabel InformationLabel = new JLabel("Contact Information");
                InformationLabel.setFont(new Font("Arial",Font.BOLD,16));
                InformationLabel.setForeground(new Color(0,60,85));
                InformationLabel.setBounds(250, 115, 200, 25);
                InformationLabel.setLayout(new BorderLayout());
                panel.add(InformationLabel);
                //////////////////////////////////////
                JLabel firstNameLabel = new JLabel("First Name: ");
                firstNameLabel.setBounds(250, 165, 150, 25);
                firstNameLabel.setForeground(new Color(0,60,85));
                firstNameLabel.setLayout(new BorderLayout());
                JTextField firstNameField = new JTextField(15);
                firstNameField.setBackground(Color.white);
                firstNameField.setBounds(250, 185, 360, 25);
                firstNameField.setLayout(new BorderLayout());
                panel.add(firstNameLabel);
                panel.add(firstNameField);

                JLabel lastNameLabel = new JLabel("Last Name: ");
                lastNameLabel.setBounds(630, 165, 150, 25);
                lastNameLabel.setForeground(new Color(0,60,85));
                lastNameLabel.setLayout(new BorderLayout());
                JTextField lastNameField = new JTextField(15);
                lastNameField.setBackground(Color.white);
                lastNameField.setBounds(630, 185, 360, 25);
                lastNameField.setLayout(new BorderLayout());
                panel.add(lastNameLabel);
                panel.add(lastNameField);

                JLabel phoneLabel = new JLabel("Phone Number: ");
                phoneLabel.setBounds(250, 215, 150, 25);
                phoneLabel.setForeground(new Color(0,60,85));
                phoneLabel.setLayout(new BorderLayout());
                JTextField phoneField = new JTextField(10);
                phoneField.setBackground(Color.white);
                phoneField.setBounds(250, 235, 360, 25);
                phoneField.setLayout(new BorderLayout());
                panel.add(phoneLabel);
                panel.add(phoneField);
        
                JLabel emailLabel = new JLabel("Email Address: ");
                emailLabel.setBounds(630, 215, 150, 25);
                emailLabel.setForeground(new Color(0,60,85));
                emailLabel.setLayout(new BorderLayout());
                JTextField emailField = new JTextField(20);
                emailField.setBackground(Color.white);
                emailField.setBounds(630, 235, 360, 25);
                emailField.setLayout(new BorderLayout());
                panel.add(emailLabel);
                panel.add(emailField);
                
                JLabel address1LabelText = new JLabel("Address");
                address1LabelText.setFont(new Font("Arial",Font.BOLD,16));
                address1LabelText.setForeground(new Color(0,60,85));
                address1LabelText.setBounds(250, 285, 150, 25);
                address1LabelText.setLayout(new BorderLayout());
                panel.add(address1LabelText);

                JLabel address1Label = new JLabel("Address Line 1: ");
                address1Label.setBounds(250, 340, 150, 25);
                address1Label.setForeground(new Color(0,60,85));
                address1Label.setLayout(new BorderLayout());
                JTextField address1Field = new JTextField(25);
                address1Field.setBackground(Color.white);
                address1Field.setBounds(250, 360, 740, 25);
                address1Field.setLayout(new BorderLayout());
                panel.add(address1Label);
                panel.add(address1Field);

                JLabel address2Label = new JLabel("Address Line 2: ");
                address2Label.setBounds(250, 390, 150, 25);
                address2Label.setForeground(new Color(0,60,85));
                address2Label.setLayout(new BorderLayout());
                JTextField address2Field = new JTextField(25);
                address2Field.setBackground(Color.white);
                address2Field.setBounds(250, 410, 740, 25);
                address1Label.setLayout(new BorderLayout());
                panel.add(address2Label);
                panel.add(address2Field);

                JLabel countryLabel = new JLabel("Country: ");
                countryLabel.setBounds(250, 450, 150, 25);
                countryLabel.setForeground(new Color(0,60,85));
                countryLabel.setLayout(new BorderLayout());
                String[] CountryChoose = {"Romania","Bulgaria","SUA"};
                JComboBox countryField = new JComboBox(CountryChoose);
                countryField.setBackground(Color.white);
                countryField.setBounds(250, 470, 150, 25);
                countryField.setLayout(new BorderLayout());
                panel.add(countryLabel);
                panel.add(countryField);

                JLabel stateLabel = new JLabel("State: ");
                stateLabel.setBounds(520, 450, 150, 25);
                stateLabel.setLayout(new BorderLayout());
                stateLabel.setForeground(new Color(0,60,85));
                String[] StateChoose = {"No state found"};
                JComboBox stateField = new JComboBox(StateChoose);
                stateField.setBackground(Color.white);
                stateField.setBounds(520, 470, 150, 25);
                stateField.setLayout(new BorderLayout());
                panel.add(stateLabel);
                panel.add(stateField);

                JLabel cityLabel = new JLabel("City: ");
                cityLabel.setBounds(840, 450, 150, 25);
                cityLabel.setLayout(new BorderLayout());
                cityLabel.setForeground(new Color(0,60,85));
                String[] CityChoose = {"Iasi","Bucuresti","Cluj"};
                JComboBox cityField = new JComboBox(CityChoose);
                cityField.setBackground(Color.white);
                cityField.setBounds(840, 470, 150, 25);
                cityField.setLayout(new BorderLayout());
                panel.add(cityLabel);
                panel.add(cityField);

                
                RoundButton roundButton1 = new RoundButton("Join Us");
                roundButton1.setBounds(840, 530, 150, 40);
                roundButton1.setLayout(new BorderLayout());   	
                panel.add(roundButton1);            	
                
                // Add action listener to button
            	roundButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Frame for the third frame
                    	 JFrame summaryFrame = new JFrame("Submission Summary");
                         summaryFrame.setSize(1920, 1080);
                         
                         JPanel rightsummaryPanel = new JPanel();
                         rightsummaryPanel.setBackground(Color.white);
                         rightsummaryPanel.setPreferredSize(new Dimension(150, 80));
                         
                         JPanel leftsummaryPanel = new JPanel();
                         leftsummaryPanel.setBackground(Color.white);
                         leftsummaryPanel.setPreferredSize(new Dimension(150, 80));
                         
                         JPanel topsummaryPanel = new JPanel();
                         topsummaryPanel.setLayout(null);
                         topsummaryPanel.setBackground(new Color(0,60,85));
                         topsummaryPanel.setPreferredSize(new Dimension(1920, 80));
                         ImageIcon icon = new ImageIcon("C:\\Users\\\\vanca\\\\eclipse-workspace\\\\DroidProject01\\\\src\\\\Logo.png");
                         JLabel iconLabel = new JLabel(icon);
                         iconLabel.setBounds(0, 25, 300, 25);
                         topsummaryPanel.add(iconLabel);
                         
                         
                         JLabel topLabel = new JLabel("Autumn-Winter Bootcamp");
                         topLabel.setForeground(Color.WHITE); // Set the text color to white
                         topLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30)); // Set the font and size
                         topLabel.setBounds(620, 25, 400, 25);
                         topPanel.add(topLabel);
                                 
                         JPanel bottomsummaryPanel = new JPanel();
                         bottomsummaryPanel.setBackground(new Color(112,112,112));
                         bottomsummaryPanel.setPreferredSize(new Dimension(1920, 80));
                         bottomsummaryPanel.setLayout(null);
                         
                         JLabel bottomLabel = new JLabel("Come to the dark side ... we have");
                         bottomLabel.setForeground(Color.WHITE); // Set the text color to white
                         bottomLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 24)); // Set the font and size
                         bottomLabel.setBounds(620, 25, 400, 25);
                         bottomsummaryPanel.add(bottomLabel);
                                       
                         JPanel summaryPanel = new JPanel();
                         summaryPanel.setBackground(new Color(244,245,248));
                         summaryPanel.setLayout(null);
                                                  
                         summaryFrame.add(summaryPanel,BorderLayout.CENTER);
                         summaryFrame.add(rightsummaryPanel,BorderLayout.EAST);
                         summaryFrame.add(leftsummaryPanel,BorderLayout.WEST);
                         summaryFrame.add(topsummaryPanel,BorderLayout.NORTH);
                         summaryFrame.add(bottomsummaryPanel, BorderLayout.SOUTH);

                         JLabel message = new JLabel("Excellent!");
                         message.setFont(new Font("Arial",Font.BOLD,20));
                         message.setForeground(new Color(0,60,85));
                         message.setBounds(510, 50, 300, 25);
                         message.setLayout(new BorderLayout());
                         summaryPanel.add(message);

                         JTextArea summaryArea = new JTextArea(10, 20);
                         summaryArea.setText(
                                 "Name: " + firstNameField.getText() + " " + lastNameField.getText() + "\n" +
                                         "Phone: " + phoneField.getText() + "\n" +
                                         "Email: " + emailField.getText() + "\n" +
                                         "Address: " + address1Field.getText() + " " + address2Field.getText() + "\n" +
                                         "City: " + cityField.getToolkit() + "\n" +
                                         "State: " + stateField.getToolkit() + "\n" +
                                         "Country: " + countryField.getToolkit()
                         );
                         summaryArea.setEditable(false);
                         summaryArea.setFont(new Font("Arial", Font.BOLD, 12));
                         summaryArea.setForeground(new Color(0,60,85));
                         summaryArea.setBackground(new Color(244,245,248));
                         summaryArea.setBounds(510, 100, 400, 400);
                         summaryArea.setLayout(new BorderLayout());
                         summaryPanel.add(summaryArea);
                         summaryFrame.setVisible(true);
                    }
                });

                frame.add(topPanel, BorderLayout.NORTH);
                frame.add(bottomPanel, BorderLayout.SOUTH);
                frame.add(rightPanel,BorderLayout.EAST);
                frame.add(leftPanel,BorderLayout.WEST);
                frame.add(panel,BorderLayout.CENTER);       
                frame.setVisible(true);
            }});
    	
    	frameFirst.add(topPanelFirst, BorderLayout.NORTH);
    	frameFirst.add(bottomPanelFirst, BorderLayout.SOUTH);
    	frameFirst.add(rightPanelFirst,BorderLayout.EAST);
    	frameFirst.add(leftPanelFirst,BorderLayout.WEST);
    	frameFirst.add(panelFirst,BorderLayout.CENTER);       
    	frameFirst.setVisible(true);
    	
 
    	
    }
//    private static boolean validateFields() {
//        boolean isValid = true;
//
//        if (firstNameField.getText().trim().isEmpty()) {
//            isValid = false;
//            firstNameField.setBorder(BorderFactory.createLineBorder(Color.RED));
//        } else {
//            firstNameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        }
//
//        if (lastNameField.getText().trim().isEmpty()) {
//            isValid = false;
//            lastNameField.setBorder(BorderFactory.createLineBorder(Color.RED));
//        } else {
//            lastNameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        }
//        
//        if (phoneField.getText().trim().isEmpty()) {
//            isValid = false;
//            phoneField.setBorder(BorderFactory.createLineBorder(Color.RED));
//        } else {
//        	phoneField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        }
//        if (emailField.getText().trim().isEmpty()) {
//            isValid = false;
//            emailField.setBorder(BorderFactory.createLineBorder(Color.RED));
//        } else {
//        	emailField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        }
//
//        return isValid;
//    }
//    private static void displayMessage(String message) {
//        // Display a message in the lower part of the panel.
//    }
}
