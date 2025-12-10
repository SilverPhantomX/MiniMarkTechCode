package controller;

import model.inventario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import model.Conexion;


public class inventarioController {
    
    Conexion conexionDb = new Conexion();
    Connection conexionActiva;
    
    
public boolean crearProducto(inventario inventario) {
    String sql = "INSERT INTO inventario (nombre, marca, precio, cantidad) VALUES (?, ?, ?, ?)";

    try {
        conexionActiva = conexionDb.establecerConexion();
        PreparedStatement consultaSQL = conexionActiva.prepareStatement(sql);

        consultaSQL.setString(1, inventario.getNombre());
        consultaSQL.setString(2, inventario.getMarca());
        consultaSQL.setInt(3, inventario.getPrecio());
        consultaSQL.setInt(4, inventario.getCantidad());
        

        int filasAfectadas = consultaSQL.executeUpdate();
        return filasAfectadas > 0;

    } catch (Exception e) {
        System.out.println("Error al crear producto: " + e);
        return false;
    }
}     
    
    
    
public ResultSet listartodo() {

        String sql = "SELECT * FROM inventario";

        try {
            Conexion conexionDB = new Conexion();
            Connection conexionActiva = conexionDB.establecerConexion();

            Statement sentenciaSQL = conexionActiva.createStatement();
            return sentenciaSQL.executeQuery(sql);

        } catch (Exception e) {
            System.out.println("Error al listar inventario: " + e.getMessage());
            return null;
        }
    }
    
}
