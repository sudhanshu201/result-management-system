/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getCon(){  //this will return connection type
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsresultsystem","root", "9024507615");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
            return null;
        }
    }
}
