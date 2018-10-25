
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Castro
 */
public class Principal {

    
   
    public static void main(String[] args) {
      int limite =1000;
      int suma = 0;
        for (int i = 0; i < limite; i++) {
            if((i%3==0) || (i%5==0)){
                suma+=i;
                
            }
            
        }
        System.out.println(suma);
     
           
           
           
       
    }
    
    
    
}
