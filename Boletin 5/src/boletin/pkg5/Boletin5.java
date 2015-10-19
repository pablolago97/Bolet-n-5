/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Boletin5 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor, menos;
       
        Coche obx = new Coche ();
        
       
       JOptionPane.showMessageDialog(null, "Velocidad inicial=" +obx.getVelocidade());
       String valorAcelerar = JOptionPane.showInputDialog("Indica aumento de velocidad=");
       obx.acelerar(Integer.parseInt(valorAcelerar));
       
      String valorFrenar = JOptionPane.showInputDialog("Indica velocidad de frenado=");
      obx.frenar(Integer.parseInt(valorFrenar));
      
      JOptionPane.showMessageDialog(null, "La velocidad resultante= "+obx.getVelocidade());
        
        
        
        
    }
    
}
