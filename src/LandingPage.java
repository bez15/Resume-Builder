// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LandingPage extends JFrame implements ActionListener {
   public JLabel l1;
   public JButton b1;
   public JButton b2;
   public Font f;

   public LandingPage() {
      ImageIcon var1 = new ImageIcon("rb-logo.png");
      this.setIconImage(var1.getImage());
      this.getContentPane().setBackground(new Color(Colors.bgr));
      this.setTitle("Resume Builder");
      this.f = new Font("SansSerif", 1, 40);
      this.l1 = new JLabel("Resume Builder");
      this.l1.setForeground(new Color(Colors.text));
      this.l1.setFont(this.f);
      this.b1 = new JButton("Start");
      this.b2 = new JButton("Quit");
      this.b1.setFocusable(false);
      this.b2.setFocusable(false);
      this.b1.setForeground(new Color(Colors.button_text));
      this.b2.setForeground(new Color(Colors.button_text));
      this.b1.setFont(new Font("SansSerif", 0, 17));
      this.b2.setFont(new Font("SansSerif", 0, 17));
      this.b1.setBackground(new Color(Colors.button_bgr));
      this.b2.setBackground(new Color(Colors.button_bgr));
      this.l1.setBounds(85, 50, 400, 100);
      this.b1.setBounds(120, 200, 100, 50);
      this.b2.setBounds(240, 200, 100, 50);
      this.add(this.l1);
      this.add(this.b1);
      this.add(this.b2);
      this.b1.addActionListener(this);
      this.b2.addActionListener(this);
      this.setLayout((LayoutManager)null);
      this.setSize(500, 500);
      this.setDefaultCloseOperation(3);
      this.setResizable(false);
      this.setLocationRelativeTo((Component)null);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.b1) {
         new ContactUI();
         this.dispose();
      } else {
         System.exit(0);
      }

   }
}

