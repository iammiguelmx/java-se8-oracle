/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Argumentos {

    public static void main(String[] args) {
        int i = 0;
        double suma = 0.0D;
        for (String s : args) {
            try {
                suma = suma + Double.parseDouble(args[i]);
            } catch (NumberFormatException exception) {
                System.out.println("El argumento no es numero: ");
                System.err.println(exception.getMessage());
            }
            System.out.println("args[" + i++ + "]" + s);
        }
        System.out.println("La suma es de: " + suma);
    }

}
