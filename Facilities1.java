package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Facilities1 extends JFrame implements ActionListener{
    JButton mb, bc, ab, lb, cb;
    Facilities1(){
        //THis is for creating Frame and image
        setBounds(-7,2,1666,900);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Homed.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1200,700);
        add(images);
        
        
        //This is for creating Buttons on Dashboard like hotel management
        
       
        
        bc = new JButton("Back");
        bc.setBounds(1250,50,100,30);
        bc.addActionListener(this);
        bc.setForeground(Color.black);
        bc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        //This is for creating Button of Admin or About
        
        //This is for About Button
        
        
       
        
        images.add(bc);
        
        
       
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == bc){
            setVisible(false);
        new Dashboard();
        }
        
    }
    public static void main(String[] args) {
        new Facilities1();
    }
    
}
