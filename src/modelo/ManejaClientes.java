package modelo;

/**
 *
 * @author Miguel
 */
public interface ManejaClientes {

    void altaCliente(Cliente cliente);
    void bajaCliente(int numero);
    void actualizarCliente(Cliente cliente);
    Cliente buscarCliente(int numero);
    void imprimeClientes();

}
