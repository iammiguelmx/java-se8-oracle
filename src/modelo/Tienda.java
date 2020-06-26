package modelo;

import java.util.LinkedList;

/**
 *
 * @author Miguel
 */
public class Tienda implements ManejaClientes {

    private final LinkedList<Cliente> clientes;
    private int numero;
    private String domicilio;
    private String telefono;
    private String rfc;

    public Tienda() {
        clientes = new LinkedList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Tienda{" + "numero=" + numero + ", domicilio=" + domicilio + ", telefono=" + telefono + ", rfc=" + rfc + '}';
    }

    // Bussines Object
    @Override
    public void altaCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    @Override
    public void bajaCliente(int numero) {
       Cliente c = buscarCliente(numero);
        if (c!=null) {
            clientes.remove(c);
        }
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        clientes.get(cliente.getEdad()).setCorreo(cliente.getCorreo());
    }

    @Override
    public Cliente buscarCliente(int numero) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == numero) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public synchronized void imprimeClientes() {
       System.out.println("**********LIST CLIENTES *****");
       clientes.forEach((c) -> {
            System.out.println(c);
        });
        System.out.println("****************************");
    }
   

}
