package modelo;

import java.io.Serializable;

/**
 *
 * @author Miguel
 */
public class CarritoDeCompras extends Articulo implements Serializable {
    
    private Articulo articulo;

    public CarritoDeCompras(Articulo articulo, int codigo, 
            String descripcion, double precio, int descuento) {
        super(codigo, descripcion, precio, descuento);
        this.articulo = articulo;
    }
    
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
  
}
