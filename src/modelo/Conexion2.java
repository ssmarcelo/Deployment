package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion2 {
String url="jdbc:mysql://localhost:3306/bd_ejemplo";
String user="root";
String password="";
Connection con;
Statement stmt;
ResultSet rs;

//Para hacer la conexión
       public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
stmt=con.createStatement();
stmt.executeUpdate("INSERT INTO PERSONA VALUES (null, 'JUAN', 'jjaramillo', '2365124')");
        } catch (ClassNotFoundException | SQLException e) {            
        }
        return con;
    }
}
