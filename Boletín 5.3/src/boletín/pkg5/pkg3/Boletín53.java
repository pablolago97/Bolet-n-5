
package boletín.pkg5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Boletín53 {

    
    public static void main(String[] args) {
       
        Circulo obx = new Circulo (Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio=")));
        
        JOptionPane.showMessageDialog(null, "El area es "+obx.calcularArea());
        JOptionPane.showMessageDialog(null, "La longitud es "+obx.calcularLonxitude());
    }
    
}
