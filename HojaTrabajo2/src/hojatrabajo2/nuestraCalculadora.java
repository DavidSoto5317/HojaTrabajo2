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
public class nuestraCalculadora implements calculadora{
    
    Stack<Double> miStack = new StackArrayList<Double>();

    @Override
    public double operar(String expresion) {
     
        //Se abre el archivo y se crea el BufferReader para poder leerlo.
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        //Se lee el archivo
        
        String linea = "5 4 + 9 - 7 * 3 - 2 + 7 + 5 / 4 + 3 * 6 + 8 + ";                
        
        double numero;
        String caracter;
        
//        while((linea=br.readLine())!=null)
//        System.out.println(linea);
        
        for (int i = 0; i < archivo.length(); i++) {
        
            char aChar = linea.charAt(i);
            
            
        }
     
        return 0;
        
    }
    
    
    
    private double suma(){
        
        return 10;
        
    }
    
}
