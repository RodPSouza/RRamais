
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoSQLite {
    
    //Atributos de Conexao com SQLite
    
    public Connection c    = null;
    public Statement  stmt = null;
    public ResultSet  rs   = null;
  
    try {
   
     Class.forName("org.sqlite.JDBC")

   }
    
}
