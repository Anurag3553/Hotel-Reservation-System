
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Register extends JFrame{
    JTextField textField,textField_1,textField_3,textField_4,textField_6 ;
    JButton cc;
    JPasswordField textField_5;
    Register(){
       setBounds(100,20,1366,800);
        Icon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Register1.png"));
        JLabel images = new JLabel(i3);
        images.setBounds(0,0,1366,800);
        
        JLabel Passportno = new JLabel("NAME");
            Passportno.setFont(new Font("SERIF", Font.PLAIN, 17));
            Passportno.setBounds(350, 250, 150, 27);
            Passportno.setForeground(Color.WHITE);

            textField = new JTextField();
            textField.setBounds(480, 250, 250, 27);
            

            JButton Next = new JButton("SAVE");
            Next.setBounds(1000, 520, 150, 30);
            Next.setForeground(Color.black);
            Next.setFont(new Font("serif",Font.CENTER_BASELINE,20));
            
            cc = new JButton("Cancle");
            cc.setBounds(1150,50,100,25);
           // cc.addActionListener(this);
            cc.setForeground(Color.black);
            cc.setFont(new Font("serif",Font.CENTER_BASELINE,20));

            JLabel Pnrno = new JLabel("AGE");
            Pnrno.setFont(new Font("serif", Font.PLAIN, 17));
            Pnrno.setBounds(350, 300, 150, 27);
            Pnrno.setForeground(Color.WHITE);
            

            textField_1 = new JTextField();
            textField_1.setBounds(480, 300, 250, 27);
            

            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("serif", Font.PLAIN, 17));
            Gender.setBounds(350, 350, 150, 27);
            Gender.setForeground(Color.WHITE);
            

            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(480, 350, 70, 27);

            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(580, 350, 90, 27);


            JLabel Address = new JLabel("Email");
            Address.setFont(new Font("serif", Font.PLAIN, 17));
            Address.setBounds(350, 400, 150, 27);
            Address.setForeground(Color.WHITE);
            
            textField_6 = new JTextField();
            textField_6.setBounds(480, 400, 250, 27);

            
            

            JLabel Nationality = new JLabel("Password");
            Nationality.setFont(new Font("serif", Font.PLAIN, 17));
            Nationality.setBounds(350, 500, 150, 27);
            Nationality.setForeground(Color.WHITE);

            
            textField_4 = new JTextField();
            textField_4.setBounds(480, 450, 250, 27);

            JLabel Name = new JLabel("PHONE");
            Name.setFont(new Font("serif", Font.PLAIN, 17));
            Name.setBounds(350, 450, 150, 27);
            Name.setForeground(Color.WHITE);

            textField_3 = new JTextField();
            textField_3.setBounds(480, 500, 250, 27);

            JLabel Phno = new JLabel("Confirm Password");
            Phno.setFont(new Font("serif", Font.PLAIN, 17));
            Phno.setBounds(350, 550, 150, 27);
            Phno.setForeground(Color.WHITE);
    
            //setVisible(true);
                            
            textField_5 = new JPasswordField();
            textField_5.setBounds(480, 550, 250, 30);
            
            images.add(Passportno);
            images.add(textField);
            images.add(Next);
            images.add(Pnrno);
            images.add(textField_1);
            images.add(Gender);
            images.add(NewRadioButton);
            images.add(Female);
            images.add(Address);
            images.add(textField_6);
            images.add(Nationality);
            images.add(textField_3);
            images.add(Name);
            images.add(textField_4);
            images.add(Phno);
            images.add(textField_5);
            images.add(cc);
                    
        setVisible(true);
        add(images); 
        Next.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){   
        String name = textField.getText();
                    String age = textField_1.getText();
                    String phone = textField_3.getText();
                    String password = textField_4.getText();
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
                        new Dashboard();

                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
            if(ae.getSource() == cc){
                setVisible(false);
                new Dashboard();
            }
		}
            });

          
	}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Register();
    }
    
}
