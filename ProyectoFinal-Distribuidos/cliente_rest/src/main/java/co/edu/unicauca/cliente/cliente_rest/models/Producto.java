package co.edu.unicauca.cliente.cliente_rest.models;

public class Producto {
    private Integer codigo;
    private String nombre;
    private Integer valorInicial;

    public Producto(Integer codigo, String nombre, Integer valorIncial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorInicial = valorIncial;
    }
    public Producto(){
        
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getValorInicial() {
        return valorInicial;
    }
    public void setValorInicial(Integer valorInicial) {
        this.valorInicial = valorInicial;
    }
    
}
