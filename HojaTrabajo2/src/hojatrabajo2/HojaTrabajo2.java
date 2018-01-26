/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo2;


import java.util.Scanner;
import java.io.*;

/**
 *
 * @author David y Oscar
 */
public class HojaTrabajo2 {   
    
    Calculadora calcu = new nuestraCalculadora();
    
    public static void main(String[] args) {
        
//        //Se abre el archivo y se crea el BufferReader para poder leerlo.
//        File archivo = null;
//        FileReader fr = null;
//        BufferedReader br = null;
//        
//        //Se lee el archivo
//        
//        String linea;
//        while((linea=br.readLine())!=null)
//        System.out.println(linea);
        
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
