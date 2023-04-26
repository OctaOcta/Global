import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MCQ2 extends JFrame implements ActionListener {
   // Declare variables
   JLabel question1,question2;
   JRadioButton o11, o12, o13, o14,o21,o22,o23,o24;
   JButton submitButton1,submitButton2;
   JLabel resultLabel;
   
   // Constructor
   public MCQ2() {
      // Set up JFrame
      setTitle("MCQ Exam");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 300);
     // setLayout(new FlowLayout());
      
      // Question 1
      question1 = new JLabel("What is the JAVA?");
      o11 = new JRadioButton("Programming language");
      o12 = new JRadioButton("Sweet Coffee");
      o13 = new JRadioButton("Celebrity");
      o14 = new JRadioButton("Operating System");
      submitButton1 = new JButton("Submit");
      resultLabel = new JLabel("");
      
      // Group radio buttons
      ButtonGroup group = new ButtonGroup();
      
      group.add(o11);
      group.add(o12);
      group.add(o13);
      group.add(o14);
      
      // Set layout
      setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
      ///  setLayout(new FlowLayout());
     //JPanel panel = new JPanel();
     //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      
      // Add components to JFrame
      add(question1);
      add(o11);
      add(o12);
      add(o13);
      add(o14);
      add(submitButton1);
      add(resultLabel);
      
      // Add action listener to submit button
      submitButton1.addActionListener(this);

      
      // Question 2
      question2 = new JLabel("What does oop stand for in java?");
      o21 = new JRadioButton("Object Oriented Programming");
      o22 = new JRadioButton("Orange On Plate");
      o23 = new JRadioButton("Only One piece");
      o24 = new JRadioButton("Onions On Pan");
      submitButton2 = new JButton("Submit");
      resultLabel = new JLabel("");
      
      // Group radio buttons
     ButtonGroup group2 = new ButtonGroup();
    // setLayout(new GridLayout(6, 6));
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

      group2.add(o21);
      group2.add(o22);
      group2.add(o23);
      group2.add(o24);
      
      // Set layout
     // setLayout(new FlowLayout());
     // setLayout(new GridLayout(6, 1));

      // Add components to JFrame
      add(question2);
      add(o21);
      add(o22);
      add(o23);
      add(o24);
      add(submitButton2);
      add(resultLabel);
      
      // Add action listener to submit button
      submitButton2.addActionListener(this);



      // Make JFrame visible
      setVisible(true);
   }
   
   // Implement actionPerformed method
   public void actionPerformed(ActionEvent e) {
    if (o11.isSelected()) {
        resultLabel.setText("Correct!");
     } else {
        resultLabel.setText("Incorrect.");
     } 
    if (o21.isSelected()) {
         resultLabel.setText("Correct!");
      } else {
         resultLabel.setText("Incorrect.");
      }
   }
   
   // Main method
   public static void main(String[] args) {
      new MCQ2();
   }
}
