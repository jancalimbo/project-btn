import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main{
  
  public static void main(String[] args) {
    
    new MyFrame();
  }
}

class MyFrame extends JFrame implements ActionListener{
  
  JButton button;
  JLabel label;
  JLabel label2;
  
  MyFrame(){
    ImageIcon icon = new ImageIcon("danger-icon.png");

    label = new JLabel();
    label.setIcon(icon);
    label.setBounds(150, 250, 100, 100);
    label.setVisible(false);

    label2 = new JLabel();
    label2.setText("This is the end for you!");
    label2.setBounds(220, 245, 200, 100);
    label2.setVisible(false);

    button = new JButton();
    button.setBounds(200, 180, 200, 50);
    button.addActionListener(this);
    button.setText("Don't Press Me!");
    button.setFocusable(false);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setFont(new Font("Arial", Font.BOLD,20));
    button.setForeground(Color.PINK);
    button.setBackground(Color.BLACK);
    button.setBorder(BorderFactory.createEtchedBorder());


    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(600,500);
    this.setVisible(true);
    this.add(button);
    this.add(label);
    this.add(label2);

  }

  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
			button.setEnabled(false);
			label.setVisible(true);
			label2.setVisible(true);
    }
  }
}