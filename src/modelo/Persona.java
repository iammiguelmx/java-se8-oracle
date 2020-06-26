package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Miguel Camacho
 * @version 1.0
 * @see This a PersonaBean.java Esto es un estereotipo
 */
public class Persona implements Serializable {

    private String nombre;
    private String domicilio;
    private LocalDate fechaNacimiento;
    private List<String> lenguajes = new LinkedList<String>();
    private int edad;
    private static String nacionalidad = "Mexicana";

    public Persona() {
        System.out.println("Called since PersonaBean");
    }

    public Persona(String nombre, String domicilio, int dia, int mes, int año) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNacimiento = LocalDate.of(año, mes, dia);
        this.edad = calculaEdad();
    }

    /**
     * Contructor Full
     *
     * @param nombre
     * @param domicilio
     * @param edad
     */
    public Persona(String nombre, String domicilio, int edad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
        this.lenguajes.add("Español");
    }

    public Persona(String nombre, int edad) {
        this(nombre, "Conocido", edad);
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", domicilio=" + domicilio
                + ", edad=" + edad + '}';
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Persona.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int dia, int mes, int año) {
        this.fechaNacimiento = LocalDate.of(año, mes, dia);
        edad = calculaEdad();
    }

    // Bussines Object
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.err.println("¡No se permiten edade invalidas!");
        }
    }

    private int calculaEdad() {
        return (int) YEARS.between(fechaNacimiento, LocalDate.now());
    }

    public void addLenguaje(String lenguaje) {
        lenguajes.add(lenguaje);
    }

    public void quitarLenguaje(String lenguaje) {
        lenguajes.remove(lenguaje);
    }

    public void impirmirLenguajes() {
        System.out.println("Nombre:  " + nombre);
        System.out.println("Lenguajes que domina");
        for (String lenguaje : lenguajes) {
            System.out.println("  " + lenguaje);
        }
    }

    public  void saluda(){
        
    }

}
