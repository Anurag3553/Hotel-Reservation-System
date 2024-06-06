package hotel.reservation.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rooms extends JFrame implements ActionListener{
    JButton cc, bc ,rf,nb1,nb,nb2,ab,ub,fb;
    Rooms(){
        //THis is for creating Frame and image
        setBounds(100,20,1366,800);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Uiimage5.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1200,700);
        add(images);
        
        //This for creating Text on Frame 
        JLabel text = new JLabel("Dilux Room");
        text.setBounds(200,410,2000,110);
        text.setForeground(Color.white);
        text.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t1 = new JLabel("Simple Room");
        t1.setBounds(600,410,2000,110);
        t1.setForeground(Color.white);
        t1.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t2 = new JLabel("Luxury Room");
        t2.setBounds(1050,410,2000,110);
        t2.setForeground(Color.white);
        t2.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t3 = new JLabel("Features:");
        t3.setBounds(100,430,2000,110);
        t3.setForeground(Color.RED);
        t3.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t4 = new JLabel("Features:");
        t4.setBounds(500,430,2000,110);
        t4.setForeground(Color.RED);
        t4.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t5 = new JLabel("Features:");
        t5.setBounds(930,430,2000,110);
        t5.setForeground(Color.RED);
        t5.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t6 = new JLabel("Rs.900 Per Night");
        t6.setBounds(200,580,2000,110);
        t6.setForeground(Color.CYAN);
        t6.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t7 = new JLabel("Rs.600 Per Night");
        t7.setBounds(600,580,2000,110);
        t7.setForeground(Color.CYAN);
        t7.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t8 = new JLabel("Rs.1200 Per Night");
        t8.setBounds(1020,580,2000,110);
        t8.setForeground(Color.CYAN);
        t8.setFont(new Font("serif",Font.PLAIN,20));
        
        JLabel t9 = new JLabel("Bedroom ,");
        t9.setBounds(170,450,2000,110);
        t9.setForeground(Color.white);
        t9.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t10 = new JLabel("Balcony ,");
        t10.setBounds(260,450,2000,110);
        t10.setForeground(Color.white);
        t10.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t11 = new JLabel("Kitchen");
        t11.setBounds(340,450,2000,110);
        t11.setForeground(Color.white);
        t11.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t13 = new JLabel("Bedroom  ,");
        t13.setBounds(600,450,2000,110);
        t13.setForeground(Color.white);
        t13.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t12 = new JLabel("Balcony");
        t12.setBounds(700,450,2000,110);
        t12.setForeground(Color.white);
        t12.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t14 = new JLabel("Bedroom ,");
        t14.setBounds(1000,450,2000,110);
        t14.setForeground(Color.white);
        t14.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t15 = new JLabel("Balcony ,");
        t15.setBounds(1080,450,2000,110);
        t15.setForeground(Color.white);
        t15.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t16 = new JLabel("Kitchen");
        t16.setBounds(1160,450,2000,110);
        t16.setForeground(Color.white);
        t16.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t17 = new JLabel("Faciltites :");
        t17.setBounds(100,480,2000,110);
        t17.setForeground(Color.white);
        t17.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t18 = new JLabel("Facilities :");
        t18.setBounds(500,480,2000,110);
        t18.setForeground(Color.white);
        t18.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t19 = new JLabel("Facilities :");
        t19.setBounds(930,480,2000,110);
        t19.setForeground(Color.white);
        t19.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t20 = new JLabel("Guest :");
        t20.setBounds(100,530,2000,110);
        t20.setForeground(Color.ORANGE);
        t20.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t21 = new JLabel("Guest :");
        t21.setBounds(500,530,2000,110);
        t21.setForeground(Color.ORANGE);
        t21.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t22 = new JLabel("Guest :");
        t22.setBounds(930,530,2000,110);
        t22.setForeground(Color.ORANGE);
        t22.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t23 = new JLabel("Air-Conditioner , Room Heater, Telivision, Geyeser");
        t23.setBounds(950,500,2000,110);
        t23.setForeground(Color.white);
        t23.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t24 = new JLabel("Air-Conditioner , Room Heater, Geyeser");
        t24.setBounds(550,500,2000,110);
        t24.setForeground(Color.white);
        t24.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t25 = new JLabel("Wifi, Air-Conditioner , Room Heater");
        t25.setBounds(160,500,2000,110);
        t25.setForeground(Color.white);
        t25.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t26 = new JLabel("3 Adults , 2 Childrens");
        t26.setBounds(160,540,2000,110);
        t26.setForeground(Color.white);
        t26.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t27 = new JLabel("5 Adults , 3 Childrens");
        t27.setBounds(560,540,2000,110);
        t27.setForeground(Color.white);
        t27.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t28 = new JLabel("8 Adults , 6 Childrens");
        t28.setBounds(990,540,2000,110);
        t28.setForeground(Color.white);
        t28.setFont(new Font("serif",Font.PLAIN,15));
        
        JLabel t29 = new JLabel("Guest :");
        t29.setBounds(930,540,2000,110);
        t29.setForeground(Color.white);
        t29.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t30 = new JLabel("Guest :");
        t30.setBounds(930,540,2000,110);
        t30.setForeground(Color.white);
        t30.setFont(new Font("serif",Font.PLAIN,18));
        
        JLabel t31 = new JLabel("Guest :");
        t31.setBounds(930,540,2000,110);
        t31.setForeground(Color.white);
        t31.setFont(new Font("serif",Font.PLAIN,18));
        //This is for creating Button of Admin or About
        
        nb = new JButton("Book Now");
        nb.setBounds(970,660,250,30);
        nb.setBackground(Color.GREEN);
        nb.addActionListener(this);
        nb.setForeground(Color.black);
        nb.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        
        JButton de = new JButton("More Detail");
        de.setBounds(970,700,250,30);
        de.setBackground(Color.WHITE);
        de.setForeground(Color.black);
        de.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        nb1 = new JButton("Book Now");
        nb1.setBounds(550,660,250,30);
        nb1.setBackground(Color.GREEN);
        nb1.addActionListener(this);
        nb1.setForeground(Color.black);
        nb1.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        JButton de1 = new JButton("More Detail");
        de1.setBounds(550,700,250,30);
        de1.setBackground(Color.WHITE);
        de1.setForeground(Color.black);
        de1.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        nb2 = new JButton("Book Now");
        nb2.setBounds(150,660,250,30);
        nb2.setBackground(Color.GREEN);
        nb2.addActionListener(this);
        nb2.setForeground(Color.black);
        nb2.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        JButton de2 = new JButton("More Detail");
        de2.setBounds(150,700,250,30);
        de2.setBackground(Color.WHITE);
        de2.setForeground(Color.black);
        de2.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        bc = new JButton("Next");
        bc.setBounds(1180,150,80,25);
        bc.addActionListener(this);
        bc.setForeground(Color.black);
        bc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        
        cc = new JButton("Cancle");
        cc.setBounds(1050,150,100,25);
        cc.addActionListener(this);
        cc.setForeground(Color.black);
        cc.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        //This is for About Button
        
        
        
        ab = new JButton("Home");
        ab.setBounds(450,30,80,30);
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        ab.setForeground(Color.black);
        ab.setFont(new Font("serif",Font.PLAIN,15));
        
        fb = new JButton("Facilities");
        fb.setBounds(540,30,90,30);
        fb.setBackground(Color.WHITE);
        fb.addActionListener(this);
        fb.setForeground(Color.black);
        fb.setFont(new Font("serif",Font.PLAIN,15));
        
        ub = new JButton("About Us");
        ub.setBounds(640,30,100,30);
        ub.setBackground(Color.WHITE);
        ub.addActionListener(this);
        ub.setForeground(Color.black);
        ub.setFont(new Font("serif",Font.PLAIN,15));
        
        JButton lb = new JButton("Location");
        lb.setBounds(750,30,90,30);
        lb.setBackground(Color.WHITE);
        lb.setForeground(Color.black);
        lb.setFont(new Font("serif",Font.PLAIN,15));
        
        JButton cb = new JButton("Contact");
        cb.setBounds(850,30,90,30);
        cb.setBackground(Color.WHITE);
        cb.setForeground(Color.black);
        cb.setFont(new Font("serif",Font.PLAIN,15));
        
        rf = new JButton("Refresh");
        rf.setBounds(100,150,100,25);
        rf.addActionListener(this);
        rf.setForeground(Color.black);
        rf.setFont(new Font("serif",Font.PLAIN,20));
        
        images.add(fb);
        images.add(rf);
        images.add(nb2);
        images.add(nb1);
        images.add(de1);
        images.add(de2);
        images.add(ub);
        images.add(lb);
        images.add(cb);
        images.add(ab);
        images.add(nb);
        images.add(cc);
        images.add(bc);
        images.add(text);
        images.add(t1);
        images.add(t2);
        images.add(t3);
        images.add(t4);
        images.add(t5);
        images.add(t6);
        images.add(t7);
        images.add(t8);
        images.add(t8);
        images.add(t9);
        images.add(t10);
        images.add(de);
        images.add(t11);
        images.add(t12);
        images.add(t13);
        images.add(t14);
        images.add(t15);
        images.add(t16);
        images.add(t17);
        images.add(t18);
        images.add(t19);
        images.add(t21);
        images.add(t20);
        images.add(t22);
        images.add(t23);
        images.add(t24);
        images.add(t25);
        images.add(t26);
        images.add(t27);
        images.add(t28);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == cc){
            setVisible(false);
            new Logout();
        }
        else if(ae.getSource() == bc){
            setVisible(false);
            new Room1();
        }
        else if(ae.getSource() == rf){
            setVisible(false);
            new Rooms();
        }
        else if(ae.getSource() == nb1){
            setVisible(false);
            new BookingForm();
        }
        else if(ae.getSource() == nb){
            setVisible(false);
            new BookingForm3();
        }
        else if(ae.getSource() == nb2){
            setVisible(false);
            new BookingForm2();
        }
        else if(ae.getSource() == ab){
            setVisible(false);
            new Logout();
        }
        else if(ae.getSource() == ub){
            setVisible(false);
            new About3();
        }
        else if(ae.getSource() == fb){
            setVisible(false);
            new Facilities2();
        }
    }
    public static void main(String[] args) {
        new Rooms();
    }
    
}
