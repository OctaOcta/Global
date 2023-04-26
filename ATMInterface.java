
 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATMInterface extends JFrame implements ActionListener {
    private JTextField amountField;
    private JLabel messageLabel;
    private JButton withdrawButton;
    private JButton depositButton;
    private JButton balanceButton;
    private double balance;

    public ATMInterface() {
        balance = 1000;	//initial balance by default

        // my components
        amountField = new JTextField(10);
        messageLabel = new JLabel("");
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        balanceButton = new JButton("Balance");

        // BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Enter Amount:"));
        panel.add(amountField);
        
        panel.add(Box.createVerticalStrut(10)); // vertical space
        
        panel.add(withdrawButton);
        
        panel.add(Box.createVerticalStrut(10)); // vertical space
        
        panel.add(depositButton);
        
        panel.add(Box.createVerticalStrut(10));  //vertical space
        
        panel.add(balanceButton);
        panel.add(messageLabel);

        // set action listeners
        withdrawButton.addActionListener(this);
        depositButton.addActionListener(this);
        balanceButton.addActionListener(this);

        // panel to frame
        add(panel);

        // my window properties
        setTitle("ATM Interface");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String amountString = amountField.getText();
        double amount = 0;
        if (!amountString.isEmpty()) {
            amount = Double.parseDouble(amountString);
        }

        if (e.getSource() == withdrawButton) {
            if (balance >= amount) {
                balance -= amount;
                messageLabel.setText("Rs. " + amount + " withdrawn successfully.");
            } else {
                messageLabel.setText("Insufficient funds.");
            }
        } else if (e.getSource() == depositButton) {
            balance += amount;
            messageLabel.setText("Rs. " + amount + " deposited successfully.");
        } else if (e.getSource() == balanceButton) {
            messageLabel.setText("Balance: Rs. " + balance);
        }
    }

    public static void main(String[] args) {
        new ATMInterface();
    }
}

 
   
