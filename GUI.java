/**
 * GUI is the main user interface for the vending machine. It sends all user input to the Machine.
 *
 * @author Adam berndt, Kayla Bullock, Jackson Cavanaugh, Michael Embry, Zephen Stevens-Avery
 * @version 3.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener,GUIable {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button0;
    private JButton button2;
    private JButton button3;
    private JButton buttonC;
    private JButton buttonA;
    private JButton button4;
    private JButton buttonE;
    private JButton buttonD;
    private JButton buttonB;
    private JButton buttonF;
    private JButton button6;
    private JButton button8;
    private JButton button5;
    private JButton button7;
    private JButton button9;
    private JPanel picture;
    private JPanel buttonAlley;
    private JPanel southPanel;
    private JPanel northPanel;
    private JButton dollarButton;
    private JButton quartersButton;
    private JPanel centerPanel;
    private JLabel priceLabel;
    private JButton enterButton;
    private JLabel codeLabel;
    private JLabel moneyLabel;
    //Variables for methods
    private double money;
    private String item;
    private String message;
    private String letter, number;

    private JFrame frame;
    Controller control;
    private double price = 0.0;
    private String change;
    private boolean machineStatus;

    /**
     * Constructor for objects of class GUI
     */
    public GUI(Controller control) {
        this.control = control;
        machineStatus = control.getMachineStatus();
        
        frame = new JFrame("Where da frame?");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setupUI();
        frame.add(mainPanel);
        frame.setVisible(true);
        if(machineStatus == false)
        {
            priceLabel.setText("Machine creation failed!!");
        }
    }

    /**
     * This method creates the GUI
     *
     * @param void
     * @return void
     */
    private void setupUI() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.setMaximumSize(new Dimension(318, 427));
        mainPanel.setOpaque(true);
        mainPanel.setVisible(true);
        southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.add(southPanel, BorderLayout.SOUTH);


        // Buttons
        buttonAlley = new JPanel();
        buttonAlley.setLayout(new GridBagLayout());
        southPanel.add(buttonAlley, BorderLayout.EAST);
        button0 = new JButton();
        button0.setText("0");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        buttonAlley.add(button0, gbc);
        button1 = new JButton();
        button1.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        buttonAlley.add(button1, gbc);
        button2 = new JButton();
        button2.setText("2");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button2, gbc);
        button3 = new JButton();
        button3.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button3, gbc);
        buttonC = new JButton();
        buttonC.setText("C");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(buttonC, gbc);
        buttonA = new JButton();
        buttonA.setText("A");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(buttonA, gbc);
        button4 = new JButton();
        button4.setText("4");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button4, gbc);
        buttonE = new JButton();
        buttonE.setText("E");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(buttonE, gbc);
        buttonD = new JButton();
        buttonD.setText("D");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(buttonD, gbc);
        buttonB = new JButton();
        buttonB.setText("B");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(buttonB, gbc);
        buttonF = new JButton();
        buttonF.setText("F");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(buttonF, gbc);
        button6 = new JButton();
        button6.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button6, gbc);
        button8 = new JButton();
        button8.setText("8");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button8, gbc);
        button5 = new JButton();
        button5.setText("5");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button5, gbc);
        button7 = new JButton();
        button7.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button7, gbc);
        button9 = new JButton();
        button9.setText("9");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonAlley.add(button9, gbc);
        picture = new JPanel();
        picture.setLayout(new GridBagLayout());
        southPanel.add(picture, BorderLayout.CENTER);
        northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.add(northPanel, BorderLayout.NORTH);

        // Money set up
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        northPanel.add(panel1, BorderLayout.EAST);
        moneyLabel = new JLabel();
        moneyLabel.setText("Money");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(moneyLabel, gbc);
        dollarButton = new JButton();
        dollarButton.setText("Dollar");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(dollarButton, gbc);
        quartersButton = new JButton();
        quartersButton.setText("Quarters");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(quartersButton, gbc);
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setVisible(true);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        enterButton = new JButton();
        enterButton.setText("Enter");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(enterButton, gbc);

        // Labels
        codeLabel = new JLabel();
        codeLabel.setText("This is your selection:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        centerPanel.add(codeLabel, gbc);
        priceLabel = new JLabel();
        priceLabel.setText("Price");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        centerPanel.add(priceLabel, gbc);

        // Listeners
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        dollarButton.addActionListener(this);
        quartersButton.addActionListener(this);
        enterButton.addActionListener(this);

    }


    /**
     * @noinspection ALL

    public JComponent $$$getRootComponent$$$() {
    return mainPanel;
    }
     */


    /**
     * This method checks if an action occured on the GUI
     * @param e
     * @return void
     */
    public void actionPerformed(ActionEvent e) {
        String temp = "", temp1 = "", tempQ = "", tempD = "";
        double tempCash = 0.0;
        if (e.getActionCommand().equals("A")) {
            temp = buttonA.getText();
            System.out.println("Button A was pressed");
            codeLabel.setText("A");
            letter = "A";
        } else if (e.getActionCommand().equals("B")) {
            temp = buttonB.getText();
            System.out.println("Button B was pressed");
            codeLabel.setText("B");
            letter = "B";
        } else if (e.getActionCommand().equals("C")) {
            temp = buttonC.getText();
            System.out.println("Button C was pressed");
            codeLabel.setText("C");
            letter = "C";
        } else if (e.getActionCommand().equals("D")) {
            temp = buttonD.getText();
            System.out.println("Button D was pressed");
            codeLabel.setText("D");
            letter = "D";
        } else if (e.getActionCommand().equals("E")) {
            temp = buttonE.getText();
            System.out.println("Button E was pressed");
            codeLabel.setText("E");
            letter = "E";
        } else if (e.getActionCommand().equals("F")) {
            temp = buttonF.getText();
            System.out.println("Button F was pressed");
            codeLabel.setText("F");
            letter = "F";
        } else if (e.getActionCommand().equals("0")) {
            temp1 = button0.getText();
            System.out.println("Button 0 was pressed");
            codeLabel.setText(letter + "0");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("1")) {
            temp1 = button1.getText();
            System.out.println("Button 1 was pressed");
            codeLabel.setText(letter + "1");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("2")) {
            temp1 = button2.getText();
            System.out.println("Button 2 was pressed");
            codeLabel.setText(letter + "2");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("3")) {
            temp1 = button3.getText();
            System.out.println("Button 3 was pressed");
            codeLabel.setText(letter + "3");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("4")) {
            temp1 = button4.getText();
            System.out.println("Button 4 was pressed");
            codeLabel.setText(letter + "4");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("5")) {
            temp1 = button5.getText();
            System.out.println("Button 5 was pressed");
            codeLabel.setText(letter + "5");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("6")) {
            temp1 = button6.getText();
            System.out.println("Button 6 was pressed");
            codeLabel.setText(letter + "6");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("7")) {
            temp1 = button7.getText();
            System.out.println("Button 7 was pressed");
            codeLabel.setText(letter + "7");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("8")) {
            temp1 = button8.getText();
            System.out.println("Button 8 was pressed");
            codeLabel.setText(letter + "8");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("9")) {
            temp1 = button9.getText();
            System.out.println("Button 9 was pressed");
            codeLabel.setText(letter + "9");
            TriggerSendingPrice();
        } else if (e.getActionCommand().equals("Quarters")) {
            tempCash = .25;
            System.out.println("Quarter button was pressed");
            money = money + .25;
            moneyLabel.setText(String.valueOf(money));
        }else if (e.getActionCommand().equals("Dollar")) {
            tempCash = 1.00;
            System.out.println("Dollar button was pressed");
            money = money + 1.00;
            moneyLabel.setText(String.valueOf(money));
        }else if (e.getActionCommand().equals("Enter")) {
            System.out.println("Enter button was pressed");
            TriggerSendingCashAmount();
        }
    }

    /**
     * This method sends the cash amount to the controller.
     *
     * @param void
     * @return void
     */
    private void TriggerSendingCashAmount()
    {
        try {

            if(Double.parseDouble(moneyLabel.getText()) < control.sendSelectionToMachine(codeLabel.getText())){
                priceLabel.setText("Please enter enough money: " +  control.sendSelectionToMachine(codeLabel.getText()));
            }
            else {
                change = control.sendCashAmountToMachine(codeLabel.getText(), moneyLabel.getText());

                System.out.println("Sent: " + codeLabel.getText()
                        + ":" + moneyLabel.getText());
                //need to deal with response
                priceLabel.setText("VendingProduct...change amount: " + change);
                moneyLabel.setText(change);
                money = Double.parseDouble(change);
                control.dispenseItem(codeLabel.getText());
                money = 0;
                moneyLabel.setText("Money");
            }
        }
        catch (Exception e){
            codeLabel.setText("Please try again");
    }
    }

    /**
     * This method sends the item code to the machine and returns the price.
     *
     * @param void
     * @return void
     */
    private void TriggerSendingPrice()
    {
        //need to deal with response
        price = 0;
        System.out.println(control.sendSelectionToMachine(getCurrentCode()));
        if(control.sendSelectionToMachine(getCurrentCode()) == -1)
        {
            // Display an error, selection does not exist or does not have a price
            priceLabel.setText("Selection does not exist or does not have a valid price. Please make another selection.");
        }
        else if(control.sendSelectionToMachine(getCurrentCode()) == -2)
        {
            priceLabel.setText("Selection is out of stock. Please make another selection.");
        }
        else
        {
            price = control.sendSelectionToMachine(getCurrentCode());
            //get price from machine
            System.out.println("Sent " + getCurrentCode() + " to machine.");
            //display price to user
            priceLabel.setText("Please Pay "+ price);
            //await money            
        }
    }

    /**
     * This method gets the item code from the GUI.
     *
     * @param void
     * @return code String Stores the item code
     */
    private String getCurrentCode()
    {
        String code = codeLabel.getText();
        return code;
    }

    /**
     * This method sets the money Label
     *
     * @param void
     * @return cash String Stores the cash input
     */
    private String getCurrentCash() {
        String cash = moneyLabel.getText();
        return cash;
    }
}
