package hotel.reservation.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Hotel extends JFrame implements ActionListener{
    Hotel(){
        setSize(1366,800);
        setLocation(100,20);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel8.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,800);
        add(image);
        
        
        // For Text Craetion On image frame of the Screen
        JLabel text = new JLabel("Hotel Reservation System");
        text.setBounds(60,20,2000,110);
        text.setForeground(Color.black);
        text.setFont(new Font("serif",Font.PLAIN,70));
        
        // For creating "click here " text
        JLabel click = new JLabel("Click here...");
        click.setBounds(1000,500,300,40);
        click.setForeground(Color.white);
        click.setFont(new Font("serif",Font.TRUETYPE_FONT,40));
        
        // For Next Button Creation
        JButton next = new JButton("NEXT");
        next.setBounds(1200,500,150,50);
       // next.setBackground(Color.WHITE);
        next.setForeground(Color.black);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.CENTER_BASELINE,25));
        image.add(next);
        image.add(click);
        image.add(text); 
        setVisible(true);
        
        while(true){
            click.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            click.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Dashboard();        
    }

    public static void main(String[] args) {
        new Hotel();
    }
    
}
