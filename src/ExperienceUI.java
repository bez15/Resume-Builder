import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ExperienceUI extends JFrame implements ActionListener
{
	public JLabel l,l1,l2,l3,l4;
	public JTextField t1,t2,t3,t4;
	public JButton b1;
	public Font f;
	
	public ExperienceUI() {
		
		//Set corner icon
		ImageIcon image = new ImageIcon("rb-logo.png"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of frame
		
		// Set background color and title of frame
		this.getContentPane().setBackground(new Color(Colors.bgr)); 
		this.setTitle("Resume builder"); 

		// Set frame title text
		f = new Font("SansSerif", Font.BOLD, 30);
		l = new JLabel("Work Experience");
		l.setFont(f);

		// Set labels
		l1 = new JLabel("Company");
		l2 = new JLabel("Description");
		l3 = new JLabel("From");
		l4 = new JLabel("To");
		
		// Set corresponding text fields
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		// Create Button
		b1 = new JButton("Save");
		b1.setForeground(new Color(Colors.button_text)); //sets font color
		b1.setBackground(new Color(Colors.button_bgr));  //sets background color


		l.setBounds(60, 20, 350,50);

		l1.setBounds(50, 100, 250,40);
		l2.setBounds(50, 140, 250,40);
		l3.setBounds(50, 180, 250,40);
		l4.setBounds(50, 220, 250,40);

		t1.setBounds(150, 100, 200,40);
		t2.setBounds(150, 140, 200,40);
		t3.setBounds(150, 180, 200,40);
		t4.setBounds(150, 220, 200,40);

		b1.setBounds(300, 330, 100,50);

		add(l);

		add(l1);
		add(l2);
		add(l3);
		add(l4);

		add(t1);
		add(t2);
		add(t3);
		add(t4);

		add(b1);
		
		b1.addActionListener(this);

		setLayout(null);    // Set layout to null
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Action of cross button
		this.setLocationRelativeTo(null);
		setResizable(false);    // Frame is not resizable
		setVisible(true);   // Make frame visible
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		ExperienceInfo ex = new ExperienceInfo();
		ex.addJob();
		ex.job1.setCompany(t1.getText());
		ex.job1.setDesc(t2.getText());
		ex.job1.setFrom(t3.getText());
		ex.job1.setTo(t4.getText());
		
		System.out.println("Saved your details");
		
		this.dispose();
		
	}

}
