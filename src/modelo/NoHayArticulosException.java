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
public class NoHayArticulosException extends Exception {

    /**
     * Creates a new instance of <code>NoHayArticulosException</code> without
     * detail message.
     */
    public NoHayArticulosException() {
    }

    /**
     * Constructs an instance of <code>NoHayArticulosException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoHayArticulosException(String msg) {
        super(msg);
    }
}
