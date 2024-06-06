package hotel.reservation.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//for resultset
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
    JTextField email;
    JPasswordField Confirm_Password;
    JButton login,cancle;
    
    Login(){
        //this is for set Backgrounf frame color
        
        JLabel user = new JLabel("Email");
        user.setBounds(500,300,2000,110);
        user.setForeground(Color.white);
        user.setFont(new Font("serif",Font.PLAIN,30));
        add(user);   
        // 2nd Layout
        JLabel pass = new JLabel("Password");
        pass.setBounds(500,400,2000,110);
        pass.setForeground(Color.white);
        pass.setFont(new Font("serif",Font.PLAIN,30));
        add(pass);  
        
        //trhis is for creating Filling box
        email = new JTextField();
        email.setBounds(650,340,250,30);
        add(email);
        //2nd Filling Box
        Confirm_Password = new JPasswordField();
        Confirm_Password.setBounds(650,440,250,30);
        add(Confirm_Password);
        
        //this is for creating Button
        login = new JButton("Login");
        login.setBounds(550,550,130,30);
        login.setBackground(Color.blue);
        login.addActionListener(this);
        login.setForeground(Color.white);
        login.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        add(login);
        //2md Button
        cancle = new JButton("Cancle");
        cancle.setBounds(750,550,130,30);
        cancle.setBackground(Color.blue);
        cancle.addActionListener(this);
        cancle.setForeground(Color.white);
        cancle.setFont(new Font("serif",Font.CENTER_BASELINE,20));
        add(cancle);
        
        //this is for set image on frame  
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        JLabel image = new JLabel(i2);
        image.setBounds(920,350,200,240);
        add(image);
        
        
        
        // this is for create a frame 
        setBounds(-7,2,1666,900);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Login1.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,700,450);
        add(images);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            String user = email.getText();
            String pass = Confirm_Password.getText();
            
            try{
                Conn c = new  Conn();
            
                String query = "select * from Registration where email = '"+user+"' and Confirm_Password = '" +pass+ "'";
                //fro Executing this query line
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                 JOptionPane.showMessageDialog(null,"Login Successfull!");
                 setVisible(false);
                 new Logout();
                }
                else{
                    // fro Pop-Up
                    JOptionPane.showMessageDialog(null,"Your entered Email-Id or Password is Invalid!");
                    setVisible(false);
                    new Login();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == cancle){
            setVisible(false);
            new Dashboard();
        }     
    }
    
    public static void main(String[] args) {
        new Login();
    }
    
}
