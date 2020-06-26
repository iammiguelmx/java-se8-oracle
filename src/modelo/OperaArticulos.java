package modelo;

/**
 *
 * @author Miguel
 */
public interface OperaArticulos {
    
    void agregarArticulo(Articulo a);
    void eliminarArticulo(int codigo);
    Articulo buscarArticulo(int codigo) throws NoSeEncontroElArticuloException ;
    void listarArticulos();
    
}
