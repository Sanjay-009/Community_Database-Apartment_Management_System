package dbms_project;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HI
 */
public class MySqlConnect {
     Connection con=null;
    public static Connection ConnectDB(){
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/community","root","1234");
       JOptionPane.showMessageDialog(null,"Connected to Database!");
       return con;
       }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}

    
}
