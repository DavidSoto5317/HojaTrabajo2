/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo2;


import java.io.*;
import java.util.Scanner;

/**
 *
 * @author David y Oscar
 */
public class HojaTrabajo2 {           
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        calculadora calcu = new nuestraCalculadora();
        
        //Se abre el archivo y se crea el BufferReader para poder leerlo.
        File archivo = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HojaTrabajo2\\HojaTrabajo2\\src\\hojatrabajo2\\cadena.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader (fr);
        
        boolean power = true;  
        Scanner teclado = new Scanner(System.in);
        int decision;
        
        String linea = br.readLine();
                        
        while (power){
            System.out.println("____________________________________");
            System.out.println("\nBienvenido a la hoja de trabajo\n");
            System.out.println("Ingrese lo que quiere hacer:\n");  
            System.out.println("1. Operar la cadena de texto");
            System.out.println("2. Salir del programa\n");
            
            decision = teclado.nextInt();
            
            if (decision==1){
                
                double hola = calcu.operar(linea);
                
                System.out.println("El total es de: "+ hola);
                
            }
 
        }
        
        
    }
    
}
