/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo2;
import java.io.*;

/**
 *
 * @author Usuario
 */
public class nuestraCalculadora implements calculadora {
    
    Stack<Double> miStack = new StackArrayList<Double>();  
    
    double total;        
    private double valor1=0, valor2=0;
    double resultado;

    @Override
    public double operar(String expresion) {                                            
        
        for (int i = 0; i < expresion.length(); i++) {
            
            char character = expresion.charAt(i);                       
            
            //Condicion cuando el valor sea una letra
            if (Character.isLetter(character)){
                
                System.out.println("ERROR, LA LINEA TIENE UN CARACTER: " + character);
                
            //Condicion cuando el valor sea un operando
            } else if (Character.isDigit(character)) {
                
                if (miStack.size()==0) {
                    
                    valor1 = (double) Character.digit(character, 10);                    
                    miStack.push(valor1);
                    
                } else if (miStack.size()==1){
                    
                    valor2 = (double) Character.digit(character, 10);                    
                    miStack.push(valor2);
                                        
                }    
                
            //Condicion cuando el valor sea el simbolo de suma.
            } else if (String.valueOf(character).matches("[+]")) {
                
                total = suma();
                
            } else if (String.valueOf(character).matches("[*]")) {
               
                total = multiplicacion();
                
            } else if(String.valueOf(character).matches("[-]")){
                
                total = resta();
                
            } else if(String.valueOf(character).matches("[/]")){
        
                total = division();    
                
            }
        }                        
     
        return total;
        
    }
    
    /**
     * Metodo que suma dos valores dentro del stack
     * @return El resultado de la operacion
     */
    private double suma(){
        
        double numero1 = miStack.pop();
        //System.out.println("le hice pop al primer valor, y es: " + valor1);
        double numero2 = miStack.pop();
        //System.out.println("El segundo valor es de: " + valor2);
        
        resultado = numero1 + numero2;
        
        miStack.push(resultado);
        
        return resultado;
        
    }
    
    /**
     * Metodo que resta dos valores dentro del stack
     * @return El resultado de la operacion
     */
    private double resta(){
        
        double numero1 = miStack.pop();
        //System.out.println("le hice pop al primer valor, y es: " + valor1);
        double numero2 = miStack.pop();
        //System.out.println("El segundo valor es de: " + valor2);
        
        resultado = numero2 - numero1;
        
        miStack.push(resultado);
        
        return resultado;
        
    }
    
    /**
     * Metodo que multiplica dos valores del stack
     * @return El resultado de la operacion
     */
    private double multiplicacion(){
        
        double numero1 = miStack.pop();
        
        double numero2 = miStack.pop();        
        
        resultado = numero1 * numero2;
        
        miStack.push(resultado);
        
        return resultado;        
        
    }
    
    /**
     * Metodo que divide dos valores del stack
     * @return El resultado de la operacion
     */
    private double division(){
        
        double numero1 = miStack.pop();
        
        double numero2 = miStack.pop();        
        
        resultado = numero2 / numero1;
        
        miStack.push(resultado);
        
        return resultado;        
        
    }
    
}
