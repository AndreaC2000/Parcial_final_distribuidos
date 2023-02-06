package co.edu.unicauca.cliente.cliente_rest.models;

import java.util.Date;

public class Cliente extends Usuario{

    private String email;
    private Integer telefono;


    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
    
}
