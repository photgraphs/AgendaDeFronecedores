package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Elaine Alves
 */
public class ConexaoBanco {

    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:derby://localhost:1527/FATEC";
    private static final String user = "EMPRESA";
    private static final String password = "root";


    public static Connection abreConexao() {

        Connection con = null;
        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception erro) {
         
            
        }
          
        return con;

    }

    
    
    
}
