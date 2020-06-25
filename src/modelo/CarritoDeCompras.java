package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Miguel
 */
public class CarritoDeCompras implements OperaArticulos {

    private final ArrayList<Articulo> articulos;

    public ArrayList<Articulo> getArticulo() {
        return articulos;
    }

    public CarritoDeCompras() {
        articulos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" + "articulo=" + articulos + '}';
    }

    @Override
    public void agregarArticulo(Articulo a) {
        articulos.add(a);
    }

    @Override
    public void eliminarArticulo(int codigo) {
       Iterator it = articulos.iterator();
       while (it.hasNext()){
           Articulo a = (Articulo) it.next();
           if (a.getCodigo() == codigo) {
               it.remove();
           }
       }
        System.out.println("Remove successfully");
    }

    @Override
    public Articulo buscarArticulo(int codigo) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null;
    }

    @Override
    public synchronized void listarArticulos() {
        Iterator it = articulos.iterator();
        while (it.hasNext()) {
            System.err.println(it.next());
        }
    }

}
