
package bol102;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Calculo {
    private int numAdivinar = (int) (Math.random() * 51);
    private int numIntentos;
    private int respuesta ;
    public int SetAdivinar(){
        do{
            numAdivinar =(int) (Math.random() * 51) ;
            JOptionPane.showMessageDialog(null,"Número al azar");
        }while(numAdivinar<1||numAdivinar>50);
                return numAdivinar;
    }
    public int maximoIntentos() {
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Número máximo de intentos"));
        return numIntentos;
    }
    public void ejecutarJuego(){
      numIntentos = maximoIntentos();
      
      for(int i=0; i<numIntentos; i++ ){
          
        
              
             respuesta= Integer.parseInt(JOptionPane.showInputDialog("Intento :"+ (i+1)));
              
                  if(respuesta<numAdivinar){
                      JOptionPane.showMessageDialog(null,"Número inferior");
                      
                  }else if(respuesta>numAdivinar){
                      JOptionPane.showMessageDialog(null,"Número mayor");
                  }else{
                      JOptionPane.showMessageDialog(null,"Acertado");
                  break;
                  }
              }
          
         if(respuesta!=numAdivinar) JOptionPane.showMessageDialog(null,"Perdido");
      }
        
    
}
