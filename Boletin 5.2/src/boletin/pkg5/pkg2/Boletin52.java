
package boletin.pkg5.pkg2;

import javax.swing.JOptionPane;


public class Boletin52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
        Satelite obx = new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Introduce meridiano:")), Double.parseDouble(JOptionPane.showInputDialog("Introduce paralelo:")), Double.parseDouble(JOptionPane.showInputDialog("Introduce distancia tierra:")));
        
        
       //String valorMeridiano = JOptionPane.showInputDialog("Introduce meridiano:");
       // double m = Double.parseDouble(valorMeridiano);
        
       // String valorParalelo = JOptionPane.showInputDialog("Introduce paralelo:");
       // double p = Double.parseDouble(valorParalelo);
       
       // String valorDtierra = JOptionPane.showInputDialog("Introduce distancia tierra:");
       // double d = Double.parseDouble(valorDtierra);
        
       obx.verPosicion();
    }
    
}
