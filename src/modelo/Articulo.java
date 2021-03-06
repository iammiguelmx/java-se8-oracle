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
    private int iva;

    public Articulo(int codigo, String descripcion, double precio, int descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
    }
    
     public Articulo(int codigo, String descripcion, double precio) {
        this(codigo,  descripcion,  precio, 0);
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

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
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
