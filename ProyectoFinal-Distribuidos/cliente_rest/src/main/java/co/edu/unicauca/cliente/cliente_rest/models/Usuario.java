package co.edu.unicauca.cliente.cliente_rest.models;

public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private Boolean rolAdmin;

    public Usuario(){

    }

    public Usuario(Integer id, String nombre, String apellido, String contrasenia, Boolean rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.rolAdmin = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Boolean getRolAdmin() {
        return rolAdmin;
    }

    public void setRolAdmin(Boolean rolAdmin) {
        this.rolAdmin = rolAdmin;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



}
