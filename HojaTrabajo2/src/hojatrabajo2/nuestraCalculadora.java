/**
 * Clase en donde se implementa el programa.
 * @author: Oscar Juarez - 17315 / David Soto - 17551
 * @version: 2/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
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

    /**
     * Metodo que realiza la operacion de la calculadora
     * @param expresion: La/las lineas de codigo a evaluar
     * @return: El resultado de la linea a operar
     */
    public double operar(String expresion) {                                            
        
        for (int i = 0; i < expresion.length(); i++) {
            
            char character = expresion.charAt(i);                       
            
            //Condicion cuando el valor sea una letra
            if (Character.isLetter(character)){
                
                System.err.println("ERROR, LA LINEA TIENE UN CARACTER: " + character + "\n");        
                total=0;
                break;                
                
            //Condicion cuando el valor sea un operando
            } else if (Character.isDigit(character)) {
                
                if (miStack.empty()) {
                    
                    valor1 = (double) Character.digit(character, 10);                    
                    miStack.push(valor1);
                    
                } else if (miStack.size()==1){
                    
                    valor2 = (double) Character.digit(character, 10);                    
                    miStack.push(valor2);
                                        
                } else if (miStack.size()>1){
                    
                    System.err.println("ERROR, SE HA INGRESADO UN TERCER NUMERO / AUSENCIA DE UN OPERANDO\n");
                    total=0;
                    break;
                }
                
            //Condicion cuando el valor sea el simbolo de suma.
            } else if (String.valueOf(character).matches("[+]") && miStack.size()==2) {
                
                total = suma();
            
            //Condicion cuando el valor sea el simbolo de multiplicacion.
            } else if (String.valueOf(character).matches("[*]") && miStack.size()==2) {
               
                total = multiplicacion();
            
            //Condicion cuando el valor sea el simbolo de resta.
            } else if(String.valueOf(character).matches("[-]") && miStack.size()==2){
                
                total = resta();
                        
            //Condicion cuando el valor sea el simbolo de division.
            } else if(String.valueOf(character).matches("[/]") && miStack.peek()!=0){
        
                total = division();    
                
            //Condicion cuando se intenta dividir entre 0.
            } else if (String.valueOf(character).matches("[/]") && miStack.peek()==0) {
                
                total = 0;
                System.err.println("ERROR, NO SE PUEDE DIVIDIR ENTRE 0\n");
                break;
                
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
        
        double numero2 = miStack.pop();       
        
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
        
        double numero2 = miStack.pop();        
        
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
