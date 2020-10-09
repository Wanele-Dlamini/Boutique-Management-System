
package boutiquemanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Wanele Dlamini
 */
public class dbConnect {
    
    Connection conn = null;
    
    public static Connection java_db(){
    
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique", "root", "123456789");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
