import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.ImageIcon;
import java.awt.Color;
public class Logout implements ActionListener
{
  JFrame f;
  JButton b1;
  JLabel l1;
  JLabel l2;
  JLabel background;




  Logout()
  {
    f = new JFrame();

    l1 = new JLabel("You have logged out successfully");
    l1.setBounds(110,80,250,20);
    l1.setForeground(Color.WHITE);

    l2 = new JLabel("Thanks for playing! :D");
	  l2.setBounds(150,110,150,20);
  	l2.setForeground(Color.WHITE);

    ImageIcon image = new ImageIcon("log.jpg");
    background = new JLabel(image);



    b1 = new JButton("Go back to login page");
    b1.setBounds(130,140,160,30);
    b1.setOpaque(false);
    b1.setContentAreaFilled(false);
    b1.setBorderPainted(true);
    b1.addActionListener(this);
    b1.setForeground(Color.WHITE);


    f.add(b1);
    f.add(l1);
    f.add(l2);
    f.add(background);
    f.pack();


    f.setLayout(null);
    f.setVisible(true);

    f.setTitle("Log out page BioHazard - Offline RPG game");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon icon = new ImageIcon("bio.png");
    f.setIconImage(icon.getImage());
    f.getContentPane().setBackground( new Color(255, 255 , 190));
    f.setLocationRelativeTo(null);


  }

  public void actionPerformed(ActionEvent c) {

      if(c.getSource()==b1)
  {
    f.setVisible(false);
    new Login();

    }


  }


}
