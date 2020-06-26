/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Miguel
 */
public class NoSeEncontroElArticuloException extends Exception {

    /**
     * Creates a new instance of <code>NoSeEncontroElArticuloException</code>
     * without detail message.
     */
    public NoSeEncontroElArticuloException() {
    }

    /**
     * Constructs an instance of <code>NoSeEncontroElArticuloException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NoSeEncontroElArticuloException(String msg) {
        super(msg);
    }
}
