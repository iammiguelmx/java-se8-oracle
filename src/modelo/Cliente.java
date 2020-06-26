package modelo;

import java.io.Serializable;

/**
 * @author Miguel Camacho
 */
public class Cliente extends Persona implements Serializable {

    private static int secuencia = 1;
    private int numero;
    private String rfc;
    private String correo;
    private CarritoDeCompras carrito;

    public Cliente(String nombre, String domicilio, String rfc, String correo) {
        super(nombre, domicilio, 0);
        this.numero = secuencia++;
        this.rfc = rfc;
        this.correo = correo;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.length() > 1) {
            this.correo = correo;
        } else {
            System.err.println("Correo vacio");
        }
    }

    /**
     * Se manda llamar el contructor de la clase padre (Persona)
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "numero=" + numero + ", rfc=" + rfc + ", correo=" + correo + '}';
    }

    @Override
    public void saluda() {
        System.out.println("Soy un cliente .. y mi numero de cliente es: " + numero);
    }

}
