package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

/**
 * @author Miguel Camacho
 * @version 1.0
 * @see This a PersonaBean.java
 */
public class Persona implements Serializable {

    private String nombre;
    private String domicilio;
    private LocalDate fechaNacimiento;
    private final String[] lenguajes = new String[5];
    private int edad;
    private static String nacionalidad = "Mexicana";

    public Persona() {
        System.out.println("Called since PersonaBean");
    }

    public Persona(String nombre, String domicilio, int dia, int mes, int año) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNacimiento = LocalDate.of(año, mes, dia);
        this.edad =calculaEdad();
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
        this.lenguajes[0] = "Español";
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

    public String getLenguaje() {
        return lenguajes[0];
    }

    public void setLenguaje(String lenguaje) {
        this.lenguajes[0] = lenguaje;
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

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Bussines Object
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.err.println("¡No se permiten edade invalidas!");
        }
    }
    
    private int calculaEdad(){
         int laEdad = (int)YEARS.between(fechaNacimiento,LocalDate.now());
         return laEdad;
    }

    public void addLenguaje(String lenguaje) {
        int i = 0;
        while (lenguajes[i] != null && i < lenguajes.length - 1) {
            i++;
        }
        lenguajes[i] = lenguaje;
    }

    public void impirmirLenguajes() {
        System.out.println("Nombre:  " + nombre);
        System.out.println("Lenguajes");
        for (String lenguaje : lenguajes) {
            if (lenguaje != null) {
                System.out.println("  " + lenguaje);
            }
        }
    }
}
