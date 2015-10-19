/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg5.pkg3;

/**
 *
 * @author Pablo
 */
public class Circulo {
    //ATRIBUTOS
    private double radio;
    private final double pi = 3.14 ;
    //CONSTRUCTORES
    public Circulo() {
    
}
    public Circulo (double r){
        radio = r;
        
        
        
    }
    //METODOS DE ACCESO
    public void setRadio(double r){
    r = radio;
}
    public double getRadio(){
        return radio;
    }
    //METODOS
    public double calcularArea (){
        return pi*Math.pow(radio, 2);
    }
    public double calcularLonxitude (){
        return 2*pi*radio;
    }
}
