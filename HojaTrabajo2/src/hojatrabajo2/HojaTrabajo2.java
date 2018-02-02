/**
 * Clase principal que se comunica con el usuario.
 * @author: Oscar Juarez - 17315 / David Soto - 17551
 * @version: 2/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */
package hojatrabajo2;


import java.io.*;
import java.util.Scanner;
import static java.lang.Double.isNaN;
import static java.lang.Double.isFinite;

/**
 *
 * @author David y Oscar
 */
public class HojaTrabajo2 {           
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String linea;        
        calculadora calcu = new nuestraCalculadora();
        
        //Direccion Oscar: C:\Users\Usuario\Documents\NetBeansProjects\HojaTrabajo2\HojaTrabajo2\src\hojatrabajo2\cadena.txt
        //Direccion Chino: C:\Users\User\Desktop\Netbeans\HojaTrabajo2\HojaTrabajo2\src\hojatrabajo2\cadena.txt
        
        //Se abre el archivo y se crea el BufferReader para poder leerlo.
        File archivo = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HojaTrabajo2\\HojaTrabajo2\\src\\hojatrabajo2\\cadena.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader (fr);        
                       
        boolean power = true;  
        Scanner teclado = new Scanner(System.in);
        int decision;   
        double resultado = 0;
                        
                        
        while (power){
            System.out.println("____________________________________");
            System.out.println("\nBienvenido a la hoja de trabajo\n");
            System.out.println("Ingrese lo que quiere hacer:\n");  
            System.out.println("1. Operar la cadena de texto");
            System.out.println("2. Salir del programa\n");
            
            decision = teclado.nextInt();
            
            if (decision==1){
                
                while((linea = br.readLine()) != null) {
                resultado = calcu.operar(linea);
                }

            System.out.println("El total es de: " + resultado + "\n");
                
            } else if (decision==2) {
                
                System.out.println("Saliendo del programa...");
                power = false;
                
                //Se cierra el fichero.
                if (null != fr){
                   fr.close();
                }
                
            }
        }
    }
    
}
