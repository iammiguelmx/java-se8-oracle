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

        Cliente cliente1 = new Cliente("Miguel", "San Felipe", "MACC10998XXXX","");
        cliente1.setEdad(21);

        Cliente cliente2 = new Cliente("Angel", "Dolores Hidalgo", "MACC10998XXXX",
                "angel.cam.mx@gmail.com");
        cliente2.addLenguaje("Chino");
        cliente2.impirmirLenguajes();

        System.out.println(cliente1);
        System.out.println(cliente2);
        
        System.out.println("****AGRGANDO UN ARTICULO*******");
        Articulo articulo = new Articulo(1, "Disco Duro 1 TB Samsung", 1000.00D, 5);
        System.out.println(articulo);
        System.out.println("*******************************");
    }

}
