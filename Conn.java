package hotel.reservation.system;

import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           //for using MySQl
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelreservationsystem","root","Anurag#2026");
           s = c.createStatement();
           if(c != null){
               System.out.println("Connection is Sucessful");
           }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("NotConnected");
        }      
    }
    
    public static void main(String[] args) {
        new Conn();
    }
    
}
