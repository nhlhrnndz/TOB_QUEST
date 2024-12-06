
package Database;
import java.sql.*;
import javax.swing.JOptionPane;

public class Database_Connector {


    private static Connection connect;
    private static Database_Connector bcon;
    private static String url = "jdbc:mysql://localhost:3306/bakeshopsystem";
    private static String user = "root";
    private static String password = "";
    
     public Database_Connector(){
           try {
        connect = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
        e.printStackTrace(); 
    }
     }
           
      public static Database_Connector getDatabase() {
    if (bcon == null) {
        bcon = new Database_Connector();
    }
    return bcon;
}

     public static Connection getConnection() {
    if (bcon == null) {
        getDatabase(); 
    }
    return connect;
}
}