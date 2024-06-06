package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    JButton bc,ub,ab;
    About(){
        //THis is for creating Frame and image
        setBounds(100,20,1366,800);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Uiimage7.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1200,700);
        add(images);
        
        
        //This is for creating Buttons on Dashboard like hotel management
        
        JButton mb = new JButton("Refresh");
        mb.setBounds(1150,30,140,40);
        mb.setForeground(Color.black);
        mb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        bc = new JButton("Back");
        bc.setBounds(80,120,100,30);
        bc.addActionListener(this);
        bc.setForeground(Color.black);
        bc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        //This is for creating Button of Admin or About
        
        JButton nb = new JButton("More Detail...");
        nb.setBounds(1030,650,180,30);
        nb.setBackground(Color.ORANGE);
        nb.setForeground(Color.black);
        nb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        JButton lg = new JButton("More Detail...");
        lg.setBounds(590,650,180,30);
        lg.setBackground(Color.ORANGE);
        lg.setForeground(Color.black);
        lg.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        
        //This is for About Button
        
        
        ab = new JButton("Home");
        ab.setBounds(450,30,80,30);
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        ab.setForeground(Color.black);
        ab.setFont(new Font("serif",Font.PLAIN,15));
        
        
        
        ub = new JButton("More Detail...");
        ub.setBounds(150,650,180,30);
        ub.setBackground(Color.ORANGE);
        ub.addActionListener(this);
        ub.setForeground(Color.black);
        ub.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
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
        
       
        images.add(lg);
        images.add(bc);
        images.add(ub);
        images.add(lb);
        images.add(cb);
        images.add(ab);
        images.add(nb);
        images.add(mb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == bc){
            setVisible(false);
        new Dashboard();
        }
        else if(ae.getSource() == ub){
            setVisible(false);
        new AboutAnurag();
        }
        else if(ae.getSource() == ab){
            setVisible(false);
            new Dashboard();
        }
        
    }
    public static void main(String[] args) {
        new About();
    }
    
}
