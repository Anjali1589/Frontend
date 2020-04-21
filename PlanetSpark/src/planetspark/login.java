
package planetspark;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class login extends JFrame implements ActionListener
{
    JButton b1,b2;
    login()
    {
        super("Login Panel");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f=new Font("Serif",Font.BOLD,40);
        
        ImageIcon i1=new ImageIcon("C:\\Users\\Shyam\\Downloads\\38.jpg");
        Image img=i1.getImage();
        Image temp=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        JLabel j1=new JLabel("",i1,JLabel.CENTER);
        j1.setBounds(0,0,500,500);
        add(j1);
        
        JPanel p1=new JPanel();
        p1.setBounds(200, 230, 600, 200);
        p1.setBackground(new Color(30,40,50,100));
        setLocationRelativeTo(null);
        p1.setSize(400,300);
        p1.setLayout(new FlowLayout());
      
         j1.add(p1);
         Font f2=new Font("Serif",Font.BOLD,20);
         p1.setLayout(null);
        
        JLabel L1,L2;
        L1 = new JLabel("Username");
        L1.setBounds(40,70,100,30);
        L1.setForeground(Color.WHITE);
        L1.setFont(f2);
        p1.add(L1);
        
        L2 = new JLabel("Password");
        L2.setBounds(40,130,100,30);
        L2.setForeground(Color.WHITE);
        L2.setFont(f2);
        p1.add(L2);
 
        JTextField t1,t2;
        t1=new JTextField();
        t1.setBounds(140,70,180,30);
        p1.add(t1);

        t2=new JPasswordField();
        t2.setBounds(140,130,180,30);
        p1.add(t2);
        
      
        b1 = new JButton("Login");
        b1.setBounds(30,200,140,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setForeground(Color.black);
        p1.add(b1);
        
        b2=new JButton("Signup");
        b2.setBounds(240,200,140,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setForeground(Color.black);
        p1.add(b2);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

     public void actionPerformed(ActionEvent ae)
   {
    if(ae.getSource()==b1)
            {
               // new login().setVisible(false);
                new Project().setVisible(true);
                
            }
     if(ae.getSource()==b2)
            {
                System.exit(0);
            }
    }
    public static void main(String s[])
    {
        new login();
    }
}

