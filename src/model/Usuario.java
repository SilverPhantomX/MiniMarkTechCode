package model;

public class Usuario {

    private String rut;
    private String nombre;
    private String apellido;
    private String contrasena;
    private int idCargo;

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario() {
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    
    

}
