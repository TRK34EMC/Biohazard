import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.ImageIcon;																				//imports libraries
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;
public class Login implements ActionListener{

	JFrame f;
  JLabel l1;
	JLabel l2;
	JTextField tf1;
	JPasswordField p1;
  JButton b1 , b2 , b3 , b4;
	JLabel background;

Login(){

    f= new JFrame();
		l1 = new JLabel("Username: ");
		l1.setBounds(90,100,150,20);
		l1.setForeground(Color.WHITE);

		l2 = new JLabel("Password: ");
		l2.setBounds(90,130,150,20);
		l2.setForeground(Color.WHITE);

		ImageIcon image = new ImageIcon("log.jpg");
		background = new JLabel(image);



        tf1=new JTextField();
        tf1.setBounds(170,100,150,20);

		    p1 =new JPasswordField();
        p1.setBounds(170,130,150,20);

        b1=new JButton("Login");
        b1.setBounds(150,170,70,30);
        b1.addActionListener(this);
				b1.setOpaque(false);
				b1.setContentAreaFilled(false);
				b1.setBorderPainted(true);
				b1.setForeground(Color.WHITE);

				b2=new JButton("Sign-up");
        b2.setBounds(230,170,80,30);
				b2.addActionListener(this);
				b2.setOpaque(false);
				b2.setContentAreaFilled(false);
				b2.setBorderPainted(true);
				b2.setForeground(Color.WHITE);

				b3=new JButton("Forgot Password");
        b3.setBounds(110,210,135,30);
				b3.addActionListener(this);
				b3.setOpaque(false);
				b3.setContentAreaFilled(false);
				b3.setBorderPainted(true);
				b3.setForeground(Color.WHITE);

				b4=new JButton("Exit");
        b4.setBounds(270,210,80,30);
				b4.addActionListener(this);
				b4.setOpaque(false);
				b4.setContentAreaFilled(false);
				b4.setBorderPainted(true);
				b4.setForeground(Color.WHITE);




		    f.add(l1);
		    f.add(l2);
        f.add(tf1);
        f.add(p1);
		    f.add(b1);
				f.add(b2);
				f.add(b3);
				f.add(b4);
				f.add(background);
				f.pack();



				f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);

				f.setTitle("Login to BioHazard - Offline RPG game");				//sets frame title
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					// exits out of the program
				ImageIcon icon = new ImageIcon("bio.png");								// creates new image object
				f.setIconImage(icon.getImage());														// imports image object
				f.getContentPane().setBackground( new Color(153, 255 , 153));			// coloring R-G-B
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
		{
			String user = tf1.getText();
		 	String pass = p1.getText();
            if(user.equals("007") && pass.equals("666"))
			{
				f.setVisible(false);
				new Index();
			}
			else
			{
				showMessageDialog(null, "Invalid Username and password!");

			}

        }

				if(e.getSource() == b2)
				{
					f.setVisible(false);


				}

				if(e.getSource() == b3)
				{

					f.setVisible(false);


				}
				if(e.getSource() == b4)

				{

				System.exit(0);

			}
}
}
