package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Conexión Local
   public static Connection conectar() {
    try {
        Connection cn = DriverManager.getConnection(
            "jdbc:mysql://localhost/sistema_ventas?useSSL=false&allowPublicKeyRetrieval=true",
            "",  //Aqui va el usuario
            "" //Aqui va la contraseña
        );
        return cn;
    } catch (SQLException e) {
        System.out.println("Error en la conexión: " + e.getMessage());
    }
    return null;
}

}
