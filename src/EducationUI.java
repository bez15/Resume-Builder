import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EducationUI extends JFrame implements ActionListener
{
	public JLabel l,l1,l2,l3;
	public JTextField t1,t2,t3;
	public JComboBox<Integer> j1,j2,j3,j4;
	public JButton b1;
	public Font f;
	
	public EducationUI() {

		// Set icon, title and background color
		ImageIcon image = new ImageIcon("rb-logo.png"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of frame
		this.getContentPane().setBackground(new Color(Colors.bgr)); //change color of background
		this.setTitle("Resume builder"); //sets title of frame

		// Set frame title text
		f = new Font("SansSerif", Font.BOLD, 30);
		l = new JLabel("Education");
		l.setFont(f);
		
		l1 = new JLabel("School 1:");
		l2 = new JLabel("School 2:");
		l3 = new JLabel("Time Period");
		
		t1 = new JTextField(); // School name
		t2 = new JTextField(); // School name
		j1 = new JComboBox<Integer>(); // Time from
		j2 = new JComboBox<Integer>(); // TIme to
		j3 = new JComboBox<Integer>(); // Time from
		j4 = new JComboBox<Integer>(); // Time to
		
		b1 = new JButton("Continue");

		// Drop-down menu
		for(int i=1970;i<=2030;i++){
	        j1.addItem(i);
		}
		for(int i=1970;i<=2030;i++){
	        j2.addItem(i);
		}
		for(int i=1970;i<=2030;i++){
	        j3.addItem(i);
		}
		for(int i=1970;i<=2030;i++){
	        j4.addItem(i);
		}
		
		//setbounds
		l.setBounds(150, 10, 250,50);
		
		l1.setBounds(30, 90, 250,40);
		l2.setBounds(30, 130, 250,40);
		
		l3.setBounds(430,50,250,20);
		
		t1.setBounds(110, 90, 200,40);
		t2.setBounds(110, 130, 200,40);
		
		j1.setBounds(350, 90, 100,40);
		j2.setBounds(350, 130, 100,40);
		
		j3.setBounds(470, 90, 100,40);
		j4.setBounds(470, 130, 100,40);
		
		b1.setBounds(400,200, 150,50);
		
		//adding elements
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		
		add(b1);
		b1.addActionListener(this);

		this.setSize(625,325);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //to set the action of the cross button of the frame
		this.setLocationRelativeTo(null);
		setResizable(false);    //to disable the resizability feature of the frame
		setVisible(true);   // to make the frame visible
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		new ExperienceUI();
		
		EducationInfo ei = new EducationInfo();
		
		ei.school1.setName(t1.getText());
		ei.school1.setFrom( (int) j1.getSelectedItem() );
		ei.school1.setTo( (int) j2.getSelectedItem() );
		
		if ( !t2.getText().equals("")) {
			ei.addSchool();
			ei.school2.setName(t2.getText());
			ei.school2.setFrom( (int) j3.getSelectedItem() );
			ei.school2.setTo( (int) j4.getSelectedItem() );
		}
		
		this.dispose();
	}

}
