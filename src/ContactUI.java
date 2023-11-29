import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ContactUI extends JFrame implements ActionListener {
	public JLabel l,l1,l2,l3,l4,l5;
	public JTextField t1,t2,t3,t4,t5;
	public JButton b1,b2;
	public Font f;
	
	public ContactUI() {

		// Set background color
		this.getContentPane().setBackground(new Color(Colors.bgr)); 

		// Set title of frame
		this.setTitle("Resume builder");

		// Format title text of frame
		f = new Font("SansSerif", Font.BOLD, 30);
		l = new JLabel("Contact Info");
		l.setFont(f);
		
		// Create labels for input fields
		l1 = new JLabel("First Name:");
		l2 = new JLabel("Last Name:");
		l3 = new JLabel("Date of Birth:");
		l4 = new JLabel("Phone Number:");
		l5 = new JLabel("Email Address:");
		
		// Create corresponding input text fields
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();

		// Create button to the next UI
		b1 = new JButton("Continue");
		b1.setForeground(new Color(Colors.button_text)); // Set font color
		b1.setBackground(new Color(Colors.button_bgr));  // Set background color
		
		// Set bounds
		l.setBounds(150, 10, 250,50);
		l1.setBounds(50,90,100,40);
		l2.setBounds(50,130,100,40);
		l3.setBounds(50,170,100,40);
		l4.setBounds(50,210,100,40);
		l5.setBounds(50,250,100,40);
		
		t1.setBounds(200,90,200,40);
		t2.setBounds(200,130,200,40);
		t3.setBounds(200,170,200,40);
		t4.setBounds(200,210,200,40);
		t5.setBounds(200,250,200,40);
		
		b1.setBounds(350,350,120,50);

		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(b1);


		b1.addActionListener(this);

		setSize(525,450);   //set size of the frame
		setLayout(null);    //set layout to null
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //to set the action of the cross button of the frame
		this.setLocationRelativeTo(null);
		setResizable(false);    //to disable the resizability feature of the frame
		setVisible(true);   // to make the frame visible
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if((e.getSource())==b1)
		{
			ContactInfo contactInfo1 = new ContactInfo();
			
			contactInfo1.setFirstName(t1.getText());
			contactInfo1.setLastName(t2.getText());
			contactInfo1.setDOB(t3.getText());
			contactInfo1.setPhoneNo(t4.getText());
			contactInfo1.setEmail(t5.getText());
			
			new EducationUI();
		
			this.dispose();
		}
	}
}
