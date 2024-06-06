package hotel.reservation.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//for resultset
import java.sql.*;
public class NewReg extends JFrame {
    
    
    JTextField textField,textField_1,textField_3,textField_4,textField_5,textField_6 ;
   
    
    public NewReg(){
        //this is for set Backgrounf frame color
        setBounds(100,20,1466,800);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Uiimage6.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1366,800);
        add(images);
            
           
            
            JLabel Passportno = new JLabel("NAME");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Passportno.setBounds(60, 30, 150, 27);
            //text.setForeground(Color.black);

            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);

            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);

            JLabel Pnrno = new JLabel("AGE");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Pnrno.setBounds(60, 80, 150, 27);
            add(Pnrno);

            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);

            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 120, 150, 27);
            add(Gender);

            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(200, 120, 70, 27);
            add(NewRadioButton);

            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(280, 120, 70, 27);
            add(Female);


            JLabel Address = new JLabel("Email");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(60, 170, 150, 27);
            add(Address);
            
            textField_6 = new JTextField();
            textField_6.setBounds(200, 170, 150, 27);
            add(textField_6);

            

            JLabel Nationality = new JLabel("Password");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Nationality.setBounds(60, 270, 150, 27);
            add(Nationality);

            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);

            JLabel Name = new JLabel("PHONE");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Name.setBounds(60, 220, 150, 27);
            add(Name);

            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);

            JLabel Phno = new JLabel("Confirm Password");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(60, 320, 150, 27);
            add(Phno);
    
            //setVisible(true);
                            
            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);
            
            images.add(Passportno);
            setVisible(true);
    
    Next.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){   
        String name = textField.getText();
                    String age = textField_1.getText();
                    String password = textField_3.getText();
                    String phone = textField_4.getText();
                    String Confirm_Password = textField_5.getText();
                    String email = textField_6.getText();

                    String gender = null;

                    if(NewRadioButton.isSelected()){
                        gender = "male";

                    }else if(Female.isSelected()){
                        gender = "female";
                    }


                   // String s6 = (String)c1.getSelectedItem();
            
            try{
                Conn c = new  Conn();
            
                String str = "INSERT INTO Registration values( '"+name+"', '"+age+"', '"+gender+"','"+email+"', '"+phone+"', '"+Confirm_Password+"')";

                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Your Registration Is Successful!");
                        setVisible(false);
                        

                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });

            setSize(900,600);
            setVisible(true);
            setLocation(530,200);

	}      
    
    
    public static void main(String[] args) {
        new NewReg();
    }
    
}