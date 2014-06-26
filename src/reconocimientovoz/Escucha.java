/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocimientovoz;

/**
 *
 * @author CristhGunners
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.EngineModeDesc;
import javax.speech.recognition.Recognizer;
import javax.speech.recognition.Result;
import javax.speech.recognition.ResultAdapter;
import javax.speech.recognition.ResultEvent;
import javax.speech.recognition.ResultToken;
import javax.speech.recognition.RuleGrammar;
public class Escucha extends ResultAdapter implements Runnable{
    ventanaprinc p;//Objeto Tipo Front
    Recognizer recognizer;//Objeto de la libreria  Cloud Garden
    String gst;//Objeto de tipo String donde quedara la palabra capturada
    boolean b=false;//Objeto booleano para controlar el proceso de captura de voz
    Robocop r=new Robocop();
 public Escucha(ventanaprinc pp){
    p=pp;//recibimos el objeto y lo asignamos al objeto de esta clase
 }
 
 //Proceso donde comparamos la palabra dicha por el usuario y realizamos la accion requerida en este caso abrir una URL
 @Override
 public void resultAccepted(ResultEvent re)
 {
 try
 {
 Result res = (Result)(re.getSource());
 ResultToken tokens[] = res.getBestTokens();

 String args[]= new String[1];
 args[0]="";
 for (int i=0; i < tokens.length; i++)
 {
 gst = tokens[i].getSpokenText();
     System.out.println("el GST ES=> "+gst);
 if(gst.equals("Facebook")){
    r.openURL("www.facebook.com");
 }
 if(gst.equals("Google")){
    r.openURL("www.google.com");
 }
 if(gst.equals("Twitter")){
    r.openURL("www.twitter.com");
 }
 if(gst.equals("Inicio")){
    r.Inicio();
 }
 if(gst.equals("Abrircemede")){
    r.CMD();
 }
 if(gst.equals("CerrarVentana")){
    r.Cerrar();
 }
 if(gst.equals("AbrirJON")){
    r.AbrirHON();
 }
 if(gst.equals("AbrirNetBins")){
    r.AbrirNBNS();
 }
 if(gst.equals("AbrirNoutPad")){
    r.AbrirNP();
}
 if(gst.equals("EscribeHolaMundo")){
    r.HolaMundo();
 }
 if(gst.equals("hasenter")){
    r.ENTER();
 }
 if(gst.equals("Escape")){
    r.Scape();
 }
 if(gst.equals("Abriruarcraft")){
    r.AbrirWarcraft();
 }

 if(gst.equals("Cerraruarcraft")){
    r.AbrirWarcraft();
 }
  if(gst.equals("Cerrarcrom")){
    r.CerrarTarea("chrome.exe");
 }
  if(gst.equals("CerrarJON")){
    r.CerrarTarea("hon.exe");
 }
  if(gst.equals("CerrarNetbins")){
    r.CerrarTarea("netbeans.exe");
 }
   if(gst.equals("CerrarNoutpad")){
    r.CerrarTarea("notepad.exe");
 }
   if(gst.equals("Ingresartwitter")){
       r.IngresaraTwitter();
   }
 if(gst.equals("CierraPrograma"))
 {
 //recognizer.deallocate();
 args[0]="Hasta la proxima Killua";
 System.out.println(args[0]);
 System.exit(0);
 }
 }
 }catch(Exception ex)
 {
 System.out.println("Ha ocurrido algo inesperado " + ex.getMessage());
 }
 }
 
 //metodo donde cargamos el archivo que contienen las palabras reconocidas por nuestra aplicacion y dejamos la aplicion encendida para poder trabajar
 public void ma()
 {
 try
 {
 recognizer = Central.createRecognizer(new EngineModeDesc(Locale.ROOT));
 recognizer.allocate();

 FileReader grammar1 =new FileReader("c:/SimpleGrammarES2.txt");

 RuleGrammar rg = recognizer.loadJSGF(grammar1);
 rg.setEnabled(true);

 recognizer.addResultListener(new Escucha(p));

 System.out.println("On");
 recognizer.commitChanges();

 recognizer.requestFocus();
 recognizer.resume();
 }catch (Exception e)
 {
 System.out.println("Exception en " + e.toString());
 e.printStackTrace();
 System.exit(0);
 }
 }

    @Override
    public void run() {
        if(!b){
        this.ma();
        }
    }
    
    

}
