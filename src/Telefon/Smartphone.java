package Telefon;

public class Smartphone extends Telefon implements Camera, Rellotge{

     public void alarma() {
          System.out.println("Està sonant la alarma");
     }

     public void fotografiar(){
          System.out.println("S’està fent una foto");
     }
}
