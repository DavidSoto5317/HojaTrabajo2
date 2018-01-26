/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo2;


import java.util.Scanner;

/**
 *
 * @author David y Oscar
 */
public class HojaTrabajo2 {   
    
    calculadora calcu = new nuestraCalculadora();
    
    public static void main(String[] args) {
       
        
        boolean power = true;  
        Scanner teclado = new Scanner(System.in);
        int decision;
        
                
        while (power){
            
            System.out.println("Bienvenido a la hoja de trabajo\n");
            System.out.println("Ingrese lo que quiere hacer:\n");                               
            
            decision = teclado.nextInt();
 
        }
        
        
    }
    
}
