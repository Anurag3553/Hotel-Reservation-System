package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
public class Reception extends JFrame implements ActionListener{
    Reception(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(180,15,1200,800);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/background2.jpg"));
        JLabel image = new JLabel(i4);
        image.setBounds(10,5,1500,800);
        add(image);
        
        JLabel text = new JLabel("Reception");
        text.setBounds(530,15,2000,110);
        text.setForeground(Color.white);
        text.setFont(new Font("serif",Font.PLAIN,70));
        image.add(text);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel18.jpg"));
        JLabel images = new JLabel(i3);
        images.setBounds(450,120,600,500);
        image.add(images);
        
        JButton bc = new JButton("Back");
        bc.setBounds(1000,660,100,30);
        bc.setForeground(Color.black);
        bc.addActionListener(this);
        bc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(bc);
        
        JButton mb = new JButton("New Customer Form");
        mb.setBounds(100,80,250,30);
        mb.setForeground(Color.black);
        mb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(mb);
        
        JButton rm = new JButton("Room");
        rm.setBounds(100,130,250,30);
        rm.setForeground(Color.black);
        rm.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(rm);
        
        JButton  dp = new JButton("Department");
        dp.setBounds(100,180,250,30);
        dp.setForeground(Color.black);
        dp.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(dp);
        
        JButton ap = new JButton("All Emplyee Info");
        ap.setBounds(100,230,250,30);
        ap.setForeground(Color.black);
        ap.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(ap);
        
        JButton ci = new JButton("Customer Info..");
        ci.setBounds(100,280,250,30);
        ci.setForeground(Color.black);
        ci.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(ci);
        
        JButton mi = new JButton("Manager Info..");
        mi.setBounds(100,330,250,30);
        mi.setForeground(Color.black);
        mi.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(mi);
        
        JButton co = new JButton("Check out");
        co.setBounds(100,380,250,30);
        co.setForeground(Color.black);
        co.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(co);
        
        JButton us = new JButton("Update Status");
        us.setBounds(100,430,250,30);
        us.setForeground(Color.black);
        us.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(us);
        
        JButton urs = new JButton("Update Room Status");
        urs.setBounds(100,480,250,30);
        urs.setForeground(Color.black);
        urs.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(urs);
        
        JButton pus = new JButton("Pickup Service");
        pus.setBounds(100,530,250,30);
        pus.setForeground(Color.black);
        pus.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(pus);
        
        JButton sr = new JButton("Search Room");
        sr.setBounds(100,580,250,30);
        sr.setForeground(Color.black);
        sr.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(sr);
        
        JButton lg = new JButton("Logout");
        lg.setBounds(100,630,250,30);
        lg.setForeground(Color.black);
        lg.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(lg);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Dashboard();        
    }
    
    public static void main(String[] args) {
        new Reception();
    }
    
}
