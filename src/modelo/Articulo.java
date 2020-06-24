package modelo;

import java.io.Serializable;

/**
 * @author Miguel
 */
public class Articulo implements Serializable {

    private int codigo;
    private String descripcion;
    private double precio;
    private int descuento;

    public Articulo(int codigo, String descripcion, double precio, int descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
    }
    
      
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion="
                + descripcion + ", precio=" + precio + ", descuento=" + descuento + '}';
    }
   
}
