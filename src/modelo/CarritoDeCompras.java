package modelo;

import java.util.ArrayList;

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
    public void eliminarArticulo(int codigo)  {
        Articulo a = null;
        try {
            a =  buscarArticulo(codigo);
        if (a!=null) {
            articulos.remove(a);
        }
        } catch (NoSeEncontroElArticuloException e){
            System.out.println("No se puede eliminar al "
                    + "articulo porque no existe: " + codigo);
        }
    }

    @Override
    public Articulo buscarArticulo(int codigo) throws NoSeEncontroElArticuloException {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        System.out.println("No se encontro el articulo con codigo: " + codigo);
        throw new NoSeEncontroElArticuloException();
    }

    @Override
    public synchronized void listarArticulos() {
        System.out.println("**********LIST ARTICULOS *****");
        articulos.forEach((a) -> {
            System.out.println(a);
        });
        System.out.println("********************");
    }

}
