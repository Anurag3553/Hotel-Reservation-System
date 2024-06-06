package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Contact extends JFrame implements ActionListener{
    JButton mb, bc, ab, lb, cb;
    Contact(){
        //THis is for creating Frame and image
        setBounds(100,20,1366,800);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Contact1.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1200,700);
        add(images);
        
        
        //This is for creating Buttons on Dashboard like hotel management
        
        mb = new JButton("Refresh");
        mb.setBounds(80,170,140,30);
        mb.addActionListener(this);
        mb.setForeground(Color.black);
        mb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        bc = new JButton("Cancle");
        bc.setBounds(1150,170,100,30);
        bc.addActionListener(this);
        bc.setForeground(Color.black);
        bc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        //This is for creating Button of Admin or About
        
       
        
       
        
        
        //This is for About Button
        
        
        ab = new JButton("Home");
        ab.setBounds(450,30,80,30);
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        ab.setForeground(Color.black);
        ab.setFont(new Font("serif",Font.PLAIN,15));
        
        
        
        
        JButton lb = new JButton("Location");
        lb.setBounds(580,30,90,30);
        lb.setBackground(Color.WHITE);
        lb.setForeground(Color.black);
        lb.setFont(new Font("serif",Font.PLAIN,15));
        
        JButton cb = new JButton("Contact");
        cb.setBounds(720,30,90,30);
        cb.setBackground(Color.WHITE);
        cb.setForeground(Color.black);
        cb.setFont(new Font("serif",Font.PLAIN,15));
        
       
        
        images.add(bc);
        
        images.add(lb);
        images.add(cb);
        images.add(ab);
       
        images.add(mb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == ab){
            setVisible(false);
        new Dashboard();
        }
        else if(ae.getSource() == bc){
            setVisible(false);
        new Dashboard();
        }
        else if(ae.getSource() == mb){
            setVisible(false);
            new Contact();
        }
        
    }
    public static void main(String[] args) {
        new Contact();
    }
    
}
