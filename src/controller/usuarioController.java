package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;

public class usuarioController {

    Conexion conexionDb = new Conexion();
    Connection conexionActiva;
    
    //crear usuarios
    public boolean crearUsuario(Usuario usuario) {
    String sql = "INSERT INTO Usuario (rut, nombre, apellido, contrasena, idCargo) VALUES (?, ?, ?, ?, ?)";

    try {
        conexionActiva = conexionDb.establecerConexion();
        PreparedStatement consultaSQL = conexionActiva.prepareStatement(sql);

        consultaSQL.setString(1, usuario.getRut());
        consultaSQL.setString(2, usuario.getNombre());
        consultaSQL.setString(3, usuario.getApellido());
        consultaSQL.setString(4, usuario.getContrasena());
        consultaSQL.setInt(5, usuario.getIdCargo());

        int filasAfectadas = consultaSQL.executeUpdate();
        return filasAfectadas > 0;

    } catch (Exception e) {
        System.out.println("Error al crear usuario: " + e);
        return false;
    }
} 

    // LOGIN: valida rut y contraseña y devuelve un objeto Usuario
    public Usuario validarLogin(String rut, String contrasena) {

        String sql = "SELECT * FROM Usuario WHERE rut = ? AND contrasena = ?";
        Usuario usuario = null;

        try {
            conexionActiva = conexionDb.establecerConexion();
            PreparedStatement consultaSQL = conexionActiva.prepareStatement(sql);

            consultaSQL.setString(1, rut);
            consultaSQL.setString(2, contrasena);

            ResultSet resultado = consultaSQL.executeQuery();

            if (resultado.next()) {
                usuario = new Usuario();
                usuario.setRut(resultado.getString("rut"));
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setApellido(resultado.getString("apellido"));
                usuario.setIdCargo(resultado.getInt("idCargo"));
            }
        } catch (Exception e) {
            System.out.println("Algo fallo" + e);
        }
        
        return usuario;

    }

}
