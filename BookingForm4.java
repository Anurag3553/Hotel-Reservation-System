
package hotel.reservation.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//for resultset
import java.sql.*;
public class BookingForm4 extends JFrame implements ActionListener{
    
    JTextField username,  address, password ,Checkc1,Checkc2;
    //JPasswordField password;
    JButton pay,cancle, back, h1, h2,h3,h4;
    
    JComboBox c1;
    
    
    BookingForm4(){
        //this is for set Backgrounf frame color
        
        
        JLabel user = new JLabel("Name");
        user.setBounds(950,150,2000,110);
        user.setForeground(Color.black);
        user.setFont(new Font("serif",Font.PLAIN,25));
        add(user);   
        // 2nd Layout
        JLabel pass = new JLabel("Phone Number");
        pass.setBounds(1180,150,2000,110);
        pass.setForeground(Color.black);
        pass.setFont(new Font("serif",Font.PLAIN,25));
        add(pass);  
        
        JLabel h5 = new JLabel("Supereme Luxury Room");
        h5.setBounds(80,640,2000,110);
        h5.setForeground(Color.black);
        h5.setFont(new Font("serif",Font.ROMAN_BASELINE,30));
        add(h5);
        
        JLabel addr = new JLabel("Address");
        addr.setBounds(950,280,2000,110);
        addr.setForeground(Color.black);
        addr.setFont(new Font("serif",Font.PLAIN,30));
        add(addr); 
        
        JLabel cc1 = new JLabel("Check-in");
        cc1.setBounds(950,400,2000,110);
        cc1.setForeground(Color.black);
        cc1.setFont(new Font("serif",Font.PLAIN,30));
        add(cc1);
        
        Checkc1 = new JTextField();
        Checkc1.setBounds(950,500,200,30);
        Checkc1.setFont(new Font("serif",Font.PLAIN,20));
        add(Checkc1);
        
        JLabel Room = new JLabel("Room.No.");
        Room.setBounds(1100,280,2000,110);
        Room.setForeground(Color.black);
        Room.setFont(new Font("serif",Font.PLAIN,30));
        add(Room);
        
        String course[] = {"301","302","303","303","305"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(1250,320,100,30);
        add(c1);
        JLabel cc2 = new JLabel("check-out");
        cc2.setBounds(1180,400,2000,110);
        cc2.setForeground(Color.black);
        cc2.setFont(new Font("serif",Font.PLAIN,30));
        add(cc2);
        
        Checkc2 = new JTextField();
        Checkc2.setBounds(1180,500,200,30);
        Checkc2.setFont(new Font("serif",Font.PLAIN,20));
        add(Checkc2);
        //trhis is for creating Filling box
        username = new JTextField();
        username.setBounds(950,250,200,30);
        username.setFont(new Font("serif",Font.PLAIN,20));
        add(username);
        //2nd Filling Box
        password = new JTextField();
        password.setBounds(1180,250,200,30);
        password.setFont(new Font("serif",Font.PLAIN,20));
        add(password);
        
        address = new JTextField();
         address .setBounds(950,380,430,30);
         address.setFont(new Font("serif",Font.PLAIN,20));
        add( address );
        
        //this is for creating Button
        pay = new JButton("Pay Now");
        pay.setBounds(950,600,430,30);
        pay.setBackground(Color.green);
        pay.addActionListener(this);
        pay.setForeground(Color.white);
        pay.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        add(pay);
        
        h1 = new JButton("Home");
        h1.setBounds(350,30,90,30);
        h1.setBackground(Color.white);
        h1.addActionListener(this);
        h1.setForeground(Color.black);
        h1.setFont(new Font("serif",Font.PLAIN,20));
        add(h1);
        
        h2 = new JButton("Facilities");
        h2.setBounds(500,30,120,30);
        h2.setBackground(Color.white);
        h2.addActionListener(this);
        h2.setForeground(Color.black);
        h2.setFont(new Font("serif",Font.PLAIN,20));
        add(h2);
        
        h3 = new JButton("About Us");
        h3.setBounds(700,30,120,30);
        h3.setBackground(Color.white);
        h3.addActionListener(this);
        h3.setForeground(Color.black);
        h3.setFont(new Font("serif",Font.PLAIN,20));
        add(h3);
        
        h4 = new JButton("Refresh");
        h4.setBounds(900,30,120,30);
        h4.setBackground(Color.white);
        h4.addActionListener(this);
        h4.setForeground(Color.black);
        h4.setFont(new Font("serif",Font.PLAIN,20));
        add(h4);
        
       
        //2md Button
        cancle = new JButton("Cancel");
        cancle.setBounds(950,650,430,30);
        cancle.setBackground(Color.blue);
        cancle.addActionListener(this);
        cancle.setForeground(Color.white);
        cancle.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        add(cancle);
        
        back = new JButton("Back");
        back.setBounds(1200,50,100,30);
        back.addActionListener(this);
        back.setForeground(Color.black);
        back.setFont(new Font("serif",Font.CENTER_BASELINE,25));
        add(back);
        
        
        
       
        
        
        
        // this is for create a frame 
        setBounds(-7,2,1666,900);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Booking5.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,700,450);
        add(images);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == pay){
            String c4 = (String) c1.getSelectedItem();
            String user = username.getText();
            String pass = password.getText();
            String add = address.getText();
            String c3 = Checkc1.getText();
            String c2 = Checkc2.getText();
            
            try{
                Conn c = new  Conn();
            
                 String query = "INSERT INTO Room values( '"+c4+"','"+user+"', '"+pass+"', '"+add+"','"+c3+"','"+c2+"')";
                //fro Executing this query line
                     c.s.executeUpdate(query);
                
                    // fro Pop-Up
                    JOptionPane.showMessageDialog(null,"Your Booking is Successfull!");
                    setVisible(false);
                    new Room1();
                
            }catch (Exception e){
                e.printStackTrace();
            }
        
        }
        else if(ae.getSource() == cancle){
            setVisible(false);
            new Room1();
        }
        else if(ae.getSource() == h1){
            setVisible(false);
            new Logout();
        }
        else if(ae.getSource() == h2){
            setVisible(false);
            new Logout();
        }
        else if(ae.getSource() == h3){
            setVisible(false);
            new About();
        }
        else if(ae.getSource() == h4){
            setVisible(false);
            new BookingForm();
        }
        else if(ae.getSource() == back){
            setVisible(false);
            new Room1();
        }
        
    }
    
    public static void main(String[] args) {
        new BookingForm4();
    }
    
}