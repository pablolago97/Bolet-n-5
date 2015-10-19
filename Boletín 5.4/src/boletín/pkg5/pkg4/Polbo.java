/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg5.pkg4;

/**
 *
 * @author Pablo
 */
public class Polbo {
    //ATB
    private float polbo;
    private float patacas;
    //CONSTRUCTORES
    
    public Polbo(){
  
}
    public Polbo (float pol, float pat){
        polbo = pol;
        patacas = pat;
        
    }
    
    
    //SETTERS
    public void setPolbo (int x){
        polbo = polbo + x;
    }
    public void setPatacas (int y){
        patacas = patacas + y;
    }
    //GETTERS
    public float getPolbo (){
        return polbo;
    }
    public float getPatacas (){
        return patacas;
    }
    //METODOS
    public float Cantidade (float pol, float pat){
        return 0;
        
         }
    
        

}
