package puntodeventas;

import modelo.*;

/**
 *
 * @author Miguel Camacho
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Persona p = new Persona("Miguel", "San Felipe,Gto ", 21);
//        p.addLenguaje("Aleman");
//        p.impirmirLenguajes();
//        System.out.println(p);

        Cliente cliente1 = new Cliente("Miguel", "San Felipe", "MACC10998XXXX", "");
        cliente1.setEdad(21);

        Cliente cliente2 = new Cliente("Angel", "Dolores Hidalgo", "MACC10998XXXX",
                "angel.cam.mx@gmail.com");
        cliente2.addLenguaje("Chino");
        cliente2.addLenguaje("Mexicano");
        cliente2.addLenguaje("Ruso");
        cliente2.addLenguaje("Otomi");
        cliente2.impirmirLenguajes();

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("****AGRGANDO UN ARTICULO*******");
        Articulo articulo = new Articulo(1, "Disco Duro 1 TB Samsung", 1000.00D, 5);
        Articulo articulo1 = new Articulo(2, "Mac Air", 1800.00D, 5);
        System.out.println(articulo);
        System.out.println("*******************************");

        Persona p = new Persona("Miguel Camacho", "San Felipe", 15, 8, 1998);
        System.out.println(p.getNombre() + " Nacio el " + p.getFechaNacimiento());
        System.out.println(p);

        System.out.println("******************");
        CarritoDeCompras compras = new CarritoDeCompras();
        System.out.println("**************Agrega Articulo*********");
        compras.agregarArticulo(articulo);
        compras.agregarArticulo(articulo1);
        compras.listarArticulos();
        System.out.println(compras.buscarArticulo(1));
        compras.eliminarArticulo(1);
        System.out.println(compras.buscarArticulo(2));
        compras.listarArticulos();
        System.out.println("********************************");

    }

}
