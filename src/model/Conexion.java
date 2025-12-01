package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    
    private Connection conexion = null;

    private String bd = "MiniMarkTech";
    private String url = "jdbc:mysql://localhost:3306/" + bd;
    private String usuario = "root";
    private String clave = "";

    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conectado correctamente a: " + bd);
        } catch (Exception mensajeError) {
            System.err.println("Error al conectar (" + mensajeError + ")");
        }
        return conexion;
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Desconectado de la base de datos");
            }
        } catch (Exception e) {
            System.err.println("Error al desconectarse (" + e + ")");
        }
    }
    
}
