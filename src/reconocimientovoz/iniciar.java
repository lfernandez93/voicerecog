/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocimientovoz;

/**
 *
 * @author usuario
 */
public class iniciar {
    public static void main(String args[]){
        Thread t=new Thread( new ventanaprinc());
        t.start();
    }
}
