/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocimientovoz;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class Robocop {
    Robot r;
   public Robocop(){
       try {
           r=new Robot();
       } catch (AWTException ex) {
           Logger.getLogger(Robocop.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void Inicio(){
       //Inicio Windows
        r.setAutoDelay(100);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_CONTROL);
        //r.mouseMove(25, 750);
        //r.mousePress(InputEvent.BUTTON1_MASK);
   }
   public void CMD(){
       //Abre CMD
       Inicio();
       r.keyPress(KeyEvent.VK_C);
       r.keyPress(KeyEvent.VK_M);
       r.keyPress(KeyEvent.VK_D);
       r.keyRelease(KeyEvent.VK_C);
       r.keyRelease(KeyEvent.VK_M);
       r.keyRelease(KeyEvent.VK_D);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
   }
   
   public void Cerrar(){
       //Cerrar ventana  actual
       r.delay(1000);
       r.keyPress(KeyEvent.VK_ALT);
       r.keyPress(KeyEvent.VK_F4);
       r.keyRelease(KeyEvent.VK_ALT);
       r.keyPress(KeyEvent.VK_F4);
   }
   
   public void AbrirHON(){
       //Abre heroes of newerth
       Inicio();
       r.keyPress(KeyEvent.VK_H);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_R);
       r.keyPress(KeyEvent.VK_O);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_S);
       r.keyPress(KeyEvent.VK_SPACE);
       r.keyPress(KeyEvent.VK_O);
       r.keyPress(KeyEvent.VK_F);
       r.keyPress(KeyEvent.VK_SPACE);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_W);
       r.keyPress(KeyEvent.VK_ENTER);
       
   }
   
   public void AbrirNBNS(){
       //abre netbeans
       Inicio();
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_T);
       r.keyPress(KeyEvent.VK_B);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_S);
       
   }
   
   public void AbrirNP(){
       Inicio();
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_O);
       r.keyPress(KeyEvent.VK_T);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_P);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_D);
       r.keyPress(KeyEvent.VK_ENTER);     
   }
   
   public void HolaMundo(){
       //r.delay(3000);
       r.keyPress(KeyEvent.VK_SHIFT);      
       r.keyPress(KeyEvent.VK_H);
       r.keyRelease(KeyEvent.VK_SHIFT);
       r.keyPress(KeyEvent.VK_O);
       r.keyPress(KeyEvent.VK_L);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_SPACE);
       r.keyPress(KeyEvent.VK_M);
       r.keyPress(KeyEvent.VK_U);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_D);
       r.keyPress(KeyEvent.VK_O);
   }
   
   public void ENTER(){
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
   }
   
   public void Scape(){
       r.keyPress(KeyEvent.VK_ESCAPE);
       r.keyRelease(KeyEvent.VK_ESCAPE);      
   }
   
   public void AbrirWarcraft(){
       Inicio();     
       r.keyPress(KeyEvent.VK_W);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_R);
       r.keyPress(KeyEvent.VK_C);
       r.keyPress(KeyEvent.VK_R);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_F);
       r.keyPress(KeyEvent.VK_T);  
       r.keyPress(KeyEvent.VK_ENTER);
   }
   public void IngresaraTwitter(){
       r.setAutoDelay(200);
       r.keyPress(KeyEvent.VK_L);
       r.keyPress(KeyEvent.VK_F);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_R);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_N);       
       r.keyPress(KeyEvent.VK_D);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_Z);
       r.keyPress(KeyEvent.VK_9);
       r.keyPress(KeyEvent.VK_3);
       r.keyPress(KeyEvent.VK_TAB);
       r.keyPress(KeyEvent.VK_A);
       r.keyPress(KeyEvent.VK_N);
       r.keyPress(KeyEvent.VK_G);
       r.keyPress(KeyEvent.VK_E);
       r.keyPress(KeyEvent.VK_2);
       r.keyPress(KeyEvent.VK_1);
       r.keyPress(KeyEvent.VK_1);
       r.keyPress(KeyEvent.VK_5);
       r.keyPress(KeyEvent.VK_5);
       r.keyPress(KeyEvent.VK_ENTER);
       
   }
   public void CerrarTarea(String tarea){
        try {
            Runtime.getRuntime().exec("taskkill /f /im " + tarea);
        } catch (IOException ex) {
            Logger.getLogger(Robocop.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
       public void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else if (osName.startsWith("Mac OS X")) {
                // Runtime.getRuntime().exec("open -a safari " + url);
                // Runtime.getRuntime().exec("open " + url + "/index.html");
                Runtime.getRuntime().exec("open " + url);
            } else {
                System.out.println("Please open a browser and go to "+ url);
            }
        } catch (IOException e) {
            System.out.println("Failed to start a browser to open the url " + url);
            e.printStackTrace();
        }
    }

}
