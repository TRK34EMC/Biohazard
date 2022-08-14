import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
public class Index implements ActionListener{

	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel background;
  JButton b1 , b2 , b3;
  JFrame f;
	ButtonGroup bg;
	String[] options = {"Initator", "Ranger", "Operator"};
	JComboBox<String> dropdown;
	JRadioButton r1 , r2 , r3;
	JCheckBox c1, c2;


    Index(){
    f = new JFrame();
		l1 = new JLabel("Welcome to BioHazard");
		l1.setBounds(295,50,150,20);
		l1.setForeground(Color.WHITE);

		l2 = new JLabel("World's least popular Text based RPG game");
		l2.setBounds(230,80,250,20);
		l2.setForeground(Color.WHITE);

		l3 = new JLabel("Where the only action you can do is, pick your character gender,chose your career path and click the logout button");
		l3.setBounds(200,110,320,20);
		l3.setForeground(Color.WHITE);

		l4 = new JLabel("Choose your career Path:");
		l4.setBounds(70,180,150,20);
		l4.setForeground(Color.WHITE);

		l5 = new JLabel("Pick your character gender:");
		l5.setBounds(500,180,150,20);
		l5.setForeground(Color.WHITE);

		ImageIcon image = new ImageIcon("background.gif");
		background = new JLabel(image , JLabel.CENTER);

		bg = new ButtonGroup();

		dropdown = new JComboBox<>(options);
		dropdown.setBounds(280,140, 140, 20);

    b1 =new JButton("Logout");
    b1.setBounds(235,450,100,30);
    b1.addActionListener(this);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(true);
		b1.setForeground(Color.WHITE);

		b2 =new JButton("Back");
		b2.setBounds(365,450,100,30);
		b2.addActionListener(this);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(true);
		b2.setForeground(Color.WHITE);

		b3 =new JButton("Exit");
		b3.setBounds(300,500,100,30);
		b3.addActionListener(this);
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(true);
		b3.setForeground(Color.WHITE);


		r1 = new JRadioButton("The Fighter");
		r1.setBounds(90,200,100,30);
		r1.setOpaque(false);
		r1.setContentAreaFilled(false);
		r1.setBorderPainted(false);
		r1.setForeground(Color.WHITE);

		r2 = new JRadioButton("The Criminal");
		r2.setBounds(90,250,100,30);
		r2.setForeground(Color.WHITE);
		r2.setOpaque(false);
		r2.setContentAreaFilled(false);
		r2.setBorderPainted(false);

		r3 = new JRadioButton("The Executive");
		r3.setBounds(90,300,100,30);
		r3.setForeground(Color.WHITE);
		r3.setOpaque(false);
		r3.setContentAreaFilled(false);
		r3.setBorderPainted(false);

		c1 = new JCheckBox("Male");
		c1.setBounds(510,200,100,30);
		c1.setForeground(Color.WHITE);
		c1.setOpaque(false);
		c1.setContentAreaFilled(false);
		c1.setBorderPainted(false);

		c2 = new JCheckBox("Female");
		c2.setBounds(510,300,100,30);
		c2.setForeground(Color.WHITE);
		c2.setOpaque(false);
		c2.setContentAreaFilled(false);
		c2.setBorderPainted(false);


		  f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(l4);
			f.add(l5);
      f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(r1);
			f.add(r2);
			f.add(r3);
			f.add(c1);
			f.add(c2);
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			f.add(dropdown);
			f.add(background);
			f.pack();



				f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
        b1.setVisible(true);

				f.setTitle("BioHazard - Offline RPG game");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ImageIcon icon = new ImageIcon("bio.png");

				f.setIconImage(icon.getImage());
				f.getContentPane().setBackground( new Color(0, 0 , 0));
}
        public void actionPerformed(ActionEvent a) {

            if(a.getSource() == b1)
    		{
    			f.setVisible(false);
    			new Logout();

    			}

					if (a.getSource() == b2)
					{
						f.setVisible(false);

						new Login();

					}

					if (a.getSource() == b3)
					{

						System.exit(0);

					}



    }

}
