/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Miguel
 */
public class Tienda implements ManejaClientes {

    private final ArrayList<Cliente> clientes;
    private int numero;
    private String domicilio;
    private String telefono;
    private String rfc;

    public Tienda() {
        clientes = new ArrayList<>();
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

    public ArrayList<Cliente> getClientes() {
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
        Iterator it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = (Cliente) it.next();
            if (c.getNumero() == numero) {
                it.remove();
                System.out.println("The element is removed");
                break;
            }
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
        Iterator it = clientes.iterator();
        while (it.hasNext()) {
            System.out.println("Imprime clientes");
            System.out.println(it.next());
        }
    }

}
