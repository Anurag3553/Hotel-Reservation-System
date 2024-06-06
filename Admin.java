
package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener{
    Admin(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(400,200,666,400);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/background2.jpg"));
        JLabel images = new JLabel(i3);
        images.setBounds(10,5,1500,800);
        add(images);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/Recep2.jpg"));
        JLabel image = new JLabel(i4);
        image.setBounds(200,50,500,200);
        images.add(image);
        
        JButton bc = new JButton("Back");
        bc.setBounds(1000,660,100,30);
        bc.setForeground(Color.black);
        bc.addActionListener(this);
        bc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        image.add(bc);
        
        JButton mb = new JButton("Add Employee");
        mb.setBounds(50,50,250,30);
        mb.setForeground(Color.black);
        mb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        images.add(mb);
        
        JButton ar = new JButton("Add Room");
        ar.setBounds(50,150,250,30);
        ar.setForeground(Color.black);
        //ar.addActionListener(this);
        ar.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        images.add(ar);
        
        JButton ad = new JButton("Add Drivers");
        ad.setBounds(50,250,250,30);
        ad.setForeground(Color.black);
        //ad.addActionListener(this);
        ad.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        images.add(ad);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Dashboard();        
    }
    public static void main(String[] args) {
        new Admin();    
    }
    
}
