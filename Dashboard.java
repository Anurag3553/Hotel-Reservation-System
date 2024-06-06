package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    JButton ub ,lg,nb,mb,lb,ab,cb, fb;
    JComboBox c1;
    JTextField Checkc1, Checkc2;
    Dashboard(){
        //THis is for creating Frame and image
        setBounds(100,20,1366,800);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Uiimage.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1200,700);
        add(images);
        
        //This for creating Text on Frame 
        JLabel text = new JLabel("Check-In (DD/MM/YY)");
        text.setBounds(110,550,2000,110);
        text.setForeground(Color.black);
        text.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t1 = new JLabel("Check-Out (DD/MM/YY)");
        t1.setBounds(450,550,2000,110);
        t1.setForeground(Color.black);
        t1.setFont(new Font("serif",Font.PLAIN,20));
        
        Checkc1 = new JTextField();
        Checkc1.setBounds(110,630,200,30);
        Checkc1.setFont(new Font("serif",Font.PLAIN,20));
        
        Checkc2 = new JTextField();
        Checkc2.setBounds(450,630,200,30);
        Checkc2.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t2 = new JLabel("Search Room");
        t2.setBounds(750,550,2000,110);
        t2.setForeground(Color.black);
        t2.setFont(new Font("serif",Font.PLAIN,20));
        
        String course[] = {"Simple Room","Dilux Room","Luxury Room","Supereme Simple Room","Supereme Dilux Room ","Supereme Luxury Room"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(750,630,180,30);
            
        
        
        //This is for creating Buttons on Dashboard like hotel management
        
        mb = new JButton("Register");
        mb.setBounds(1150,30,140,40);
        mb.addActionListener(this);
        mb.setForeground(Color.black);
        mb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        //This is for creating Button of Admin or About
        
        nb = new JButton("Submit");
        nb.setBounds(1050,610,150,50);
        nb.setBackground(Color.RED);
        nb.setForeground(Color.black);
        nb.addActionListener(this);
        nb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        lg = new JButton("Login");
        lg.setBounds(1050,30,90,40);
        lg.setForeground(Color.black);
        lg.addActionListener(this);
        lg.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        
        //This is for About Button
        
        
        ab = new JButton("Home");
        ab.setBounds(450,30,80,30);
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        ab.setForeground(Color.black);
        ab.setFont(new Font("serif",Font.PLAIN,15));
        
        fb = new JButton("Facilities");
        fb.setBounds(550,30,90,30);
        fb.setBackground(Color.WHITE);
        fb.addActionListener(this);
        fb.setForeground(Color.black);
        fb.setFont(new Font("serif",Font.PLAIN,15));
        
        ub = new JButton("About Us");
        ub.setBounds(650,30,100,30);
        ub.setBackground(Color.WHITE);
        ub.addActionListener(this);
        ub.setForeground(Color.black);
        ub.setFont(new Font("serif",Font.PLAIN,15));
        
        lb = new JButton("Location");
        lb.setBounds(780,30,90,30);
        lb.setBackground(Color.WHITE);
        lb.addActionListener(this);
        lb.setForeground(Color.black);
        lb.setFont(new Font("serif",Font.PLAIN,15));
        
        cb = new JButton("Contact");
        cb.setBounds(880,30,90,30);
        cb.setBackground(Color.WHITE);
        cb.addActionListener(this);
        cb.setForeground(Color.black);
        cb.setFont(new Font("serif",Font.PLAIN,15));
        
        images.add(fb);
        images.add(lg);
        images.add(ub);
        images.add(lb);
        images.add(cb);
        images.add(ab);
        images.add(nb);
        images.add(mb);
        images.add(text);
        images.add(t1);
        images.add(t2);
        images.add(c1);
        images.add(Checkc1);
        images.add(Checkc2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == lg){
            setVisible(false);
        new Login();
        }
        else if(ae.getSource() == ub){
            setVisible(false);
        new About();
        }
        else if(ae.getSource()== nb){
            setVisible(false);
        new Login();
        }
        else if(ae.getSource() == lb){
            setVisible(false);
            new Location();
        }
        else if(ae.getSource() == ab){
            JOptionPane.showMessageDialog(null,"You are already in Home Page ");
            setVisible(false);
            new Dashboard();
        }
        else if(ae.getSource() == cb){
            setVisible(false);
            new Contact();
        }
        else if(ae.getSource() == mb){
            setVisible(false);
            new Register();
        }
        else if(ae.getSource() == fb){
            setVisible(false);
            new Facilities1();
        }
    }
    public static void main(String[] args) {
        new Dashboard();
    }
    
}
