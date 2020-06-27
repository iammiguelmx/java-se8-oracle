package puntodeventas;

import modelo.*;

/**
 *
 * @author Miguel Camacho
 */
public class inicio {

    public static void main(String[] args) {

        System.out.println("********Agregando personas al sistema********");
        Persona p = new Persona("Miguel", "San Felipe,Gto ", 15, 8, 1998);
        System.out.println(p.getNombre() + " Nacio el " + p.getFechaNacimiento());
        System.out.println("*******Agregando lenguajes a las personas****");
        p.addLenguaje("Aleman");
        p.impirmirLenguajes();
        System.out.println(p);

        System.out.println("*******Agregando clientes al sistema*********");
        Cliente cliente1 = new Cliente("Miguel", "San Felipe", "MACC10998XXXX", "miguel.cam.mx@gmail.com");
        cliente1.setEdad(21);
        System.out.println("*****Agregando lenguajes al cliente*****");
        cliente1.addLenguaje("Chino");
        cliente1.addLenguaje("Ruso");
        cliente1.addLenguaje("Otomi");
        cliente1.impirmirLenguajes();

        System.out.println("******Agregando articulos******");
        Articulo a1 = new Articulo(100, "Cereal de 100gr", 12.50, 20);
        Articulo a2 = new Articulo(105, "Cafe de 200gr", 110);
        Articulo a3 = new Articulo(110, "Leche 1 Lt", 17.50, 10);
        Articulo a4 = new Articulo(120, "Azucar 1 kg", 30);
        Articulo a5 = new Articulo(130, "Cepillo de dientes", 15, 5);

        TicketDeCompra cc = new TicketDeCompra();
        System.out.println("*****Agregando articulos al carrito de compra****");
        cc.agregarArticulo(a1);
        cc.agregarArticulo(a2);
        cc.agregarArticulo(a4);
        cc.agregarArticulo(a5);
        cc.agregarArticulo(a3);
        cc.listarArticulos();

        Articulo buscar;
        try {
            buscar = cc.buscarArticulo(100);
        } catch (NoSeEncontroElArticuloException ex) {

        }

        cc.eliminarArticulo(100);
        cc.eliminarArticulo(105);
        cc.listarArticulos();
        System.out.println("*********Generando Ticket**************");
        cc.calculaTotal();
        cc.imprimeTicket();

    }

}
