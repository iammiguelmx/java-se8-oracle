package modelo;

/**
 *
 * @author Miguel
 */
public class TicketDeCompra extends CarritoDeCompras {

    private int numero;
    private double subtotal;
    private double descuento;
    private double totalIva;
    private double total;
    private static int secuencia = 1;

    public TicketDeCompra() {
        numero = secuencia++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private void calculaSubtotal() {
        for (Articulo a : articulos) {
            subtotal = subtotal + a.getPrecio();
        }
    }

    private void calculaDescuento() {
        for (Articulo a : articulos) {
            descuento = descuento + a.getDescuento();
        }
    }

    private void calculaIva() {
        for (Articulo a : articulos) {
            totalIva = totalIva + (a.getPrecio() - a.getDescuento()) * a.getIva() / 100;
        }
    }

    public void calculaTotal() {
        calculaSubtotal();
        calculaDescuento();
        calculaIva();
        total = subtotal - descuento + totalIva;
    }

    public void imprimeTicket() {
        System.out.println("Ticket numero: " + numero);
        System.out.println("Descunto: " + descuento);
        System.out.println("IVA: " + totalIva);
        System.out.println("Total: " + total);

    }

}
