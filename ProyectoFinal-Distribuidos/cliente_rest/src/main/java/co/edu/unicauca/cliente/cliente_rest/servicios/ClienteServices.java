package co.edu.unicauca.cliente.cliente_rest.servicios;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import co.edu.unicauca.cliente.cliente_rest.models.Cliente;
import co.edu.unicauca.cliente.cliente_rest.models.Usuario;

public class ClienteServices {
    
    private String endPoint;
    private Client objClientePeticiones;

    public ClienteServices(){
        this.endPoint="http://localhost:8085/api/clientes";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public Usuario consultarUsuario(Integer id)
	{
		Usuario objCliente=null;	
		
		WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);	
		
		objCliente = objPeticion.get(Usuario.class);
		
		return objCliente;
	}

    public List<Cliente> listarClientes(){
        List<Cliente> listaClientes = null;
        WebTarget target = this.objClientePeticiones.target(this.endPoint);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        listaClientes = objPeticion.get(new GenericType<List<Cliente>>() {});
        return listaClientes;
    }

    public Cliente registrarCliente(Cliente objClienteRegistrar){
        Cliente objCliente = null;
        WebTarget target = this.objClientePeticiones.target(this.endPoint);
        Entity<Cliente> data = Entity.entity(objClienteRegistrar, MediaType.APPLICATION_JSON_TYPE);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objCliente = objPeticion.post(data, Cliente.class);
        return objCliente;
    }

    public Cliente actualizarCliente(Cliente objClienteActualizar, Integer id){
        Cliente objCliente = null;
        WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);
        Entity<Cliente> data = Entity.entity(objClienteActualizar, MediaType.APPLICATION_JSON_TYPE);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objCliente = objPeticion.put(data, Cliente.class);
        return objCliente;
    }

    public Boolean eliminarCliente(Integer id){
        Boolean bandera = false;
        WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        bandera = objPeticion.delete(Boolean.class);
        return bandera;
    }
}
